package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import ua.privatbank.core.base.BaseViewModel;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0004J\u0015\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0004J\u001a\u0010\u000f\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0004J>\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lua/privatbank/core/navigation/ViewModelRouter2;", "", "viewModel", "Lua/privatbank/core/base/BaseViewModel;", "(Lua/privatbank/core/base/BaseViewModel;)V", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "back", "", "backTo", "dest", "Lua/privatbank/core/navigation/NavKey;", "backWithResult", "result", "Lua/privatbank/core/navigation/NavResult;", "backWithResultTo", "navigateTo", "input", "Ljava/io/Serializable;", "jsonInput", "", "config", "Lua/privatbank/core/navigation/Config;", "anim", "Lua/privatbank/core/navigation/Anim;", "core_release"})
public final class ViewModelRouter2 {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.base.BaseViewModel viewModel = null;
    
    public ViewModelRouter2(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.BaseViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest) {
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest, @org.jetbrains.annotations.Nullable()
    java.io.Serializable input, @org.jetbrains.annotations.Nullable()
    java.lang.String jsonInput, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Config config, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.Anim anim) {
    }
    
    public final void back() {
    }
    
    public final void backTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest) {
    }
    
    public final void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<?> result) {
    }
    
    public final void backWithResultTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<?> result, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey dest) {
    }
}