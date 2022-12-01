package ua.privatbank.core.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import ua.privatbank.core.base.BaseViewModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0004J\u001d\u0010\u0019\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cH\u0086\u0004J$\u0010\u0019\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0011\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0086\u0004J\"\u0010 \u001a\u00020\u0014\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0011\u0010#\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006$"}, d2 = {"Lua/privatbank/core/navigation/NavRouter;", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "routerId", "", "viewModel", "Lua/privatbank/core/base/BaseViewModel;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;ILua/privatbank/core/base/BaseViewModel;)V", "getContext", "()Landroid/content/Context;", "navFragCore", "Lua/privatbank/core/navigation/NavigationFragmentCore;", "getRouterId", "()I", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "back", "", "backTo", "", "dest", "Lua/privatbank/core/navigation/Route;", "backWithResult", "T", "result", "Lua/privatbank/core/navigation/NavResult;", "closeTag", "tag", "", "closeTagWithResult", "createFragment", "Landroidx/fragment/app/Fragment;", "navigateTo", "core_debug"})
public final class NavRouter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final int routerId = 0;
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.base.BaseViewModel viewModel = null;
    private final ua.privatbank.core.navigation.NavigationFragmentCore navFragCore = null;
    
    public NavRouter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, int routerId, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.base.BaseViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getRouterId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.Route dest) {
    }
    
    public final void back() {
    }
    
    public final boolean backTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.Route dest) {
        return false;
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result) {
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Route dest) {
    }
    
    private final androidx.fragment.app.Fragment createFragment(ua.privatbank.core.navigation.Route dest) {
        return null;
    }
    
    public final void closeTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final <T extends java.lang.Object>void closeTagWithResult(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result) {
    }
}