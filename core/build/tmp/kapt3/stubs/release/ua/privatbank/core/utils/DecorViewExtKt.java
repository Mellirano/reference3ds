package ua.privatbank.core.utils;

import android.app.Activity;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0007\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0001H\u0007\u001a\n\u0010\u000e\u001a\u00020\u0005*\u00020\u0003\u00a8\u0006\u000f"}, d2 = {"hasLightStatusBarFlagInDecorView", "", "Landroid/app/Activity;", "Landroid/view/Window;", "hideNavigationBar", "", "resetNavigationBarColor", "resetNavigationBarLightFlag", "resetStatusBarLightFlag", "Landroidx/fragment/app/Fragment;", "setLightStatusBarFlag", "isLightBackgroundWithDarkIcons", "setNavigationBarLightFlag", "isLightNavigationBarWithDarkIcons", "showNavigationBar", "core_release"})
public final class DecorViewExtKt {
    
    public static final void setLightStatusBarFlag(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$setLightStatusBarFlag, boolean isLightBackgroundWithDarkIcons) {
    }
    
    public static final void hideNavigationBar(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$hideNavigationBar) {
    }
    
    public static final void showNavigationBar(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$showNavigationBar) {
    }
    
    public static final boolean hasLightStatusBarFlagInDecorView(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$hasLightStatusBarFlagInDecorView) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final void setNavigationBarLightFlag(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$setNavigationBarLightFlag, boolean isLightNavigationBarWithDarkIcons) {
    }
    
    public static final void setLightStatusBarFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setLightStatusBarFlag, boolean isLightBackgroundWithDarkIcons) {
    }
    
    public static final boolean hasLightStatusBarFlagInDecorView(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hasLightStatusBarFlagInDecorView) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final void setNavigationBarLightFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setNavigationBarLightFlag, boolean isLightNavigationBarWithDarkIcons) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O_MR1)
    public static final void resetNavigationBarLightFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$resetNavigationBarLightFlag) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public static final void resetNavigationBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$resetNavigationBarColor) {
    }
    
    public static final void resetStatusBarLightFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$resetStatusBarLightFlag) {
    }
    
    public static final void resetStatusBarLightFlag(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$resetStatusBarLightFlag) {
    }
    
    public static final void setLightStatusBarFlag(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$setLightStatusBarFlag, boolean isLightBackgroundWithDarkIcons) {
    }
}