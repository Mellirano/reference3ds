package ua.privatbank.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"getColorCompat", "", "Landroid/content/Context;", "id", "getColorResourceByAttr", "idAttr", "getDrawableByAttr", "Landroid/graphics/drawable/Drawable;", "getDrawableCompat", "getDrawableIdByAttr", "includeContentUnderStatusBar", "", "Landroid/app/Activity;", "include", "", "resetStatusBarColor", "Landroidx/fragment/app/Fragment;", "core_release"})
public final class StyleExtentionKt {
    
    public static final int getColorResourceByAttr(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorResourceByAttr, int idAttr) {
        return 0;
    }
    
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, @androidx.annotation.ColorRes()
    int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawableCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawableCompat, @androidx.annotation.DrawableRes()
    int id) {
        return null;
    }
    
    public static final int getDrawableIdByAttr(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawableIdByAttr, int idAttr) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawableByAttr(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawableByAttr, int idAttr) {
        return null;
    }
    
    public static final void resetStatusBarColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$resetStatusBarColor) {
    }
    
    public static final void resetStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$resetStatusBarColor) {
    }
    
    public static final void includeContentUnderStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$includeContentUnderStatusBar, boolean include) {
    }
}