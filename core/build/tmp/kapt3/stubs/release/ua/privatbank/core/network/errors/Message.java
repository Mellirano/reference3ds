package ua.privatbank.core.network.errors;

import android.content.Context;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/network/errors/Message;", "Ljava/io/Serializable;", "()V", "getMessageString", "", "context", "Landroid/content/Context;", "MessageWithErrorCode", "MessageWithThrowable", "Plain", "PluralRes", "Res", "ResString", "Lua/privatbank/core/network/errors/Message$MessageWithErrorCode;", "Lua/privatbank/core/network/errors/Message$MessageWithThrowable;", "Lua/privatbank/core/network/errors/Message$Plain;", "Lua/privatbank/core/network/errors/Message$PluralRes;", "Lua/privatbank/core/network/errors/Message$Res;", "Lua/privatbank/core/network/errors/Message$ResString;", "core_release"})
public abstract class Message implements java.io.Serializable {
    
    private Message() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageString(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/network/errors/Message$Plain;", "Lua/privatbank/core/network/errors/Message;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "core_release"})
    public static final class Plain extends ua.privatbank.core.network.errors.Message {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Plain(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/network/errors/Message$Res;", "Lua/privatbank/core/network/errors/Message;", "messageFromRes", "", "arguments", "", "", "(I[Ljava/lang/Object;)V", "getArguments", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getMessageFromRes", "()I", "core_release"})
    public static final class Res extends ua.privatbank.core.network.errors.Message {
        private final int messageFromRes = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object[] arguments = null;
        
        public Res(int messageFromRes, @org.jetbrains.annotations.NotNull()
        java.lang.Object... arguments) {
            super();
        }
        
        public final int getMessageFromRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001b\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/network/errors/Message$PluralRes;", "Lua/privatbank/core/network/errors/Message;", "messageFromRes", "", "quantity", "arguments", "", "", "(II[Ljava/lang/Object;)V", "getArguments", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getMessageFromRes", "()I", "getQuantity", "core_release"})
    public static final class PluralRes extends ua.privatbank.core.network.errors.Message {
        private final int messageFromRes = 0;
        private final int quantity = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object[] arguments = null;
        
        public PluralRes(int messageFromRes, int quantity, @org.jetbrains.annotations.NotNull()
        java.lang.Object... arguments) {
            super();
        }
        
        public final int getMessageFromRes() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] getArguments() {
            return null;
        }
    }
    
    /**
     * resourceString - 1st priority
     * defaultMessageString - 2nd priority, we use it if `resourceString` is absent
     * defaultTextRes - 3nd priority, we use it if both `resourceString` and `defaultMessageString` are absent
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/network/errors/Message$ResString;", "Lua/privatbank/core/network/errors/Message;", "resourceString", "", "defaultMessageString", "defaultTextRes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDefaultMessageString", "()Ljava/lang/String;", "getDefaultTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResourceString", "core_release"})
    public static final class ResString extends ua.privatbank.core.network.errors.Message {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String resourceString = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultMessageString = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer defaultTextRes = null;
        
        public ResString(@org.jetbrains.annotations.NotNull()
        java.lang.String resourceString, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultMessageString, @org.jetbrains.annotations.Nullable()
        java.lang.Integer defaultTextRes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResourceString() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultMessageString() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDefaultTextRes() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/network/errors/Message$MessageWithErrorCode;", "Lua/privatbank/core/network/errors/Message;", "originalMessage", "errorCode", "", "(Lua/privatbank/core/network/errors/Message;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getOriginalMessage", "()Lua/privatbank/core/network/errors/Message;", "core_release"})
    public static final class MessageWithErrorCode extends ua.privatbank.core.network.errors.Message {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.network.errors.Message originalMessage = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorCode = null;
        
        public MessageWithErrorCode(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.errors.Message originalMessage, @org.jetbrains.annotations.NotNull()
        java.lang.String errorCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.network.errors.Message getOriginalMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/network/errors/Message$MessageWithThrowable;", "Lua/privatbank/core/network/errors/Message;", "originalMessage", "throwable", "", "(Lua/privatbank/core/network/errors/Message;Ljava/lang/Throwable;)V", "getOriginalMessage", "()Lua/privatbank/core/network/errors/Message;", "getThrowable", "()Ljava/lang/Throwable;", "core_release"})
    public static final class MessageWithThrowable extends ua.privatbank.core.network.errors.Message {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.network.errors.Message originalMessage = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        
        public MessageWithThrowable(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.errors.Message originalMessage, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.network.errors.Message getOriginalMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
            return null;
        }
    }
}