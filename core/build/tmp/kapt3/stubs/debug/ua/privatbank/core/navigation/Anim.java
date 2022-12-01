package ua.privatbank.core.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/navigation/Anim;", "", "enter", "", "exit", "popEnter", "popExit", "(IIII)V", "getEnter", "()I", "getExit", "getPopEnter", "getPopExit", "default", "scaleOut", "slide", "core_debug"})
public class Anim {
    private final int enter = 0;
    private final int exit = 0;
    private final int popEnter = 0;
    private final int popExit = 0;
    
    public Anim(@androidx.annotation.AnimRes()
    @androidx.annotation.AnimatorRes()
    int enter, @androidx.annotation.AnimRes()
    @androidx.annotation.AnimatorRes()
    int exit, @androidx.annotation.AnimRes()
    @androidx.annotation.AnimatorRes()
    int popEnter, @androidx.annotation.AnimRes()
    @androidx.annotation.AnimatorRes()
    int popExit) {
        super();
    }
    
    public final int getEnter() {
        return 0;
    }
    
    public final int getExit() {
        return 0;
    }
    
    public final int getPopEnter() {
        return 0;
    }
    
    public final int getPopExit() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/privatbank/core/navigation/Anim$slide;", "Lua/privatbank/core/navigation/Anim;", "()V", "core_debug"})
    public static final class slide extends ua.privatbank.core.navigation.Anim {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.navigation.Anim.slide INSTANCE = null;
        
        private slide() {
            super(0, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/privatbank/core/navigation/Anim$scaleOut;", "Lua/privatbank/core/navigation/Anim;", "()V", "core_debug"})
    public static final class scaleOut extends ua.privatbank.core.navigation.Anim {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.navigation.Anim.scaleOut INSTANCE = null;
        
        private scaleOut() {
            super(0, 0, 0, 0);
        }
    }
}