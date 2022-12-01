package ua.privatbank.core.utils;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.*;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import ua.privatbank.core.navigation.AnalyticsProvider;
import java.lang.reflect.Field;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u00d2\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u001a\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003\u001a#\u0010\u0017\u001a\u00020\u0014*\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\u0002\b\u001c\u001a\n\u0010\u001d\u001a\u00020\u0014*\u00020\u0004\u001a\u0012\u0010\u001e\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0003\u001a\u0014\u0010 \u001a\u00020\u0014*\u00020!2\b\b\u0001\u0010\"\u001a\u00020\u0003\u001a*\u0010#\u001a\u00020\u0014*\u0004\u0018\u00010$2\b\b\u0001\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\'2\b\b\u0002\u0010(\u001a\u00020)\u001a\u0016\u0010#\u001a\u00020\u0014*\u0004\u0018\u00010*2\b\b\u0001\u0010+\u001a\u00020\u0003\u001a \u0010,\u001a\u00020\u0014*\u0004\u0018\u00010$2\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\'\u001a \u0010,\u001a\u00020\u0014*\u0004\u0018\u00010*2\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\b\u001a\u001b\u0010.\u001a\u00020\u0014*\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u00a2\u0006\u0002\u00101\u001a\n\u00102\u001a\u00020\u0003*\u00020\u0004\u001a\u0014\u00103\u001a\u00020$*\u00020!2\b\b\u0001\u0010\"\u001a\u00020\u0003\u001a\u001b\u00104\u001a\u00020\u0014*\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u00a2\u0006\u0002\u00101\u001a\n\u00105\u001a\u00020\u0003*\u00020\'\u001a4\u00106\u001a\u000207*\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u0003\u001a\n\u0010=\u001a\u00020\u0003*\u00020\'\u001a\n\u0010>\u001a\u00020\f*\u00020?\u001a\n\u0010@\u001a\u00020\u0014*\u00020\u0004\u001a#\u0010@\u001a\u00020\u0014*\u00020A2\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040C\"\u00020\u0004\u00a2\u0006\u0002\u0010D\u001a\u001e\u0010E\u001a\u00020\u0004*\u00020F2\b\b\u0001\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\b\u001a\n\u0010I\u001a\u00020\u0014*\u00020\u0004\u001a.\u0010J\u001a\u00020\u0014*\u00020K2\u0006\u0010L\u001a\u00020M2\b\b\u0001\u0010N\u001a\u00020\u00032\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010P\u001a\u0018\u0010Q\u001a\u00020\u0014*\u00020\u00042\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140P\u001a \u0010Q\u001a\u00020\u0014*\u00020\u00042\u0006\u0010S\u001a\u00020\f2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140P\u001a\u0018\u0010T\u001a\u00020\u0014*\u00020\u00042\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140P\u001a\u0018\u0010V\u001a\u00020\u0014*\u00020\u00042\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0P\u001a\u0014\u0010W\u001a\u00020\u0014*\u00020\u00042\b\b\u0001\u0010X\u001a\u00020\u0003\u001a\u0014\u0010Y\u001a\u00020\u0014*\u00020\u00042\b\b\u0001\u0010Z\u001a\u00020\u0003\u001a:\u0010[\u001a\u00020\u0014*\u00020K2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010$\u001a?\u0010[\u001a\u00020\u0014*\u00020K2\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010^\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010_\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010`\u001a\'\u0010a\u001a\u00020\u0014*\u00020\u00042\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010d\u001a#\u0010e\u001a\u00020\u0014*\u00020f2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\u0002\b\u001c\u001a2\u0010g\u001a\u00020\u0014*\u00020\u00042\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u0003\u001a\u0012\u0010j\u001a\u00020\u0014*\u00020\u00042\u0006\u0010k\u001a\u00020\u0003\u001a\u0012\u0010l\u001a\u00020\u0014*\u00020\u00042\u0006\u0010m\u001a\u00020\u0003\u001a2\u0010n\u001a\u00020\u0014*\u00020\u00042\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u0003\u001a\u0014\u0010o\u001a\u00020\u0014*\u00020K2\b\b\u0001\u0010p\u001a\u00020\u0003\u001a\u0014\u0010q\u001a\u00020\u0014*\u00020K2\b\u0010r\u001a\u0004\u0018\u00010\f\u001a\u0014\u0010s\u001a\u00020\u0014*\u00020\u00042\b\b\u0002\u0010t\u001a\u00020\b\u001a6\u0010u\u001a\u00020\u0014*\u00020\u00042\u0006\u0010v\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010w\u001a\u00020\u00012\u0006\u0010x\u001a\u00020\u00012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010y\u001a\n\u0010z\u001a\u00020\f*\u00020?\u001a\u0012\u0010{\u001a\u00020\u0014*\u00020\u00042\u0006\u0010|\u001a\u00020$\u001a&\u0010}\u001a\u00020\u0014*\u00020!2\u0006\u0010~\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u007f\u001a\u00020\u0003\u001a\u000b\u0010\u0080\u0001\u001a\u00020\u0014*\u00020$\u001a5\u0010\u0081\u0001\u001a\u00020\u0014*\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\t*%\b\u0002\u0010\u0082\u0001\"\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u001a2\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u001a\u00a8\u0006\u0083\u0001"}, d2 = {"K_LUMINANCE", "", "countedMeasuredHeight", "", "Landroid/view/View;", "getCountedMeasuredHeight", "(Landroid/view/View;)I", "isVisible", "", "(Landroid/view/View;)Z", "getAllFlags", "", "", "intent", "Landroid/content/Intent;", "getLuminance", "", "color", "isDarkColor", "addHorizontalMarginItemDecoration", "", "Landroidx/recyclerview/widget/RecyclerView;", "marginLeft", "addListener", "Landroid/animation/Animator;", "init", "Lkotlin/Function1;", "Lua/privatbank/core/utils/AnimListenerHelper;", "Lkotlin/ExtensionFunctionType;", "addRippleBackground", "addVerticalMarginItemDecoration", "marginTop", "changeProgressBarColorAttr", "Landroid/widget/ProgressBar;", "attrId", "changeTint", "Landroid/graphics/drawable/Drawable;", "idAttr", "c", "Landroid/content/Context;", "mode", "Landroid/graphics/PorterDuff$Mode;", "Landroid/widget/ImageView;", "colorRes", "changeTintRaw", "mutateDrawable", "collapse", "duration", "", "(Landroid/view/View;Ljava/lang/Long;)V", "countMeasuredHeight", "createTintedIndeterminateDrawableCopy", "expand", "getDefaultActionBarHeight", "getRoundRectangleDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundColorAttr", "cornerRadii", "", "strokeWidth", "strokeColorAttr", "getStatusBarHeight", "getTrimText", "Landroid/widget/EditText;", "gone", "Landroidx/fragment/app/Fragment;", "view", "", "(Landroidx/fragment/app/Fragment;[Landroid/view/View;)V", "inflate", "Landroid/view/ViewGroup;", "layoutId", "isRoot", "invisible", "makePartOfTextClickable", "Landroid/widget/TextView;", "charSequence", "", "style", "onClick", "Lkotlin/Function0;", "onClickSingle", "callback", "tag", "postOnGlobalLayoutChange", "listener", "postOnPreDrawListener", "setBackgroundTintCompat", "colorInt", "setBackgroundTintCompatAttr", "colorAttr", "setDrawables", "start", "top", "end", "bottom", "(Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setLayoutSize", "width", "height", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setListener", "Landroid/view/ViewPropertyAnimator;", "setMargins", "left", "right", "setPaddingBottom", "paddingBottom", "setPaddingTop", "paddingTop", "setPaddings", "setTextColorFromAttr", "textColorAttr", "setTextOrHide", "textMess", "show", "visible", "translationYWithAlphaChange", "value", "startAlpha", "endAlpha", "Landroid/animation/Animator$AnimatorListener;", "trimText", "updateBackground", "drawable", "updateProgressWithAnimation", "newProgress", "fromProgress", "vectorAnimationStart", "withRoundRectDrawable", "AnimListener", "core_debug"})
public final class ViewExtKt {
    public static final float K_LUMINANCE = 0.225F;
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show, boolean visible) {
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$gone) {
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$gone, @org.jetbrains.annotations.NotNull()
    android.view.View... view) {
    }
    
    public static final void invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$invisible) {
    }
    
    public static final boolean isVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isVisible) {
        return false;
    }
    
    public static final void setPaddingTop(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setPaddingTop, int paddingTop) {
    }
    
    public static final void setPaddingBottom(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setPaddingBottom, int paddingBottom) {
    }
    
    public static final void setPaddings(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setPaddings, int left, int top, int right, int bottom) {
    }
    
    public static final void setMargins(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setMargins, int left, int top, int right, int bottom) {
    }
    
    public static final void translationYWithAlphaChange(@org.jetbrains.annotations.NotNull()
    android.view.View $this$translationYWithAlphaChange, float value, long duration, float startAlpha, float endAlpha, @org.jetbrains.annotations.Nullable()
    android.animation.Animator.AnimatorListener listener) {
    }
    
    public static final int getCountedMeasuredHeight(@org.jetbrains.annotations.NotNull()
    android.view.View $this$countedMeasuredHeight) {
        return 0;
    }
    
    public static final void vectorAnimationStart(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$vectorAnimationStart) {
    }
    
    public static final void setTextOrHide(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTextOrHide, @org.jetbrains.annotations.Nullable()
    java.lang.String textMess) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTrimText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$getTrimText) {
        return null;
    }
    
    public static final void updateBackground(@org.jetbrains.annotations.NotNull()
    android.view.View $this$updateBackground, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void postOnGlobalLayoutChange(@org.jetbrains.annotations.NotNull()
    android.view.View $this$postOnGlobalLayoutChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    public static final void postOnPreDrawListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$postOnPreDrawListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> listener) {
    }
    
    public static final void changeTint(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView $this$changeTint, @androidx.annotation.AttrRes()
    int colorRes) {
    }
    
    public static final void changeTintRaw(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView $this$changeTintRaw, @androidx.annotation.ColorInt()
    int color, boolean mutateDrawable) {
    }
    
    public static final void changeTint(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable $this$changeTint, @androidx.annotation.AttrRes()
    int idAttr, @org.jetbrains.annotations.Nullable()
    android.content.Context c, @org.jetbrains.annotations.NotNull()
    android.graphics.PorterDuff.Mode mode) {
    }
    
    public static final void changeTintRaw(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable $this$changeTintRaw, @androidx.annotation.ColorInt()
    int color, @org.jetbrains.annotations.Nullable()
    android.content.Context c) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$inflate, @androidx.annotation.LayoutRes()
    int layoutId, boolean isRoot) {
        return null;
    }
    
    public static final int countMeasuredHeight(@org.jetbrains.annotations.NotNull()
    android.view.View $this$countMeasuredHeight) {
        return 0;
    }
    
    public static final void setListener(@org.jetbrains.annotations.NotNull()
    android.view.ViewPropertyAnimator $this$setListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.utils.AnimListenerHelper, kotlin.Unit> init) {
    }
    
    public static final void addListener(@org.jetbrains.annotations.NotNull()
    android.animation.Animator $this$addListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.utils.AnimListenerHelper, kotlin.Unit> init) {
    }
    
    public static final void addRippleBackground(@org.jetbrains.annotations.NotNull()
    android.view.View $this$addRippleBackground) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String trimText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$trimText) {
        return null;
    }
    
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getStatusBarHeight) {
        return 0;
    }
    
    public static final int getDefaultActionBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDefaultActionBarHeight) {
        return 0;
    }
    
    public static final void makePartOfTextClickable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$makePartOfTextClickable, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, @androidx.annotation.StyleRes()
    int style, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public static final void updateProgressWithAnimation(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar $this$updateProgressWithAnimation, int newProgress, long duration, int fromProgress) {
    }
    
    public static final void setLayoutSize(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setLayoutSize, @org.jetbrains.annotations.Nullable()
    java.lang.Integer width, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height) {
    }
    
    public static final void setTextColorFromAttr(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTextColorFromAttr, @androidx.annotation.AttrRes()
    int textColorAttr) {
    }
    
    public static final void setDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setDrawables, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer start, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer top, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer end, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer bottom) {
    }
    
    public static final void setDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setDrawables, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable start, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable top, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable end, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable bottom) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable createTintedIndeterminateDrawableCopy(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar $this$createTintedIndeterminateDrawableCopy, @androidx.annotation.AttrRes()
    int attrId) {
        return null;
    }
    
    public static final void withRoundRectDrawable(@org.jetbrains.annotations.NotNull()
    android.view.View $this$withRoundRectDrawable, int backgroundColorAttr, @org.jetbrains.annotations.Nullable()
    float[] cornerRadii, int strokeWidth, int strokeColorAttr) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.GradientDrawable getRoundRectangleDrawable(@org.jetbrains.annotations.NotNull()
    android.view.View $this$getRoundRectangleDrawable, int backgroundColorAttr, @org.jetbrains.annotations.Nullable()
    float[] cornerRadii, int strokeWidth, int strokeColorAttr) {
        return null;
    }
    
    public static final void setBackgroundTintCompat(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setBackgroundTintCompat, @androidx.annotation.ColorInt()
    int colorInt) {
    }
    
    public static final void setBackgroundTintCompatAttr(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setBackgroundTintCompatAttr, @androidx.annotation.AttrRes()
    int colorAttr) {
    }
    
    public static final void addVerticalMarginItemDecoration(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addVerticalMarginItemDecoration, int marginTop) {
    }
    
    public static final void addHorizontalMarginItemDecoration(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addHorizontalMarginItemDecoration, int marginLeft) {
    }
    
    public static final void collapse(@org.jetbrains.annotations.NotNull()
    android.view.View $this$collapse, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration) {
    }
    
    public static final void expand(@org.jetbrains.annotations.NotNull()
    android.view.View $this$expand, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration) {
    }
    
    public static final void onClickSingle(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onClickSingle, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void onClickSingle(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onClickSingle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final boolean isDarkColor(int color) {
        return false;
    }
    
    public static final double getLuminance(@androidx.annotation.ColorInt()
    int color) {
        return 0.0;
    }
    
    /**
     * Return list of all flags which were set to `intent`. This is intended solely for debugging.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getAllFlags(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    public static final void changeProgressBarColorAttr(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar $this$changeProgressBarColorAttr, @androidx.annotation.AttrRes()
    int attrId) {
    }
}