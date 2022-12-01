package ua.privatbank.core.toolbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import ua.privatbank.core.R;
import ua.privatbank.core.utils.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001a\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0016J\u0012\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0017\u0010#\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&J\u0017\u0010\'\u001a\u00020\u00002\b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&J\u0017\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&J\u0012\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010$H\u0016J\u0017\u0010*\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&J\u0017\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&J\u0017\u0010,\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0002\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lua/privatbank/core/toolbar/WideToolbarCoordinator;", "Lua/privatbank/core/toolbar/CommonToolbarCoordinator;", "color", "", "(I)V", "getColor", "()I", "ibBack", "Landroid/widget/ImageButton;", "isLargeIcon", "", "ivLogo", "Landroid/widget/ImageView;", "tvSubtitle", "Landroid/widget/TextView;", "tvTitle", "buildInternal", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parent", "getColorIcon", "logoIcon", "Landroid/graphics/drawable/Drawable;", "isLarge", "navigationClickListener", "Landroid/view/View$OnClickListener;", "navigationIcon", "prodiveToolbarCoordinator", "builder", "setUpMenu", "", "settingsColor", "viewGroup", "showNavigationIcon", "subtitle", "", "stringId", "(Ljava/lang/Integer;)Lua/privatbank/core/toolbar/WideToolbarCoordinator;", "subtitleTextAppearance", "subtitleTextColor", "textColor", "title", "titleTextAppearance", "titleTextColor", "core_debug"})
public final class WideToolbarCoordinator extends ua.privatbank.core.toolbar.CommonToolbarCoordinator<ua.privatbank.core.toolbar.WideToolbarCoordinator> {
    private final int color = 0;
    private android.widget.ImageView ivLogo;
    private android.widget.ImageButton ibBack;
    private android.widget.TextView tvTitle;
    private android.widget.TextView tvSubtitle;
    private boolean isLargeIcon = false;
    
    public WideToolbarCoordinator() {
        super(null, false);
    }
    
    public WideToolbarCoordinator(int color) {
        super(null, false);
    }
    
    public final int getColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator navigationClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener navigationClickListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator titleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator subtitleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator title(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator subtitle(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator titleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer titleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator subtitleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer subtitleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator logoIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable logoIcon, boolean isLarge) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator logoIcon(int logoIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator title(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator subtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence subtitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator navigationIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable navigationIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator showNavigationIcon(boolean showNavigationIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup buildInternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final void settingsColor(android.view.ViewGroup viewGroup, android.widget.ImageButton ibBack) {
    }
    
    private final int getColorIcon(int color) {
        return 0;
    }
    
    @java.lang.Override()
    public void setUpMenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.WideToolbarCoordinator prodiveToolbarCoordinator(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.toolbar.WideToolbarCoordinator builder) {
        return null;
    }
}