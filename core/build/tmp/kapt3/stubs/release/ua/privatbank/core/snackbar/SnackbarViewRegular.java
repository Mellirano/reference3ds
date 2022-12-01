package ua.privatbank.core.snackbar;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import kotlinx.android.synthetic.main.snackbar_content_regular.view.*;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarViewRegular;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appUsableSize", "Landroid/graphics/Point;", "defaultVerticalSpacing", "getDefaultVerticalSpacing", "()I", "setDefaultVerticalSpacing", "(I)V", "style", "Lua/privatbank/core/snackbar/SnackbarHelper$BuildStyle;", "getStyle", "()Lua/privatbank/core/snackbar/SnackbarHelper$BuildStyle;", "setStyle", "(Lua/privatbank/core/snackbar/SnackbarHelper$BuildStyle;)V", "tvDefaultParams", "Landroid/widget/LinearLayout$LayoutParams;", "getAvailableScreenHeight", "onFinishInflate", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "core_release"})
public final class SnackbarViewRegular extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.snackbar.SnackbarViewRegular.Companion Companion = null;
    private static final int LINES_COUNT_TO_VERTICAL_ORIENTATION = 2;
    private final android.widget.LinearLayout.LayoutParams tvDefaultParams = null;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.snackbar.SnackbarHelper.BuildStyle style;
    private int defaultVerticalSpacing = 0;
    private final android.graphics.Point appUsableSize = null;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public SnackbarViewRegular(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SnackbarViewRegular(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SnackbarViewRegular(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.snackbar.SnackbarHelper.BuildStyle getStyle() {
        return null;
    }
    
    public final void setStyle(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.snackbar.SnackbarHelper.BuildStyle p0) {
    }
    
    public final int getDefaultVerticalSpacing() {
        return 0;
    }
    
    public final void setDefaultVerticalSpacing(int p0) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final int getAvailableScreenHeight() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarViewRegular$Companion;", "", "()V", "LINES_COUNT_TO_VERTICAL_ORIENTATION", "", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}