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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/utils/storage/DefaultEncryptionKeyGenerator;", "", "()V", "key", "", "getKey", "()Ljava/lang/String;", "needEncryptionDefaultValue", "", "getNeedEncryptionDefaultValue", "()Z", "old_key", "getOld_key", "core_debug"})
public final class DefaultEncryptionKeyGenerator {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.storage.DefaultEncryptionKeyGenerator INSTANCE = null;
    private static final boolean needEncryptionDefaultValue = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String old_key = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String key = null;
    
    private DefaultEncryptionKeyGenerator() {
        super();
    }
    
    public final boolean getNeedEncryptionDefaultValue() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOld_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
}