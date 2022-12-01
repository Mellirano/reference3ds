package ua.privatbank.core.network.errors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/network/errors/AuthException;", "Lua/privatbank/core/network/errors/ConfirmcoreException;", "errorMessage", "Lua/privatbank/core/network/errors/Message;", "cause", "", "(Lua/privatbank/core/network/errors/Message;Ljava/lang/Throwable;)V", "core_debug"})
public abstract class AuthException extends ua.privatbank.core.network.errors.ConfirmcoreException {
    
    public AuthException() {
        super(null, null, null);
    }
    
    public AuthException(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.Message errorMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super(null, null, null);
    }
}