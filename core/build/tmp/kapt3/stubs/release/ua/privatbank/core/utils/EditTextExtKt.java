package ua.privatbank.core.utils;

import androidx.annotation.StringRes;
import com.google.android.material.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u001e\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u001a#\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0002\b\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0012\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"string", "", "Landroid/widget/EditText;", "getString", "(Landroid/widget/EditText;)Ljava/lang/String;", "hideError", "", "Lcom/google/android/material/textfield/TextInputLayout;", "onFocusChange", "onFocus", "Lkotlin/Function1;", "", "onTextChange", "init", "Lua/privatbank/core/utils/TextWatcherDsl;", "Lkotlin/ExtensionFunctionType;", "showError", "messageId", "", "core_release"})
public final class EditTextExtKt {
    
    public static final void onTextChange(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onTextChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.utils.TextWatcherDsl, kotlin.Unit> init) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$string) {
        return null;
    }
    
    public static final void onFocusChange(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onFocusChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFocus) {
    }
    
    public static final void showError(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$showError, @androidx.annotation.StringRes()
    int messageId) {
    }
    
    public static final void hideError(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$hideError) {
    }
}