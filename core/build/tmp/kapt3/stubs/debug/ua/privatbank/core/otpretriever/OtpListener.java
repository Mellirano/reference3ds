package ua.privatbank.core.otpretriever;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/otpretriever/OtpListener;", "", "onError", "", "errorMessage", "", "onFailureRetriever", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "message", "onTimeout", "core_debug"})
public abstract interface OtpListener {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage);
    
    public abstract void onFailureRetriever(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e);
    
    public abstract void onTimeout();
}