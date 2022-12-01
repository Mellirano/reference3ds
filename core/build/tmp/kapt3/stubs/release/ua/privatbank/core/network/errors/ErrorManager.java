package ua.privatbank.core.network.errors;

import ua.privatbank.core.network.helpers.ErrorFun;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bo\u0012,\b\u0002\u0010\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0003\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\u0012J\'\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0086\u0002J(\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005J\u001f\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\u0012R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR2\u0010\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lua/privatbank/core/network/errors/ErrorManager;", "", "errorEvents", "", "Lkotlin/reflect/KClass;", "", "Lkotlin/Function1;", "", "Lua/privatbank/core/network/helpers/ErrorFun;", "defaultError", "anyError", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAnyError", "()Lkotlin/jvm/functions/Function1;", "getDefaultError", "extend", "body", "Lua/privatbank/core/network/errors/ErrorManagerBuilder;", "Lkotlin/ExtensionFunctionType;", "get", "key", "isSubclassOf", "", "fistClass", "secondKClass", "parseError", "throwable", "replace", "core_release"})
public final class ErrorManager {
    private final java.util.Map<kotlin.reflect.KClass<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> errorEvents = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> defaultError = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> anyError = null;
    
    public ErrorManager() {
        super();
    }
    
    public ErrorManager(@org.jetbrains.annotations.NotNull()
    java.util.Map<kotlin.reflect.KClass<? extends java.lang.Throwable>, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> errorEvents, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> defaultError, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> anyError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getDefaultError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getAnyError() {
        return null;
    }
    
    public final void parseError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    private final boolean isSubclassOf(kotlin.reflect.KClass<? extends java.lang.Throwable> fistClass, kotlin.reflect.KClass<? extends java.lang.Throwable> secondKClass) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> get(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends java.lang.Throwable> key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.ErrorManager extend(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.errors.ErrorManagerBuilder, kotlin.Unit> body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.ErrorManager replace(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.errors.ErrorManagerBuilder, kotlin.Unit> body) {
        return null;
    }
}