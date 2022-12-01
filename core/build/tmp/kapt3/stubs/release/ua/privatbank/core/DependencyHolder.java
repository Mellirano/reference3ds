package ua.privatbank.core;

import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/DependencyHolder;", "T", "", "creator", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "getCreator", "()Lkotlin/jvm/functions/Function0;", "create", "()Ljava/lang/Object;", "core_release"})
public abstract class DependencyHolder<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<T> creator = null;
    
    public DependencyHolder(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> creator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<T> getCreator() {
        return null;
    }
    
    public abstract T create();
}