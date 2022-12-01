package ua.privatbank.core.network.errors;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import kotlin.reflect.KClass;
import io.reactivex.functions.Function;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bR\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/network/errors/Retry;", "", "exceptionClass", "Lkotlin/reflect/KClass;", "", "trigger", "Lio/reactivex/Flowable;", "(Lkotlin/reflect/KClass;Lio/reactivex/Flowable;)V", "bind", "T", "errorFlowable", "Lio/reactivex/Observable;", "core_debug"})
public final class Retry {
    private final kotlin.reflect.KClass<? extends java.lang.Throwable> exceptionClass = null;
    private final io.reactivex.Flowable<?> trigger = null;
    
    public Retry(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends java.lang.Throwable> exceptionClass, @org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<?> trigger) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Flowable<?> bind(@org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<java.lang.Throwable> errorFlowable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Observable<?> bind(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<java.lang.Throwable> errorFlowable) {
        return null;
    }
}