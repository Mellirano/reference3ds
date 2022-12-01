package ua.privatbank.core.otpretriever;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/otpretriever/OtpListenerAdapter;", "Lua/privatbank/core/otpretriever/OtpListener;", "()V", "onError", "", "errorMessage", "", "onFailureRetriever", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "message", "onTimeout", "core_debug"})
public class OtpListenerAdapter implements ua.privatbank.core.otpretriever.OtpListener {
    
    public OtpListenerAdapter() {
        super();
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onTimeout() {
    }
    
    @java.lang.Override()
    public void onFailureRetriever(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
}