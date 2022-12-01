package ua.privatbank.core;

import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/SimpleDependency;", "T", "Lua/privatbank/core/DependencyHolder;", "creator", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "create", "()Ljava/lang/Object;", "core_debug"})
public final class SimpleDependency<T extends java.lang.Object> extends ua.privatbank.core.DependencyHolder<T> {
    
    public SimpleDependency(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> creator) {
        super(null);
    }
    
    @java.lang.Override()
    public T create() {
        return null;
    }
}