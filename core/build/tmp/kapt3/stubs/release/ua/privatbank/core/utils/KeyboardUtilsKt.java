package ua.privatbank.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\n\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u00a8\u0006\u000f"}, d2 = {"focusAndShowKeyboard", "", "view", "Landroid/view/View;", "hideKeyboard", "Landroid/app/Activity;", "Landroid/content/Context;", "binder", "Landroid/os/IBinder;", "resultReceiver", "Landroid/os/ResultReceiver;", "editText", "result", "hideKeyboardWithResult", "showKeyboard", "core_release"})
public final class KeyboardUtilsKt {
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View editText, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver result) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View editText, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver result) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View editText) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.os.IBinder binder) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.os.IBinder binder, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver resultReceiver) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final void hideKeyboardWithResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboardWithResult, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver resultReceiver) {
    }
    
    public static final void focusAndShowKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}