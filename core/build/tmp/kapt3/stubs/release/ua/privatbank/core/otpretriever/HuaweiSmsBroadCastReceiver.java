package ua.privatbank.core.otpretriever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.sms.common.ReadSmsConstant;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/otpretriever/HuaweiSmsBroadCastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "core_release"})
public final class HuaweiSmsBroadCastReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.otpretriever.HuaweiSmsBroadCastReceiver.Companion Companion = null;
    private static ua.privatbank.core.otpretriever.OtpListener otpListener;
    
    public HuaweiSmsBroadCastReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/otpretriever/HuaweiSmsBroadCastReceiver$Companion;", "", "()V", "otpListener", "Lua/privatbank/core/otpretriever/OtpListener;", "bindListener", "", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void bindListener(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.otpretriever.OtpListener otpListener) {
        }
    }
}