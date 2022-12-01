package ua.privatbank.core;

import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/FactoryDependency;", "T", "P", "", "create", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "getCreate", "()Lkotlin/jvm/functions/Function1;", "core_debug"})
public final class FactoryDependency<T extends java.lang.Object, P extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<P, T> create = null;
    
    public FactoryDependency(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super P, ? extends T> create) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<P, T> getCreate() {
        return null;
    }
}