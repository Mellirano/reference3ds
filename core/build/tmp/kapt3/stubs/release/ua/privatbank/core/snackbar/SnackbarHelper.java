package ua.privatbank.core.snackbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.Snackbar;
import kotlinx.android.synthetic.main.snackbar_content_regular.view.*;
import ua.privatbank.core.R;
import ua.privatbank.core.utils.*;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0010J\b\u0010\'\u001a\u00020(H\u0002J\u001f\u0010)\u001a\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0+\u00a2\u0006\u0002\b,J\u0010\u0010-\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020\u0016J\u0010\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0007J\u0006\u00102\u001a\u00020!J\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u00020(H\u0002J\b\u00108\u001a\u00020(H\u0002J\u0010\u00109\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010\u0003J\b\u0010;\u001a\u00020(H\u0002J\u0018\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000b2\b\b\u0002\u0010>\u001a\u00020?J\u0018\u0010@\u001a\u00020\u00002\u0010\b\u0002\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0BJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020?J$\u0010F\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0+J)\u0010F\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0+\u00a2\u0006\u0002\u0010JJ\u0012\u0010K\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u000bH\u0002J\u0010\u0010L\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010HJ\u0015\u0010L\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010O\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000bJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0016J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0016J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0016J\u001a\u0010U\u001a\u00020\u00002\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0+J\"\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0+J\"\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u000b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0+J\u0010\u0010W\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020\u000bJ\u0010\u0010X\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020\u000bJ\u0010\u0010Y\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010Y\u001a\u00020\u00002\b\b\u0001\u0010V\u001a\u00020\u000bJ\b\u0010Z\u001a\u00020(H\u0002J\u0006\u0010T\u001a\u00020(R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarHelper;", "", "view", "Landroid/view/View;", "snackbarPreset", "Lua/privatbank/core/snackbar/SnackbarPreset;", "(Landroid/view/View;Lua/privatbank/core/snackbar/SnackbarPreset;)V", "title", "", "message", "duration", "", "(Landroid/view/View;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)V", "", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;I)V", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "(Landroid/view/View;II)V", "bTextAction", "Landroid/widget/Button;", "buildStyle", "Lua/privatbank/core/snackbar/SnackbarHelper$BuildStyle;", "durationWasSet", "", "ibAction", "Landroid/widget/ImageButton;", "isSwipeEnabled", "()Z", "setSwipeEnabled", "(Z)V", "ivLeftIcon", "Landroid/widget/ImageView;", "layoutRoot", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "tvMessage", "Landroid/widget/TextView;", "tvTitle", "viewCustom", "Landroid/view/ViewGroup;", "adjustRootLayoutAndIcon", "", "configureActionButton", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "dismiss", "immediately", "getContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getSnackbar", "hideMessage", "hideTitle", "initBase", "viewCustomLocal", "initForCommonStyle", "initForDialogStyle", "setAnchorView", "anchorView", "setAutomaticDuration", "setBackgroundColor", "color", "radius", "", "setDismissCallback", "onDismissCallback", "Lkotlin/Function0;", "setDuration", "setElevation", "elevation", "setIconActionClickListener", "drawable", "Landroid/graphics/drawable/Drawable;", "listener", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lua/privatbank/core/snackbar/SnackbarHelper;", "setImageActionButtonIcon", "setLeftIcon", "(Ljava/lang/Integer;)Lua/privatbank/core/snackbar/SnackbarHelper;", "setMessage", "setMessageTextColor", "setShowActionIconButton", "showIcon", "setShowIcon", "setShowTextActionButton", "show", "setTextActionButtonClickListener", "text", "setTextActionButtonTextColor", "setTextActionButtonTextColorRes", "setTitle", "setupSwipeBehaviour", "BuildStyle", "Companion", "core_release"})
public final class SnackbarHelper {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.snackbar.SnackbarHelper.Companion Companion = null;
    public static final int MIN_SHOW_TIME = 2500;
    public static final int AUTOMATIC_SHOW_TIME = -3;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private android.view.ViewGroup viewCustom;
    private android.widget.ImageView ivLeftIcon;
    private android.widget.TextView tvMessage;
    private android.view.View layoutRoot;
    private android.widget.TextView tvTitle;
    private android.widget.ImageButton ibAction;
    private android.widget.Button bTextAction;
    private ua.privatbank.core.snackbar.SnackbarHelper.BuildStyle buildStyle = ua.privatbank.core.snackbar.SnackbarHelper.BuildStyle.REGULAR;
    private boolean durationWasSet = false;
    private boolean isSwipeEnabled = true;
    
    public final boolean isSwipeEnabled() {
        return false;
    }
    
    public final void setSwipeEnabled(boolean p0) {
    }
    
    public SnackbarHelper(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.snackbar.SnackbarPreset snackbarPreset) {
        super();
    }
    
    public SnackbarHelper(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence title, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message, int duration) {
        super();
    }
    
    public SnackbarHelper(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
        super();
    }
    
    public SnackbarHelper(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message, int duration) {
        super();
    }
    
    public SnackbarHelper(@org.jetbrains.annotations.NotNull()
    android.view.View view, @androidx.annotation.StringRes()
    int message, int duration) {
        super();
    }
    
    private final void initForCommonStyle() {
    }
    
    private final void initForDialogStyle() {
    }
    
    private final void initBase(android.view.ViewGroup viewCustomLocal) {
    }
    
    public final void dismiss(boolean immediately) {
    }
    
    public final void hideMessage() {
    }
    
    public final void hideTitle() {
    }
    
    private final void adjustRootLayoutAndIcon() {
    }
    
    public final void show() {
    }
    
    private final void setupSwipeBehaviour() {
    }
    
    private final void setAutomaticDuration() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setMessage(int message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setAnchorView(@org.jetbrains.annotations.Nullable()
    android.view.View anchorView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setElevation(float elevation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTitle(@androidx.annotation.StringRes()
    int text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setMessageTextColor(int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setBackgroundColor(int color, float radius) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setLeftIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setLeftIcon(@org.jetbrains.annotations.Nullable()
    java.lang.Integer drawable) {
        return null;
    }
    
    private final ua.privatbank.core.snackbar.SnackbarHelper setImageActionButtonIcon(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    private final ua.privatbank.core.snackbar.SnackbarHelper setImageActionButtonIcon(int drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setShowIcon(boolean showIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setShowActionIconButton(boolean showIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setShowTextActionButton(boolean show) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper configureActionButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.widget.Button, kotlin.Unit> builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTextActionButtonClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setDismissCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissCallback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTextActionButtonClickListener(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTextActionButtonClickListener(int text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTextActionButtonTextColor(@androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setTextActionButtonTextColorRes(@androidx.annotation.ColorRes()
    int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setIconActionClickListener(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setIconActionClickListener(@org.jetbrains.annotations.Nullable()
    java.lang.Integer drawable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper setDuration(int duration) {
        return null;
    }
    
    @androidx.annotation.NonNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.snackbar.Snackbar getSnackbar() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarHelper$BuildStyle;", "", "(Ljava/lang/String;I)V", "REGULAR", "DIALOG", "core_release"})
    public static enum BuildStyle {
        /*public static final*/ REGULAR /* = new REGULAR() */,
        /*public static final*/ DIALOG /* = new DIALOG() */;
        
        BuildStyle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarHelper$Companion;", "", "()V", "AUTOMATIC_SHOW_TIME", "", "MIN_SHOW_TIME", "countTimeByText", "title", "", "message", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int countTimeByText(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence message) {
            return 0;
        }
    }
}