package ua.privatbank.core;

import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0006\b\u0000\u0010\u0011\u0018\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086\bJ0\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0004\b\u0001\u0010\u00152\u000e\b\u0004\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0086\b\u00f8\u0001\u0000J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0006\b\u0000\u0010\u0011\u0018\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u0016\u001a\u0002H\u0015H\u0086\b\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001a"}, d2 = {"Lua/privatbank/core/DI;", "", "()V", "modules", "Ljava/util/ArrayList;", "Lua/privatbank/core/Module;", "getModules", "()Ljava/util/ArrayList;", "init", "", "moduleVarArts", "", "([Lua/privatbank/core/Module;)V", "modulesList", "", "inject", "Lkotlin/Lazy;", "T", "tag", "", "injectFactory", "P", "param", "Lkotlin/Function0;", "(Ljava/lang/Object;)Lkotlin/Lazy;", "replaceModules", "core_debug"})
public final class DI {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.DI INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.ArrayList<ua.privatbank.core.Module> modules = null;
    
    private DI() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ua.privatbank.core.Module> getModules() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.Module... moduleVarArts) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.privatbank.core.Module> modulesList) {
    }
    
    public final void replaceModules(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.privatbank.core.Module> modulesList) {
    }
}