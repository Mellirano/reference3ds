package ua.privatbank.core.network.errors;

import ua.privatbank.core.network.helpers.ErrorFun;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bi\u0012*\u0010\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\n\u001a\u00020\u00072\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\t\u001a\u00020\u00072\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bJ2\u0010\u0019\u001a\u00020\u00072*\u0010\u001a\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u001bJ2\u0010\u001c\u001a\u00020\u00072*\u0010\u001a\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u001bJ2\u0010\u001d\u001a\u00020\u0007\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0005*\u00020\u00002\u0014\b\b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b\u00f8\u0001\u0000J2\u0010\u001f\u001a\u00020\u0007\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0005*\u00020\u00002\u0014\b\b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b\u00f8\u0001\u0000J-\u0010 \u001a\u00020\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u0086\u0004R.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR1\u0010\u0012\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00060\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006!"}, d2 = {"Lua/privatbank/core/network/errors/ErrorManagerBuilder;", "", "map", "", "Lkotlin/reflect/KClass;", "", "Lkotlin/Function1;", "", "Lua/privatbank/core/network/helpers/ErrorFun;", "defaultError", "anyError", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAnyError", "()Lkotlin/jvm/functions/Function1;", "setAnyError", "(Lkotlin/jvm/functions/Function1;)V", "getDefaultError", "setDefaultError", "mutableMap", "Ljava/util/HashMap;", "getMutableMap", "()Ljava/util/HashMap;", "errorFun", "buildErrorManager", "Lua/privatbank/core/network/errors/ErrorManager;", "extendErrors", "item", "Lkotlin/Pair;", "registerErrors", "extendAction", "T", "registerAction", "withAction", "core_debug"})
public final class ErrorManagerBuilder {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> defaultError;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> anyError;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<kotlin.reflect.KClass<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> mutableMap = null;
    
    public ErrorManagerBuilder(@org.jetbrains.annotations.NotNull()
    java.util.Map<kotlin.reflect.KClass<? extends java.lang.Throwable>, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> map, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> defaultError, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> anyError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getDefaultError() {
        return null;
    }
    
    public final void setDefaultError(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getAnyError() {
        return null;
    }
    
    public final void setAnyError(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<kotlin.reflect.KClass<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> getMutableMap() {
        return null;
    }
    
    public final void registerErrors(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends kotlin.reflect.KClass<? extends java.lang.Throwable>, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> item) {
    }
    
    public final void extendErrors(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends kotlin.reflect.KClass<? extends java.lang.Throwable>, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> item) {
    }
    
    public final void defaultError(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorFun) {
    }
    
    public final void anyError(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorFun) {
    }
    
    public final void withAction(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends java.lang.Throwable> $this$withAction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorFun) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.ErrorManager buildErrorManager() {
        return null;
    }
}