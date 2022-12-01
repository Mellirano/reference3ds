package ua.privatbank.core.navigation;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/navigation/BaseNode;", "Lua/privatbank/core/navigation/NavKey;", "key", "Lua/privatbank/core/navigation/NavMapKey;", "(Lua/privatbank/core/navigation/NavMapKey;)V", "getKey", "()Lua/privatbank/core/navigation/NavMapKey;", "withAnalytics", "", "getWithAnalytics", "()Z", "setWithAnalytics", "(Z)V", "core_release"})
public class BaseNode implements ua.privatbank.core.navigation.NavKey {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.navigation.NavMapKey key = null;
    private boolean withAnalytics = false;
    
    public BaseNode(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavMapKey key) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.NavMapKey getKey() {
        return null;
    }
    
    public final boolean getWithAnalytics() {
        return false;
    }
    
    public final void setWithAnalytics(boolean p0) {
    }
}