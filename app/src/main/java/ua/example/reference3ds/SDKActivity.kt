package ua.example.reference3ds

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ul.emvco3ds.sdk.spec.*
import org.json.JSONArray
import org.json.JSONObject
import ua.example.reference3ds.util.LibUtil
import ua.privatbank.threeds2.impl.ChallengeParametersImp
import ua.privatbank.threeds2.impl.ConfigParamentersImpl
import ua.privatbank.threeds2.impl.PrivatBank3dsService
import ua.privatbank.threeds2.network.JSON
import ua.privatbank.threeds2.network.basePost
import java.text.SimpleDateFormat
import java.util.*


class SDKActivity : AppCompatActivity() {

    val messageVersion = "2.1.0"
    val authResultLabel get() = findViewById<TextView>(R.id.theText)
    val threeDsServerUrl = "https://3ds.test.liqpay.ua/3dss/client"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val configParameters: ConfigParameters = ConfigParamentersImpl()
        val privatBank3dsService = PrivatBank3dsService()
        privatBank3dsService.initialize(this, configParameters, "ru-RU", null)
        findViewById<View>(R.id.buttonPay).setOnClickListener {
            request(privatBank3dsService)
        }
    }

    private fun request(privatBank3dsService: PrivatBank3dsService) {
        val number = findViewById<EditText>(R.id.editAccountNumber).text
        val dir = if (number.startsWith("5")) "A000000004" else "A000000003"
        val transaction: Transaction = privatBank3dsService.createTransaction(dir, messageVersion)
        val progressView = transaction.getProgressView(this)

        progressView.show()

        val challengeParameters = ChallengeParametersImp()
        val auth = transaction.authenticationRequestParameters
        val pArq = buildPArq(auth)

        Log.d("ref-app", pArq.toString())

        fun toast(message: String) = runOnUiThread {
            progressView?.dismiss()
            findViewById<TextView>(R.id.theText).text = message
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        basePost(threeDsServerUrl, JSON, pArq.toString()).onSuccess {
            runOnUiThread {
                val json = JSONObject(it.body)
                challengeParameters.set3DSServerTransactionID(json.getString("threeDSServerTransID"))
                challengeParameters.acsTransactionID = json.optString("acsTransID")
                challengeParameters.acsRefNumber = json.optString("acsReferenceNumber")
                challengeParameters.acsSignedContent = json.optString("acsSignedContent")
                val acsSignedContent = challengeParameters.acsSignedContent

                val status = json.optString("transStatus")
                Log.d("ref-app", " status ")
                if (status == "A" || status == "Y") {
                    progressView.dismiss()
                } else if (acsSignedContent != null) {
                    transaction.doChallenge(
                        this, challengeParameters,
                        object : ChallengeStatusReceiver {
                            override fun completed(completionEvent: CompletionEvent) {
                                runOnUiThread {
                                    progressView?.dismiss()
                                    authResultLabel.text =
                                        "3DS Status: " +
                                                if (completionEvent.transactionStatus == "Y") "Success"
                                                else "Failed"
                                }
                            }

                            override fun cancelled() = toast("Authentication is cancelled")

                            override fun timedout() = toast("Timeout error")

                            override fun protocolError(protocolErrorEvent: ProtocolErrorEvent?) =
                                toast("Protocol error: ${protocolErrorEvent?.errorMessage}")

                            override fun runtimeError(runtimeErrorEvent: RuntimeErrorEvent?) =
                                toast("Runtime error: ${runtimeErrorEvent?.errorMessage}")
                        },
                        5
                    )
                } else {
                    progressView?.dismiss()
                    authResultLabel.text = "Not Authenticated/ Verified"
                }
                Log.d("ref-app", it.body)
            }
        }.onError {
            runOnUiThread {
                progressView.dismiss()
                toast(it.javaClass.name)
            }
            it.printStackTrace()
        }
    }

    private fun buildPArq(auth: AuthenticationRequestParameters): JSONObject {
        val purchaseAmount: String = findViewById<EditText>(R.id.editPurchaseAmount).text.toString()
        val purchaseAmountFormatted =
            LibUtil.formatAmount(purchaseAmount.toDouble(), 2).replace(Regex("^0+"), "")
        val purchaseCurrency: String =
            findViewById<Spinner>(R.id.editPurchaseCurrency).selectedItem.toString()
        val purchaseCurrencyFormatted =
            if (purchaseCurrency == "UAH") "980"
            else if (purchaseCurrency == "EUR") "978"
            else if (purchaseCurrency == "USD") "840"
            else "980"

        return JSONObject().apply {
            put("messageCategory", "01")
            put("threeDSRequestorAuthenticationInd", "01")
            put("addrMatch", "Y")
            put("messageType", "pArq")
            put("sdkReferenceNumber", auth.sdkReferenceNumber)
            put("acquirerMerchantID", "I0110020")
            put("sdkAppID", auth.sdkAppID)
            put("deviceChannel", "01")
            put("purchaseExponent", "2")
            put("transType", "01")
            put("acctType", "02")
            put("purchaseDate", SimpleDateFormat("yyyyMMddHHmmss").format(Date()))
            put("threeDSServerRefNumber", "V3DSTestSuite-12345678")
            put("purchaseCurrency", purchaseCurrencyFormatted)
            put("acctNumber", "${findViewById<EditText>(R.id.editAccountNumber).text}")
            put("cardExpiryDate", "${findViewById<EditText>(R.id.editExpDate).text}")
            put("cvv", findViewById<EditText>(R.id.editCvv).text)
            put("sdkEphemPubKey", JSONObject(auth.sdkEphemeralPublicKey))
            put("threeDSRequestorURL", "https://3ds.liqpay.ua")
            put("messageVersion", messageVersion)
            put("sdkTransID", auth.sdkTransactionID)
            put("email", "${findViewById<EditText>(R.id.editCardholderEmail).text}")
            put("sdkMaxTimeout", "05")
            put("purchaseAmount", purchaseAmountFormatted)
            put("threeDSRequestorChallengeInd", "01")
            put("cardholderName", "${findViewById<EditText>(R.id.editCardholderName).text}")
            put("sdkEncData", auth.deviceData)
            put(
                "deviceRenderOptions", JSONObject()
                    .put("sdkInterface", "03").put(
                        "sdkUiType", JSONArray()
                            .put("01")
                            .put("02")
                            .put("03")
                            .put("04")
                            .put("05")
                    )
            )
        }
    }


}
