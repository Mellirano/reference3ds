package ua.privatbank.core;

import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J4\u0010\u0010\u001a\u00020\u0011\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0001\"\u0004\b\u0001\u0010\u00132\u0014\b\b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u0015H\u0086\b\u00f8\u0001\u0000J\u0019\u0010\u0016\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u0002H\u0013\u00a2\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\u00020\u0011\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00012\u000e\b\b\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001eH\u0086\b\u00f8\u0001\u0000J0\u0010\u001d\u001a\u00020\u0011\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u000e\b\b\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001eH\u0086\b\u00f8\u0001\u0000J(\u0010!\u001a\u00020\u0011\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00012\u000e\b\b\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001eH\u0086\b\u00f8\u0001\u0000J0\u0010!\u001a\u00020\u0011\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u000e\b\b\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001eH\u0086\b\u00f8\u0001\u0000R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\""}, d2 = {"Lua/privatbank/core/Module;", "", "()V", "map", "Ljava/util/HashMap;", "Lua/privatbank/core/TypeHolder;", "Lua/privatbank/core/DependencyHolder;", "getMap", "()Ljava/util/HashMap;", "mapFactories", "Lua/privatbank/core/FactoryDependency;", "getMapFactories", "contains", "", "typeHolder", "containsFactory", "factory", "", "T", "P", "create", "Lkotlin/Function1;", "getDependency", "(Lua/privatbank/core/TypeHolder;)Ljava/lang/Object;", "getDependencyFactory", "param", "(Lua/privatbank/core/TypeHolder;Ljava/lang/Object;)Ljava/lang/Object;", "inject", "()Ljava/lang/Object;", "provide", "Lkotlin/Function0;", "tag", "", "singleton", "core_debug"})
public final class Module {
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<ua.privatbank.core.TypeHolder, ua.privatbank.core.DependencyHolder<?>> map = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<ua.privatbank.core.TypeHolder, ua.privatbank.core.FactoryDependency<?, ?>> mapFactories = null;
    
    public Module() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<ua.privatbank.core.TypeHolder, ua.privatbank.core.DependencyHolder<?>> getMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<ua.privatbank.core.TypeHolder, ua.privatbank.core.FactoryDependency<?, ?>> getMapFactories() {
        return null;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.TypeHolder typeHolder) {
        return false;
    }
    
    public final boolean containsFactory(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.TypeHolder typeHolder) {
        return false;
    }
    
    public final <T extends java.lang.Object>T getDependency(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.TypeHolder typeHolder) {
        return null;
    }
    
    public final <T extends java.lang.Object, P extends java.lang.Object>T getDependencyFactory(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.TypeHolder typeHolder, P param) {
        return null;
    }
}