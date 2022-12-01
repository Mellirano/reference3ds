package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/navigation/Config;", "Ljava/io/Serializable;", "reuse", "", "isAddToBackStack", "clearStack", "tag", "", "runImmediate", "(ZZZLjava/lang/String;Z)V", "getClearStack", "()Z", "getReuse", "getRunImmediate", "getTag", "()Ljava/lang/String;", "core_release"})
public final class Config implements java.io.Serializable {
    private final boolean reuse = false;
    private final boolean isAddToBackStack = false;
    private final boolean clearStack = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tag = null;
    private final boolean runImmediate = false;
    
    public Config() {
        super();
    }
    
    public Config(boolean reuse, boolean isAddToBackStack, boolean clearStack, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, boolean runImmediate) {
        super();
    }
    
    public final boolean getReuse() {
        return false;
    }
    
    public final boolean isAddToBackStack() {
        return false;
    }
    
    public final boolean getClearStack() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final boolean getRunImmediate() {
        return false;
    }
}