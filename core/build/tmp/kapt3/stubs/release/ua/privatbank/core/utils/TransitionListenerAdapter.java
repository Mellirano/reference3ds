package ua.privatbank.core.utils;

import android.os.Build;
import androidx.annotation.RequiresApi;
import android.transition.Transition;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/utils/TransitionListenerAdapter;", "Landroid/transition/Transition$TransitionListener;", "()V", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core_release"})
public abstract class TransitionListenerAdapter implements android.transition.Transition.TransitionListener {
    
    public TransitionListenerAdapter() {
        super();
    }
    
    @java.lang.Override()
    public void onTransitionEnd(@org.jetbrains.annotations.Nullable()
    android.transition.Transition transition) {
    }
    
    @java.lang.Override()
    public void onTransitionResume(@org.jetbrains.annotations.Nullable()
    android.transition.Transition transition) {
    }
    
    @java.lang.Override()
    public void onTransitionPause(@org.jetbrains.annotations.Nullable()
    android.transition.Transition transition) {
    }
    
    @java.lang.Override()
    public void onTransitionCancel(@org.jetbrains.annotations.Nullable()
    android.transition.Transition transition) {
    }
    
    @java.lang.Override()
    public void onTransitionStart(@org.jetbrains.annotations.Nullable()
    android.transition.Transition transition) {
    }
}