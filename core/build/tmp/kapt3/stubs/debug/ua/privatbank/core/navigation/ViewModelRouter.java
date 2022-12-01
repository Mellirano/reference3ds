package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import ua.privatbank.core.base.BaseViewModel;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0004J\u0015\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0004J\u001a\u0010\u000f\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lua/privatbank/core/navigation/ViewModelRouter;", "", "viewModel", "Lua/privatbank/core/base/BaseViewModel;", "(Lua/privatbank/core/base/BaseViewModel;)V", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "back", "", "backTo", "route", "Lua/privatbank/core/navigation/Route;", "backWithResult", "result", "Lua/privatbank/core/navigation/NavResult;", "backWithResultTo", "navigateTo", "core_debug"})
public final class ViewModelRouter {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.base.BaseViewModel viewModel = null;
    
    public ViewModelRouter(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.BaseViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.Route route) {
    }
    
    public final void back() {
    }
    
    public final void backTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.Route route) {
    }
    
    public final void backWithResult(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<?> result) {
    }
    
    public final void backWithResultTo(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavResult<?> result, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.Route route) {
    }
}