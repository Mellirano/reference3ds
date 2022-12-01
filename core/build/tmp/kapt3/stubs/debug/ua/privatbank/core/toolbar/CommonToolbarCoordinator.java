package ua.privatbank.core.toolbar;

import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import ua.privatbank.core.base.CoreApplication;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\'\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB\u0005\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u0014\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u00104J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u00105J\u0017\u0010\u0019\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0002\u00106J\u0017\u0010\u0019\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108J\u0017\u0010#\u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108J\u0017\u0010&\u001a\u00028\u00002\b\u00109\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108J\u0017\u0010\u0006\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0002\u00106J\u0017\u0010\u0006\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108J\u0017\u0010-\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108J\u0017\u00100\u001a\u00028\u00002\b\u00109\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u00108R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@DX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\rR,\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@DX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\rR\"\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\rR(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR,\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@DX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\rR,\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@DX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\rR\"\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\r\u00a8\u0006:"}, d2 = {"Lua/privatbank/core/toolbar/CommonToolbarCoordinator;", "T", "Lua/privatbank/core/toolbar/ToolbarCoordinator;", "Lua/privatbank/core/toolbar/HasTitle;", "Lua/privatbank/core/toolbar/HasSubtitle;", "Lua/privatbank/core/toolbar/HasLogo;", "title", "", "isArrowIcon", "", "(Ljava/lang/CharSequence;Z)V", "titleRes", "", "(Ljava/lang/Integer;)V", "()V", "()Z", "setArrowIcon", "(Z)V", "<set-?>", "Landroid/graphics/drawable/Drawable;", "logoIcon", "getLogoIcon", "()Landroid/graphics/drawable/Drawable;", "setLogoIcon", "(Landroid/graphics/drawable/Drawable;)V", "subtitle", "getSubtitle", "()Ljava/lang/CharSequence;", "setSubtitle", "(Ljava/lang/CharSequence;)V", "subtitleRes", "getSubtitleRes", "()Ljava/lang/Integer;", "setSubtitleRes", "Ljava/lang/Integer;", "subtitleTextAppearance", "getSubtitleTextAppearance", "setSubtitleTextAppearance", "subtitleTextColor", "getSubtitleTextColor", "setSubtitleTextColor", "getTitle", "setTitle", "getTitleRes", "setTitleRes", "titleTextAppearance", "getTitleTextAppearance", "setTitleTextAppearance", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "isLarge", "(Landroid/graphics/drawable/Drawable;Z)Lua/privatbank/core/toolbar/ToolbarCoordinator;", "(I)Lua/privatbank/core/toolbar/ToolbarCoordinator;", "(Ljava/lang/CharSequence;)Lua/privatbank/core/toolbar/ToolbarCoordinator;", "stringId", "(Ljava/lang/Integer;)Lua/privatbank/core/toolbar/ToolbarCoordinator;", "textColor", "core_debug"})
public abstract class CommonToolbarCoordinator<T extends ua.privatbank.core.toolbar.ToolbarCoordinator<T>> extends ua.privatbank.core.toolbar.ToolbarCoordinator<T> implements ua.privatbank.core.toolbar.HasTitle<T>, ua.privatbank.core.toolbar.HasSubtitle<T>, ua.privatbank.core.toolbar.HasLogo<T> {
    private boolean isArrowIcon = true;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence subtitle;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    private java.lang.Integer titleRes;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    private java.lang.Integer subtitleRes;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable logoIcon;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StyleRes()
    private java.lang.Integer titleTextAppearance;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StyleRes()
    private java.lang.Integer subtitleTextAppearance;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    private java.lang.Integer titleTextColor;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    private java.lang.Integer subtitleTextColor;
    
    public CommonToolbarCoordinator() {
        super();
    }
    
    public CommonToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title, boolean isArrowIcon) {
        super();
    }
    
    public CommonToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    java.lang.Integer titleRes) {
        super();
    }
    
    public final boolean isArrowIcon() {
        return false;
    }
    
    public final void setArrowIcon(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getTitle() {
        return null;
    }
    
    protected final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getSubtitle() {
        return null;
    }
    
    protected final void setSubtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTitleRes() {
        return null;
    }
    
    protected final void setTitleRes(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubtitleRes() {
        return null;
    }
    
    protected final void setSubtitleRes(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getLogoIcon() {
        return null;
    }
    
    protected final void setLogoIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTitleTextAppearance() {
        return null;
    }
    
    protected final void setTitleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubtitleTextAppearance() {
        return null;
    }
    
    protected final void setSubtitleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTitleTextColor() {
        return null;
    }
    
    public final void setTitleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubtitleTextColor() {
        return null;
    }
    
    public final void setSubtitleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T title(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T title(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T titleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer titleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T titleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T subtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence subtitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T subtitle(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stringId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T subtitleTextAppearance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer subtitleTextAppearance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T subtitleTextColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer textColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T logoIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable logoIcon, boolean isLarge) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T logoIcon(int logoIcon) {
        return null;
    }
}