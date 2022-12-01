package ua.privatbank.core.toolbar;

import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0003\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00028\u00002\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\n\u001a\u00028\u00002\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/toolbar/HasTitle;", "T", "", "title", "", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "stringId", "", "(Ljava/lang/Integer;)Ljava/lang/Object;", "titleTextAppearance", "titleTextColor", "textColor", "core_debug"})
public abstract interface HasTitle<T extends java.lang.Object> {
    
    public abstract T title(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title);
    
    public abstract T title(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stringId);
    
    public abstract T titleTextAppearance(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StyleRes()
    java.lang.Integer titleTextAppearance);
    
    public abstract T titleTextColor(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    java.lang.Integer textColor);
}