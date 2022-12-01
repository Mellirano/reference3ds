package ua.privatbank.core.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatDelegate;
import io.reactivex.plugins.RxJavaPlugins;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.utils.AppCircleLifeHelper;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/base/CoreApplication;", "Landroid/content/ContextWrapper;", "()V", "appCircleLifeHelper", "Lua/privatbank/core/utils/AppCircleLifeHelper;", "getAppCircleLifeHelper", "()Lua/privatbank/core/utils/AppCircleLifeHelper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "attachContext", "", "context", "Landroid/content/Context;", "onCreated", "Companion", "core_debug"})
public final class CoreApplication extends android.content.ContextWrapper {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.base.CoreApplication.Companion Companion = null;
    private static final java.lang.String P24_PREFERENCES_KEY = "p24_preferences";
    @org.jetbrains.annotations.NotNull()
    private static final ua.privatbank.core.base.CoreApplication instance = null;
    public android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.AppCircleLifeHelper appCircleLifeHelper = null;
    
    public CoreApplication() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.base.CoreApplication getInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.AppCircleLifeHelper getAppCircleLifeHelper() {
        return null;
    }
    
    public final void attachContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void onCreated(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/base/CoreApplication$Companion;", "", "()V", "P24_PREFERENCES_KEY", "", "instance", "Lua/privatbank/core/base/CoreApplication;", "getInstance$annotations", "getInstance", "()Lua/privatbank/core/base/CoreApplication;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.base.CoreApplication getInstance() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getInstance$annotations() {
        }
    }
}