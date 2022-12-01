package ua.privatbank.core.utils;

import androidx.annotation.StringRes;
import com.google.android.material.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004J(\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0019H\u0016J\u001a\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004J(\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lua/privatbank/core/utils/TextWatcherDsl;", "Landroid/text/TextWatcher;", "()V", "listenerAfter", "Lkotlin/Function1;", "Landroid/text/Editable;", "", "getListenerAfter", "()Lkotlin/jvm/functions/Function1;", "setListenerAfter", "(Lkotlin/jvm/functions/Function1;)V", "listenerBefore", "", "getListenerBefore", "setListenerBefore", "listenerOn", "getListenerOn", "setListenerOn", "after", "listener", "afterTextChanged", "s", "before", "beforeTextChanged", "start", "", "count", "onText", "onTextChanged", "core_debug"})
public final class TextWatcherDsl implements android.text.TextWatcher {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> listenerAfter;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> listenerBefore;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> listenerOn;
    
    public TextWatcherDsl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> getListenerAfter() {
        return null;
    }
    
    public final void setListenerAfter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.CharSequence, kotlin.Unit> getListenerBefore() {
        return null;
    }
    
    public final void setListenerBefore(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.CharSequence, kotlin.Unit> getListenerOn() {
        return null;
    }
    
    public final void setListenerOn(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> p0) {
    }
    
    public final void after(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> listener) {
    }
    
    public final void before(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> listener) {
    }
    
    public final void onText(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
}