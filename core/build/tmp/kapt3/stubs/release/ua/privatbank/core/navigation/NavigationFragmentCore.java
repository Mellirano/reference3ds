package ua.privatbank.core.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ua.privatbank.core.base.BaseFragment;
import ua.privatbank.core.logger.LoggerFactory;
import kotlin.properties.Delegates;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010J\u001a\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015J,\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010\u0019\u001a\u00020\f\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015J&\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lua/privatbank/core/navigation/NavigationFragmentCore;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "routerId", "", "(Landroidx/fragment/app/FragmentManager;I)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getRouterId", "()I", "back", "", "backTo", "", "dest", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/Fragment;", "backWithResult", "T", "result", "Lua/privatbank/core/navigation/NavResult;", "closeTag", "tag", "", "closeTagWithResult", "navigateTo", "config", "Lua/privatbank/core/navigation/Config;", "anim", "Lua/privatbank/core/navigation/Anim;", "core_release"})
public final class NavigationFragmentCore {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    private final int routerId = 0;
    
    public NavigationFragmentCore(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, int routerId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    public final int getRouterId() {
        return 0;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment dest, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Config config, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Anim anim) {
    }
    
    public final void back() {
    }
    
    public final boolean backTo(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> dest) {
        return false;
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result) {
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result, @org.jetbrains.annotations.Nullable()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> dest) {
    }
    
    public final void closeTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final <T extends java.lang.Object>void closeTagWithResult(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result) {
    }
}