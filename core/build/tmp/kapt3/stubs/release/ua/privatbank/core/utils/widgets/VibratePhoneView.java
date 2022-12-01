package ua.privatbank.core.utils.widgets;

import android.animation.*;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import kotlinx.android.synthetic.main.view_vibrate_phone.view.*;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0001$B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J4\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0014J\b\u0010 \u001a\u00020\u000eH\u0014J\b\u0010!\u001a\u00020\u000eH\u0002J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lua/privatbank/core/utils/widgets/VibratePhoneView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstAnimationSet", "Landroid/animation/AnimatorSet;", "secondAnimationSet", "thirdAnimationSet", "animateCircles", "", "createAnimator", "Landroid/animation/ObjectAnimator;", "view", "Landroid/view/View;", "propertyName", "", "repeatCount", "duration", "", "values", "", "", "makeRotateAnimation", "makeShakeAnimation", "from", "to", "onAttachedToWindow", "onDetachedFromWindow", "startAnimation", "stopAnimationSet", "animationSet", "Companion", "core_release"})
public final class VibratePhoneView extends android.widget.RelativeLayout {
    private android.animation.AnimatorSet firstAnimationSet;
    private android.animation.AnimatorSet secondAnimationSet;
    private android.animation.AnimatorSet thirdAnimationSet;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.widgets.VibratePhoneView.Companion Companion = null;
    private static final float ROTATION_ANIMATION_FROM = 0.0F;
    private static final float ROTATION_ANIMATION_TO = 359.0F;
    private static final long MAIN_DURATION = 1000L;
    private static final long FAST_DURATION = 1000L;
    private static final float SCALE_FROM_MEDIUM = 0.7F;
    private static final float SCALE_FROM_LARGE = 1.0F;
    private static final float SCALE_TO_LARGE = 1.3F;
    private static final float SCALE_TO_MEDIUM = 1.0F;
    private static final float HIDE_ALPHA = 0.0F;
    private static final float VISIBLE_ALPHA_MEDIUM = 1.0F;
    private static final float VISIBLE_ALPHA_LARGE = 0.2F;
    private static final java.lang.String ROTATION = "rotation";
    private static final java.lang.String SCALE_X = "scaleX";
    private static final java.lang.String SCALE_Y = "scaleY";
    private static final java.lang.String ALPHA = "alpha";
    private static final int REPEAT_COUNT = 0;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public VibratePhoneView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public VibratePhoneView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public VibratePhoneView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void startAnimation() {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    private final void stopAnimationSet(android.animation.AnimatorSet animationSet) {
    }
    
    private final void animateCircles() {
    }
    
    private final void makeRotateAnimation(android.view.View view, long duration) {
    }
    
    private final void makeShakeAnimation(android.view.View view, long duration, float from, float to) {
    }
    
    private final android.animation.ObjectAnimator createAnimator(android.view.View view, java.lang.String propertyName, int repeatCount, long duration, float... values) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lua/privatbank/core/utils/widgets/VibratePhoneView$Companion;", "", "()V", "ALPHA", "", "FAST_DURATION", "", "HIDE_ALPHA", "", "MAIN_DURATION", "REPEAT_COUNT", "", "ROTATION", "ROTATION_ANIMATION_FROM", "ROTATION_ANIMATION_TO", "SCALE_FROM_LARGE", "SCALE_FROM_MEDIUM", "SCALE_TO_LARGE", "SCALE_TO_MEDIUM", "SCALE_X", "SCALE_Y", "VISIBLE_ALPHA_LARGE", "VISIBLE_ALPHA_MEDIUM", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}