package ua.privatbank.core.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import android.os.Build;
import android.widget.TextView;

/**
 * Temporary class, that should be removed when com.google.android.material:material 1.1.0 will be in stable release
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/widgets/TextInputEditTextMeizuFix;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getHint", "", "getSuperHintHack", "core_debug"})
@java.lang.Deprecated()
public final class TextInputEditTextMeizuFix extends com.google.android.material.textfield.TextInputEditText {
    private java.util.HashMap _$_findViewCache;
    
    public TextInputEditTextMeizuFix(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getHint() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchFieldException.class, java.lang.IllegalAccessException.class})
    private final java.lang.CharSequence getSuperHintHack() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        return null;
    }
}