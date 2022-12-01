package ua.privatbank.core.otpretriever;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.huawei.hms.support.sms.ReadSmsManager;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/otpretriever/OtpAutoFillReceiver;", "", "context", "Landroid/content/Context;", "otpListener", "Lua/privatbank/core/otpretriever/OtpListener;", "(Landroid/content/Context;Lua/privatbank/core/otpretriever/OtpListener;)V", "start", "", "activity", "Landroid/app/Activity;", "core_release"})
public final class OtpAutoFillReceiver {
    private android.content.Context context;
    private ua.privatbank.core.otpretriever.OtpListener otpListener;
    
    public OtpAutoFillReceiver(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.otpretriever.OtpListener otpListener) {
        super();
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}