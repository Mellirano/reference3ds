package ua.privatbank.core.navigation;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Single;
import ua.privatbank.core.base.BaseViewModel;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import java.io.Serializable;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u0004\u0018\u0001H\u0017\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0086\b\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ0\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u00020\u001c0 H\u0007J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lua/privatbank/core/navigation/ActionHelper;", "", "viewModel", "Lua/privatbank/core/base/BaseViewModel;", "input", "Ljava/io/Serializable;", "json", "", "activity", "Landroid/app/Activity;", "fromDeeplink", "", "(Lua/privatbank/core/base/BaseViewModel;Ljava/io/Serializable;Ljava/lang/String;Landroid/app/Activity;Z)V", "getActivity", "()Landroid/app/Activity;", "getFromDeeplink", "()Z", "getInput", "()Ljava/io/Serializable;", "getJson", "()Ljava/lang/String;", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "T", "()Ljava/lang/Object;", "getJsonAsMap", "", "request", "", "single", "Lio/reactivex/Single;", "onSuccess", "Lkotlin/Function1;", "router", "Lua/privatbank/core/navigation/ViewModelRouter;", "router2", "Lua/privatbank/core/navigation/ViewModelRouter2;", "core_release"})
public final class ActionHelper {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.base.BaseViewModel viewModel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.io.Serializable input = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String json = null;
    @org.jetbrains.annotations.Nullable()
    private final android.app.Activity activity = null;
    private final boolean fromDeeplink = false;
    
    public ActionHelper(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.BaseViewModel viewModel, @org.jetbrains.annotations.Nullable()
    java.io.Serializable input, @org.jetbrains.annotations.Nullable()
    java.lang.String json, @org.jetbrains.annotations.Nullable()
    android.app.Activity activity, boolean fromDeeplink) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.Serializable getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final boolean getFromDeeplink() {
        return false;
    }
    
    @java.lang.Deprecated()
    public final <T extends java.lang.Object>void request(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> single, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.ViewModelRouter router() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.ViewModelRouter2 router2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getJsonAsMap() {
        return null;
    }
}