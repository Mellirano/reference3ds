package ua.privatbank.core.logger;

import java.io.PrintWriter;
import java.io.StringWriter;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0013\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lua/privatbank/core/logger/TestLogger;", "Lua/privatbank/core/logger/Logger;", "()V", "tag", "", "d", "", "obj", "", "message", "e", "throwable", "", "i", "json", "logWithTrace", "data", "printMess", "any", "t", "v", "w", "core_debug"})
public final class TestLogger implements ua.privatbank.core.logger.Logger {
    private java.lang.String tag = "";
    
    public TestLogger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.logger.Logger t(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        return null;
    }
    
    @java.lang.Override()
    public void d(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void d(@org.jetbrains.annotations.Nullable()
    java.lang.Object obj) {
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
    
    private final void printMess(java.lang.String tag, java.lang.Object any) {
    }
}