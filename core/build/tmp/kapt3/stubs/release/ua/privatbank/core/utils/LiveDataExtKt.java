package ua.privatbank.core.utils;

import androidx.annotation.MainThread;
import androidx.lifecycle.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0007\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\t0\u000b\u001a,\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0010\u00a8\u0006\u0011"}, d2 = {"callPost", "", "Landroidx/lifecycle/MutableLiveData;", "callSet", "distinctUntilChanged", "Landroidx/lifecycle/MediatorLiveData;", "T", "Landroidx/lifecycle/LiveData;", "map", "R", "function", "Lkotlin/Function1;", "observeOnce", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "core_release"})
public final class LiveDataExtKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.MediatorLiveData<T> distinctUntilChanged(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$distinctUntilChanged) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object>androidx.lifecycle.LiveData<R> map(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> function) {
        return null;
    }
    
    /**
     * Used for cases where T is Unit, to make calls cleaner.
     */
    public static final void callPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<kotlin.Unit> $this$callPost) {
    }
    
    /**
     * Used for cases where T is Unit, to make calls cleaner.
     */
    @androidx.annotation.MainThread()
    public static final void callSet(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<kotlin.Unit> $this$callSet) {
    }
    
    /**
     * remove Observer after first callback.
     */
    public static final <T extends java.lang.Object>void observeOnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeOnce, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
}