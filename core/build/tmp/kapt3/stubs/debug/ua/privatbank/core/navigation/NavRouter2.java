package ua.privatbank.core.navigation;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import ua.privatbank.core.base.BaseViewModel;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0004J\u001d\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\u0004J$\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0011\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0004J\"\u0010\u001d\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019J4\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0015H\u0002J$\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001c2\b\u0010-\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010.\u001a\u00020+J\u0011\u0010*\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0004J>\u0010*\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100JB\u00101\u001a\u00020\u00122\u0006\u0010 \u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020+H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00063"}, d2 = {"Lua/privatbank/core/navigation/NavRouter2;", "", "context", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "routerId", "", "viewModel", "Lua/privatbank/core/base/BaseViewModel;", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;ILua/privatbank/core/base/BaseViewModel;)V", "getContext", "()Landroid/app/Activity;", "navFragCore", "Lua/privatbank/core/navigation/NavigationFragmentCore;", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "back", "", "backTo", "dest", "Lua/privatbank/core/navigation/NavKey;", "backWithResult", "T", "result", "Lua/privatbank/core/navigation/NavResult;", "closeTag", "tag", "", "closeTagWithResult", "createFragment", "Landroidx/fragment/app/Fragment;", "node", "Lua/privatbank/core/navigation/Node;", "input", "Ljava/io/Serializable;", "jsonInput", "config", "Lua/privatbank/core/navigation/Config;", "getNode", "Lua/privatbank/core/navigation/BaseNode;", "navKey", "navigateTo", "", "serviceName", "data", "isDeeplinkSource", "anim", "Lua/privatbank/core/navigation/Anim;", "runNode", "fromDeeplink", "core_debug"})
public final class NavRouter2 {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.base.BaseViewModel viewModel = null;
    private final ua.privatbank.core.navigation.NavigationFragmentCore navFragCore = null;
    
    public NavRouter2(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, int routerId, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.base.BaseViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest) {
    }
    
    public final boolean navigateTo(@org.jetbrains.annotations.Nullable()
    java.lang.String serviceName, @org.jetbrains.annotations.Nullable()
    java.lang.String data, boolean isDeeplinkSource) {
        return false;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest, @org.jetbrains.annotations.Nullable()
    java.io.Serializable input, @org.jetbrains.annotations.Nullable()
    java.lang.String jsonInput, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Config config, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Anim anim) {
    }
    
    private final void runNode(ua.privatbank.core.navigation.BaseNode node, java.io.Serializable input, java.lang.String jsonInput, ua.privatbank.core.navigation.Config config, ua.privatbank.core.navigation.Anim anim, boolean fromDeeplink) {
    }
    
    public final void back() {
    }
    
    public final void backTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest) {
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result) {
    }
    
    public final <T extends java.lang.Object>void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<T> result, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.NavKey dest) {
    }
    
    private final ua.privatbank.core.navigation.BaseNode getNode(ua.privatbank.core.navigation.NavKey navKey) {
        return null;
    }
    
    private final androidx.fragment.app.Fragment createFragment(ua.privatbank.core.navigation.Node node, java.io.Serializable input, java.lang.String jsonInput, ua.privatbank.core.navigation.Config config) {
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