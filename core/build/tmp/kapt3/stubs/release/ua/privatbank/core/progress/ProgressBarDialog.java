package ua.privatbank.core.progress;

import android.animation.*;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.*;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogFragment;
import kotlinx.android.synthetic.main.progress_dialog_fragment_core.*;
import ua.privatbank.core.R;
import ua.privatbank.core.utils.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J,\u0010\"\u001a\n $*\u0004\u0018\u00010#0#2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\bH\u0016J\u001a\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016JE\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0004\u00a2\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000200H\u0002J\b\u00108\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0016J\b\u0010:\u001a\u00020\bH\u0016J\u0010\u0010;\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u0010<\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010=\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100J\b\u0010>\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014\u00a8\u0006@"}, d2 = {"Lua/privatbank/core/progress/ProgressBarDialog;", "Landroidx/fragment/app/DialogFragment;", "Lua/privatbank/core/progress/ProgressBarAction;", "()V", "isDialogCancelable", "", "onCanceledByUser", "Lkotlin/Function0;", "", "getOnCanceledByUser", "()Lkotlin/jvm/functions/Function0;", "setOnCanceledByUser", "(Lkotlin/jvm/functions/Function0;)V", "onDismissListener", "getOnDismissListener", "setOnDismissListener", "progressDrawable", "Landroid/graphics/drawable/Drawable;", "successDrawableId", "", "Ljava/lang/Integer;", "animateText", "changeProgressColor", "isError", "dismissAndCallCancelCallback", "hideMessage", "hideMessageAndShowDefaultProgressColor", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "onStart", "onViewCreated", "view", "putArguments", "isCancelable", "message", "", "progressBaseDrawableId", "progressDrawableId", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setDrawable", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "paramName", "showDefaultProgressColor", "showErrorMessage", "showErrorProgressColor", "showMessage", "showProgress", "showSuccess", "startAnimation", "Companion", "core_release"})
public class ProgressBarDialog extends androidx.fragment.app.DialogFragment implements ua.privatbank.core.progress.ProgressBarAction {
    private android.graphics.drawable.Drawable progressDrawable;
    private java.lang.Integer successDrawableId;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismissListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCanceledByUser;
    private boolean isDialogCancelable = false;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.progress.ProgressBarDialog.Companion Companion = null;
    private static final java.lang.String EXTRA_CANCELABLE = "EXTRA_CANCELABLE";
    private static final java.lang.String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    private static final java.lang.String EXTRA_BASE_DRAWABLE_ID = "EXTRA_BASE_DRAWABLE_ID";
    private static final java.lang.String EXTRA_DRAWABLE_ID = "EXTRA_DRAWABLE_ID";
    private static final java.lang.String EXTRA_ON_SUCCESS_DRAWABLE_ID = "EXTRA_ON_SUCCESS_DRAWABLE_ID";
    private static final long CHANGE_COLOR_ANIMATION_DURATION = 600L;
    private static final long TEXT_TRANSLATION_Y_ANIMATION_DURATION = 300L;
    private static final int TEXT_TRANSLATION_Y_IN_DP = 8;
    private static final float HIDE_ITEM_ALPHA = 0.0F;
    private static final float VISIBLE_ITEM_ALPHA = 1.0F;
    private java.util.HashMap _$_findViewCache;
    
    public ProgressBarDialog() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismissListener() {
        return null;
    }
    
    public final void setOnDismissListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCanceledByUser() {
        return null;
    }
    
    public final void setOnCanceledByUser(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    protected final void putArguments(boolean isCancelable, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer progressBaseDrawableId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer progressDrawableId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer successDrawableId) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final void dismissAndCallCancelCallback() {
    }
    
    private final void setDrawable(androidx.appcompat.widget.AppCompatImageView imageView, java.lang.String paramName) {
    }
    
    private final void startAnimation() {
    }
    
    private final void changeProgressColor(boolean isError) {
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void animateText() {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showErrorProgressColor() {
    }
    
    @java.lang.Override()
    public void showDefaultProgressColor() {
    }
    
    @java.lang.Override()
    public void hideMessage() {
    }
    
    @java.lang.Override()
    public void hideMessageAndShowDefaultProgressColor() {
    }
    
    public final void showSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JC\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lua/privatbank/core/progress/ProgressBarDialog$Companion;", "", "()V", "CHANGE_COLOR_ANIMATION_DURATION", "", "EXTRA_BASE_DRAWABLE_ID", "", "EXTRA_CANCELABLE", "EXTRA_DRAWABLE_ID", "EXTRA_MESSAGE", "EXTRA_ON_SUCCESS_DRAWABLE_ID", "HIDE_ITEM_ALPHA", "", "TEXT_TRANSLATION_Y_ANIMATION_DURATION", "TEXT_TRANSLATION_Y_IN_DP", "", "VISIBLE_ITEM_ALPHA", "newInstance", "Lua/privatbank/core/progress/ProgressBarDialog;", "isCancelable", "", "message", "progressBaseDrawableId", "progressDrawableId", "successDrawableId", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lua/privatbank/core/progress/ProgressBarDialog;", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.progress.ProgressBarDialog newInstance(boolean isCancelable, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Integer progressBaseDrawableId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer progressDrawableId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer successDrawableId) {
            return null;
        }
    }
}