package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ.\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lua/privatbank/core/navigation/Route;", "", "screen", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/Fragment;", "inputData", "Ljava/io/Serializable;", "jsonInputData", "", "analytics", "Lua/privatbank/core/navigation/AnalyticsInfo;", "anim", "Lua/privatbank/core/navigation/Anim;", "config", "Lua/privatbank/core/navigation/Config;", "(Lkotlin/reflect/KClass;Ljava/io/Serializable;Ljava/lang/String;Lua/privatbank/core/navigation/AnalyticsInfo;Lua/privatbank/core/navigation/Anim;Lua/privatbank/core/navigation/Config;)V", "getAnalytics", "()Lua/privatbank/core/navigation/AnalyticsInfo;", "getAnim", "()Lua/privatbank/core/navigation/Anim;", "getConfig", "()Lua/privatbank/core/navigation/Config;", "getInputData", "()Ljava/io/Serializable;", "getJsonInputData", "()Ljava/lang/String;", "getScreen", "()Lkotlin/reflect/KClass;", "nestedRoute", "logView", "core_debug"})
public class Route {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> screen = null;
    @org.jetbrains.annotations.Nullable()
    private final java.io.Serializable inputData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String jsonInputData = null;
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.navigation.AnalyticsInfo analytics = null;
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.navigation.Anim anim = null;
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.navigation.Config config = null;
    
    public Route(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> screen, @org.jetbrains.annotations.Nullable()
    java.io.Serializable inputData, @org.jetbrains.annotations.Nullable()
    java.lang.String jsonInputData, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo analytics, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Anim anim, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Config config) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> getScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.Serializable getInputData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJsonInputData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.navigation.AnalyticsInfo getAnalytics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.navigation.Anim getAnim() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.navigation.Config getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.Route nestedRoute(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> screen, @org.jetbrains.annotations.Nullable()
    java.io.Serializable inputData, @org.jetbrains.annotations.Nullable()
    java.lang.String logView) {
        return null;
    }
}