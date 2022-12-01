package ua.privatbank.core.utils;

import androidx.lifecycle.MutableLiveData;
import ua.privatbank.core.navigation.NavKey;
import ua.privatbank.core.network.errors.ErrorManager;
import ua.privatbank.core.network.errors.Message;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lua/privatbank/core/utils/DataHolder;", "", "successCallback", "Lkotlin/Function0;", "", "success", "Landroidx/lifecycle/MutableLiveData;", "progress", "", "fail", "Lua/privatbank/core/network/errors/Message;", "cancel", "errorManager", "Lua/privatbank/core/network/errors/ErrorManager;", "cancelCallback", "errorCallback", "onFinishCallback", "(Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lua/privatbank/core/network/errors/ErrorManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCancel", "()Landroidx/lifecycle/MutableLiveData;", "getCancelCallback", "()Lkotlin/jvm/functions/Function0;", "getErrorCallback", "getErrorManager", "()Lua/privatbank/core/network/errors/ErrorManager;", "getFail", "getOnFinishCallback", "getProgress", "getSuccess", "getSuccessCallback", "core_release"})
public final class DataHolder {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> successCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> success = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> fail = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> cancel = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.errors.ErrorManager errorManager = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> cancelCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> errorCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onFinishCallback = null;
    
    public DataHolder(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> successCallback, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<kotlin.Unit> success, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> fail, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<kotlin.Unit> cancel, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.ErrorManager errorManager, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> cancelCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> errorCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinishCallback) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getSuccessCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getSuccess() {
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
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getCancel() {
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
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getErrorCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFinishCallback() {
        return null;
    }
}