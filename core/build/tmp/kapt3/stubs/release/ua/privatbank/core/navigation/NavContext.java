package ua.privatbank.core.navigation;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lua/privatbank/core/navigation/NavContext;", "", "()V", "nodeMap", "Ljava/util/HashMap;", "Lua/privatbank/core/navigation/NavMapKey;", "Lua/privatbank/core/navigation/BaseNode;", "addNodes", "", "services", "", "Lua/privatbank/core/navigation/ServiceNode;", "([Lua/privatbank/core/navigation/ServiceNode;)V", "findNode", "deepLink", "", "navKey", "Lua/privatbank/core/navigation/NavKey;", "core_release"})
public final class NavContext {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.navigation.NavContext INSTANCE = null;
    private static final java.util.HashMap<ua.privatbank.core.navigation.NavMapKey, ua.privatbank.core.navigation.BaseNode> nodeMap = null;
    
    private NavContext() {
        super();
    }
    
    public final void addNodes(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.ServiceNode... services) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.BaseNode findNode(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavKey navKey) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.navigation.BaseNode findNode(@org.jetbrains.annotations.NotNull()
    java.lang.String deepLink) {
        return null;
    }
}