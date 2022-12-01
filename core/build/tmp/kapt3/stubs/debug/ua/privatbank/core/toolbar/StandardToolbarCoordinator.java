package ua.privatbank.core.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0014J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016J\u0019\u0010\u001d\u001a\u00020\u00002\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00002\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00002\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u0019\u0010\u0003\u001a\u00020\u00002\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010#\u001a\u00020\u00002\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010$\u001a\u00020\u00002\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006%"}, d2 = {"Lua/privatbank/core/toolbar/StandardToolbarCoordinator;", "Lua/privatbank/core/toolbar/CommonToolbarCoordinator;", "()V", "title", "", "isArrowIcon", "", "(Ljava/lang/CharSequence;Z)V", "titleRes", "", "(Ljava/lang/Integer;Z)V", "buildInternal", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parent", "initViews", "", "viewGroup", "logoIcon", "Landroid/graphics/drawable/Drawable;", "isLarge", "navigationClickListener", "Landroid/view/View$OnClickListener;", "navigationIcon", "prodiveToolbarCoordinator", "Lua/privatbank/core/toolbar/ToolbarCoordinator;", "builder", "showNavigationIcon", "subtitle", "stringId", "(Ljava/lang/Integer;)Lua/privatbank/core/toolbar/StandardToolbarCoordinator;", "subtitleTextAppearance", "subtitleTextColor", "textColor", "titleTextAppearance", "titleTextColor", "core_debug"})
public class StandardToolbarCoordinator extends ua.privatbank.core.toolbar.CommonToolbarCoordinator<ua.privatbank.core.toolbar.StandardToolbarCoordinator> {
    
    public StandardToolbarCoordinator() {
        super(null, false);
    }
    
    public StandardToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title, boolean isArrowIcon) {
        super(null, false);
    }
    
    public StandardToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    java.lang.Integer titleRes, boolean isArrowIcon) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup buildInternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final void initViews(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator navigationIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable navigationIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator navigationClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener navigationClickListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator showNavigationIcon(boolean showNavigationIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator title(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator title(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator subtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence subtitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator subtitle(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator logoIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable logoIcon, boolean isLarge) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator logoIcon(int logoIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator titleTextAppearance(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StyleRes()
    java.lang.Integer titleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator subtitleTextAppearance(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StyleRes()
    java.lang.Integer subtitleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator titleTextColor(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.StandardToolbarCoordinator subtitleTextColor(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.ToolbarCoordinator<?> prodiveToolbarCoordinator(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.toolbar.StandardToolbarCoordinator builder) {
        return null;
    }
}