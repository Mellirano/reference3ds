package ua.privatbank.core.utils;

import android.security.keystore.KeyProperties;
import ua.privatbank.core.logger.LoggerFactory;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/utils/EncryptionUtils;", "", "()V", "createCipher", "Ljavax/crypto/Cipher;", "opmode", "", "password", "", "decrypt", "value", "encrypt", "core_debug"})
public final class EncryptionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.EncryptionUtils INSTANCE = null;
    
    private EncryptionUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private final javax.crypto.Cipher createCipher(int opmode, java.lang.String password) {
        return null;
    }
}