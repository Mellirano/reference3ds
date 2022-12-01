package ua.privatbank.core.utils;

import android.os.Bundle;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/utils/AppCircleLifeHelper;", "", "()V", "launchTime", "", "isAppRestarted", "", "bundle", "Landroid/os/Bundle;", "onAppLaunch", "", "restoreState", "action", "Lkotlin/Function0;", "saveState", "Companion", "core_debug"})
public final class AppCircleLifeHelper {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.AppCircleLifeHelper.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_LAUNCH_TIME = "lastLaunchTime";
    private long launchTime = 0L;
    
    public AppCircleLifeHelper() {
        super();
    }
    
    public final void onAppLaunch() {
    }
    
    public final void saveState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public final void restoreState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final boolean isAppRestarted(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/utils/AppCircleLifeHelper$Companion;", "", "()V", "LAST_LAUNCH_TIME", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}