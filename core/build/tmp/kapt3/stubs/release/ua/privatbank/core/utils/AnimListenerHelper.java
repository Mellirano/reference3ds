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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u001e\u0010\r\u001a\u00020\u00062\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u001e\u0010\u000e\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u001e\u0010\u000f\u001a\u00020\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/utils/AnimListenerHelper;", "Landroid/animation/Animator$AnimatorListener;", "()V", "animationCancel", "Lkotlin/Function1;", "Landroid/animation/Animator;", "", "Lua/privatbank/core/utils/AnimListener;", "animationEnd", "animationRepeat", "animationStart", "onAnimationCancel", "animation", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core_release"})
public final class AnimListenerHelper implements android.animation.Animator.AnimatorListener {
    private kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> animationStart;
    private kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> animationEnd;
    private kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> animationRepeat;
    private kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> animationCancel;
    
    public AnimListenerHelper() {
        super();
    }
    
    public final void onAnimationStart(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onAnimationStart) {
    }
    
    @java.lang.Override()
    public void onAnimationStart(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animation) {
    }
    
    public final void onAnimationRepeat(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onAnimationRepeat) {
    }
    
    @java.lang.Override()
    public void onAnimationRepeat(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animation) {
    }
    
    public final void onAnimationCancel(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onAnimationCancel) {
    }
    
    @java.lang.Override()
    public void onAnimationCancel(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animation) {
    }
    
    public final void onAnimationEnd(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onAnimationEnd) {
    }
    
    @java.lang.Override()
    public void onAnimationEnd(@org.jetbrains.annotations.NotNull()
    android.animation.Animator animation) {
    }
}