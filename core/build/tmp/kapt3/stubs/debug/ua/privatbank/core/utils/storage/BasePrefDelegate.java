package ua.privatbank.core.utils.storage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.gson.reflect.TypeToken;
import ua.privatbank.core.BuildConfig;
import ua.privatbank.core.base.CoreApplication;
import ua.privatbank.core.jsonconverter.JsonConverter;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import ua.privatbank.core.utils.EncryptionUtils;
import kotlin.reflect.KProperty;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u0015\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0086\u0002\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001eJ,\u0010\u001f\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010 R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00028\u0000X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006!"}, d2 = {"Lua/privatbank/core/utils/storage/BasePrefDelegate;", "T", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "cacheInRam", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;Z)V", "getCacheInRam", "()Z", "getDefaultValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "getPreferences", "()Landroid/content/SharedPreferences;", "value", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "restoreFromPref", "(Ljava/lang/String;)Ljava/lang/Object;", "saveToPref", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "core_debug"})
public abstract class BasePrefDelegate<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    private final T defaultValue = null;
    private final boolean cacheInRam = false;
    private T value;
    
    public BasePrefDelegate(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T defaultValue, boolean cacheInRam) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    protected final T getDefaultValue() {
        return null;
    }
    
    public final boolean getCacheInRam() {
        return false;
    }
    
    public final T getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, T value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract T restoreFromPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void saveToPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T value);
}