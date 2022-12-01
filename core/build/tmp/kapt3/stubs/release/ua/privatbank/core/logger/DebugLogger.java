package ua.privatbank.core.logger;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.PrettyFormatStrategy;
import java.io.PrintWriter;
import java.io.StringWriter;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\u0005J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lua/privatbank/core/logger/DebugLogger;", "Lua/privatbank/core/logger/Logger;", "()V", "localTag", "Ljava/lang/ThreadLocal;", "", "d", "", "object", "", "message", "e", "throwable", "", "getLocalTag", "i", "json", "logWithTrace", "data", "t", "tag", "v", "w", "Companion", "core_release"})
public final class DebugLogger implements ua.privatbank.core.logger.Logger {
    private final java.lang.ThreadLocal<java.lang.String> localTag = null;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.logger.DebugLogger.Companion Companion = null;
    private static final java.lang.String CHANNELS_TAG = "P24_CORE";
    private static boolean isLog = true;
    
    public DebugLogger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.logger.Logger t(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalTag() {
        return null;
    }
    
    @java.lang.Override()
    public void d(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void d(@org.jetbrains.annotations.Nullable()
    java.lang.Object object) {
    }
    
    @java.lang.Override()
    public void e(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void e(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void e(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void w(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void i(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void v(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void json(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
    }
    
    @java.lang.Override()
    public void logWithTrace(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/logger/DebugLogger$Companion;", "", "()V", "CHANNELS_TAG", "", "isLog", "", "()Z", "setLog", "(Z)V", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isLog() {
            return false;
        }
        
        public final void setLog(boolean p0) {
        }
    }
}