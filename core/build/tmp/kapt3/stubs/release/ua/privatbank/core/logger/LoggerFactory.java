package ua.privatbank.core.logger;

import androidx.annotation.VisibleForTesting;
import ua.privatbank.core.BuildConfig;
import ua.privatbank.core.base.CoreApplication;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/logger/LoggerFactory;", "", "()V", "_instance", "Lua/privatbank/core/logger/Logger;", "instance", "getInstance", "()Lua/privatbank/core/logger/Logger;", "value", "", "logEnable", "getLogEnable", "()Z", "setLogEnable", "(Z)V", "isLogEnable", "reInit", "", "toTestMode", "core_release"})
public final class LoggerFactory {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.logger.LoggerFactory INSTANCE = null;
    private static boolean logEnable = false;
    private static ua.privatbank.core.logger.Logger _instance;
    
    private LoggerFactory() {
        super();
    }
    
    public final void setLogEnable(boolean value) {
    }
    
    public final boolean getLogEnable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.logger.Logger getInstance() {
        return null;
    }
    
    public final void reInit() {
    }
    
    public final boolean isLogEnable() {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void toTestMode() {
    }
}