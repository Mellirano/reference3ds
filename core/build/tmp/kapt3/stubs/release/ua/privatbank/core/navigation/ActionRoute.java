package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/navigation/ActionRoute;", "Lua/privatbank/core/navigation/Route;", "defaultScreen", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/Fragment;", "json", "", "(Lkotlin/reflect/KClass;Ljava/lang/String;)V", "getDefaultScreen", "()Lkotlin/reflect/KClass;", "getJson", "()Ljava/lang/String;", "action", "", "helper", "Lua/privatbank/core/navigation/ActionHelper;", "core_release"})
public abstract class ActionRoute extends ua.privatbank.core.navigation.Route {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> defaultScreen = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String json = null;
    
    public ActionRoute() {
        super(null, null, null, null, null, null);
    }
    
    public ActionRoute(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> defaultScreen, @org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        super(null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> getDefaultScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJson() {
        return null;
    }
    
    public abstract void action(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.ActionHelper helper);
}