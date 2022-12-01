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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lua/privatbank/core/utils/storage/StringPrefDelegate;", "Lua/privatbank/core/utils/storage/BasePrefDelegate;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "defaultValue", "needEncryption", "", "customEncryptionKey", "cacheInRam", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getCustomEncryptionKey", "()Ljava/lang/String;", "setCustomEncryptionKey", "(Ljava/lang/String;)V", "getNeedEncryption", "()Z", "getEncryptionKey", "restoreFromPref", "saveToPref", "", "value", "core_release"})
public final class StringPrefDelegate extends ua.privatbank.core.utils.storage.BasePrefDelegate<java.lang.String> {
    private final boolean needEncryption = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String customEncryptionKey;
    
    public StringPrefDelegate(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue, boolean needEncryption, @org.jetbrains.annotations.Nullable()
    java.lang.String customEncryptionKey, boolean cacheInRam) {
        super(null, null, null, false);
    }
    
    public final boolean getNeedEncryption() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomEncryptionKey() {
        return null;
    }
    
    public final void setCustomEncryptionKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String restoreFromPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    public void saveToPref(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private final java.lang.String getEncryptionKey() {
        return null;
    }
}