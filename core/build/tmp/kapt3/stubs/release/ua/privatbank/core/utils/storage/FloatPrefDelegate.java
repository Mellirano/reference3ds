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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/utils/storage/FloatPrefDelegate;", "Lua/privatbank/core/utils/storage/BasePrefDelegate;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defVal", "(Landroid/content/SharedPreferences;Ljava/lang/String;F)V", "restoreFromPref", "(Ljava/lang/String;)Ljava/lang/Float;", "saveToPref", "", "value", "core_release"})
public final class FloatPrefDelegate extends ua.privatbank.core.utils.storage.BasePrefDelegate<java.lang.Float> {
    
    public FloatPrefDelegate(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key, float defVal) {
        super(null, null, null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Float restoreFromPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    public void saveToPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
}