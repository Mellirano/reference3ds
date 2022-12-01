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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000\u00120\b\u0002\u0010\n\u001a*\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\b\u0012\u00060\rj\u0002`\u000e0\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0010J.\u0010\u001d\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\b\u0010 \u001a\u0004\u0018\u00010\u00022\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0086\n\u00a2\u0006\u0002\u0010#J,\u0010\u001e\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u00022\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R9\u0010\n\u001a*\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\b\u0012\u00060\rj\u0002`\u000e0\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001f\u00a8\u0006%"}, d2 = {"Lua/privatbank/core/utils/storage/ModelPrefDelegate;", "T", "", "preferences", "Landroid/content/SharedPreferences;", "jsonConverter", "Lua/privatbank/core/jsonconverter/JsonConverter;", "key", "", "defValue", "errorUnit", "Lkotlin/Function1;", "Lkotlin/Triple;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Landroid/content/SharedPreferences;Lua/privatbank/core/jsonconverter/JsonConverter;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getDefValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorUnit", "()Lkotlin/jvm/functions/Function1;", "getJsonConverter", "()Lua/privatbank/core/jsonconverter/JsonConverter;", "getKey", "()Ljava/lang/String;", "getPreferences", "()Landroid/content/SharedPreferences;", "value", "getValue", "setValue", "(Ljava/lang/Object;)V", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "core_debug"})
public final class ModelPrefDelegate<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.jsonconverter.JsonConverter jsonConverter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    @org.jetbrains.annotations.Nullable()
    private final T defValue = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<kotlin.Triple<java.lang.String, java.lang.String, ? extends java.lang.Exception>, kotlin.Unit> errorUnit = null;
    @org.jetbrains.annotations.Nullable()
    private T value;
    
    public ModelPrefDelegate(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.jsonconverter.JsonConverter jsonConverter, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    T defValue, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super kotlin.Triple<java.lang.String, java.lang.String, ? extends java.lang.Exception>, kotlin.Unit> errorUnit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.jsonconverter.JsonConverter getJsonConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getDefValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<kotlin.Triple<java.lang.String, java.lang.String, ? extends java.lang.Exception>, kotlin.Unit> getErrorUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, T value) {
    }
}