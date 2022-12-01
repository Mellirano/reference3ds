package ua.privatbank.core.utils;

import androidx.lifecycle.MutableLiveData;
import ua.privatbank.core.navigation.NavKey;
import ua.privatbank.core.network.errors.ErrorManager;
import ua.privatbank.core.network.errors.Message;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u00f3\u0001\u0012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\'\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$\u00a8\u0006,"}, d2 = {"Lua/privatbank/core/utils/ValueDataHolder;", "T", "", "successCallback", "Lkotlin/Function1;", "", "success", "Landroidx/lifecycle/MutableLiveData;", "progress", "", "fail", "Lua/privatbank/core/network/errors/Message;", "failCallback", "cancel", "redirect", "", "errorManager", "Lua/privatbank/core/network/errors/ErrorManager;", "cancelCallback", "Lkotlin/Function0;", "progressCallback", "errorCallback", "navigationCallback", "Lkotlin/Function2;", "Lua/privatbank/core/navigation/NavKey;", "Ljava/io/Serializable;", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lua/privatbank/core/network/errors/ErrorManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getCancel", "()Landroidx/lifecycle/MutableLiveData;", "getCancelCallback", "()Lkotlin/jvm/functions/Function0;", "getErrorCallback", "getErrorManager", "()Lua/privatbank/core/network/errors/ErrorManager;", "getFail", "getFailCallback", "()Lkotlin/jvm/functions/Function1;", "getNavigationCallback", "()Lkotlin/jvm/functions/Function2;", "getProgress", "getProgressCallback", "getRedirect", "getSuccess", "getSuccessCallback", "core_release"})
public final class ValueDataHolder<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> successCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<T> success = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> fail = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<ua.privatbank.core.network.errors.Message, kotlin.Unit> failCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> cancel = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> redirect = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.errors.ErrorManager errorManager = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> cancelCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> progressCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> errorCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function2<ua.privatbank.core.navigation.NavKey, java.io.Serializable, kotlin.Unit> navigationCallback = null;
    
    public ValueDataHolder(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> successCallback, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<T> success, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> fail, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.errors.Message, kotlin.Unit> failCallback, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<kotlin.Unit> cancel, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> redirect, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.ErrorManager errorManager, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> cancelCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> progressCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> errorCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super ua.privatbank.core.navigation.NavKey, ? super java.io.Serializable, kotlin.Unit> navigationCallback) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getSuccessCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<T> getSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> getFail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<ua.privatbank.core.network.errors.Message, kotlin.Unit> getFailCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getCancel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRedirect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.ErrorManager getErrorManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCancelCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getProgressCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getErrorCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function2<ua.privatbank.core.navigation.NavKey, java.io.Serializable, kotlin.Unit> getNavigationCallback() {
        return null;
    }
}