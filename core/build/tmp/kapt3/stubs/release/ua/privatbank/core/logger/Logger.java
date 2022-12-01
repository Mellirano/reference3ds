package ua.privatbank.core.logger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\u0012"}, d2 = {"Lua/privatbank/core/logger/Logger;", "", "d", "", "object", "message", "", "e", "throwable", "", "i", "json", "logWithTrace", "data", "t", "tag", "v", "w", "core_release"})
public abstract interface Logger {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.privatbank.core.logger.Logger t(@org.jetbrains.annotations.Nullable()
    java.lang.String tag);
    
    public abstract void d(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void d(@org.jetbrains.annotations.Nullable()
    java.lang.Object object);
    
    public abstract void e(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void e(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void e(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
    
    public abstract void w(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void i(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void v(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    /**
     * Formats the given json content and print it
     */
    public abstract void json(@org.jetbrains.annotations.Nullable()
    java.lang.String json);
    
    public abstract void logWithTrace(@org.jetbrains.annotations.Nullable()
    java.lang.String data);
}