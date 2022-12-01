package ua.privatbank.core.network.errors;

import java.lang.System;

/**
 * Base exception for `confirmcore` and `auth` modules
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/network/errors/ConfirmcoreException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorMessage", "Lua/privatbank/core/network/errors/Message;", "source", "Lua/privatbank/core/network/errors/Source;", "cause", "", "(Lua/privatbank/core/network/errors/Message;Lua/privatbank/core/network/errors/Source;Ljava/lang/Throwable;)V", "getErrorMessage", "()Lua/privatbank/core/network/errors/Message;", "getSource", "()Lua/privatbank/core/network/errors/Source;", "core_debug"})
public abstract class ConfirmcoreException extends java.lang.Exception {
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.network.errors.Message errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.errors.Source source = null;
    
    public ConfirmcoreException(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.Message errorMessage, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Source source, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.network.errors.Message getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.Source getSource() {
        return null;
    }
}