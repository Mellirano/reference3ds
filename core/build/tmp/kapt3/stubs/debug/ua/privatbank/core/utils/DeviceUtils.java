package ua.privatbank.core.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.core.content.ContextCompat;
import ua.privatbank.core.logger.LoggerFactory;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002&\'B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0004J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t\u00a8\u0006("}, d2 = {"Lua/privatbank/core/utils/DeviceUtils;", "", "()V", "IMEI_PREF_NAME", "", "SYN_IMEI_PREF_ARG", "brand", "kotlin.jvm.PlatformType", "getBrand", "()Ljava/lang/String;", "deviceModel", "getDeviceModel", "display", "getDisplay", "hardware", "getHardware", "imeiGenerated", "getImeiGenerated", "setImeiGenerated", "(Ljava/lang/String;)V", "industrialName", "getIndustrialName", "logger", "Lua/privatbank/core/logger/Logger;", "model", "getModel", "getApplicationVersion", "context", "Landroid/content/Context;", "getDeviceName", "getImeiFromPref", "pref", "Landroid/content/SharedPreferences;", "getVersionOs", "hasNfcHce", "", "isRooted", "isTabled", "Biometric", "Root", "core_debug"})
public final class DeviceUtils {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.DeviceUtils INSTANCE = null;
    private static final java.lang.String SYN_IMEI_PREF_ARG = "imei_generated";
    private static final java.lang.String IMEI_PREF_NAME = "pref_name_imei_generated";
    private static final ua.privatbank.core.logger.Logger logger = null;
    private static final java.lang.String model = null;
    private static final java.lang.String brand = null;
    private static final java.lang.String industrialName = null;
    private static final java.lang.String display = null;
    private static final java.lang.String hardware = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String deviceModel = null;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String imeiGenerated;
    
    private DeviceUtils() {
        super();
    }
    
    public final java.lang.String getModel() {
        return null;
    }
    
    public final java.lang.String getBrand() {
        return null;
    }
    
    public final java.lang.String getIndustrialName() {
        return null;
    }
    
    public final java.lang.String getDisplay() {
        return null;
    }
    
    public final java.lang.String getHardware() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImeiGenerated() {
        return null;
    }
    
    public final void setImeiGenerated(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isTabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImeiGenerated(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getImeiFromPref(android.content.SharedPreferences pref, android.content.Context context) {
        return null;
    }
    
    public final boolean isRooted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionOs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * HCE - Host card emulation
     */
    public final boolean hasNfcHce(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/utils/DeviceUtils$Biometric;", "", "()V", "biometricChecker", "Lua/privatbank/core/utils/DeviceUtils$Biometric$BiometricChecker;", "getBiometricChecker", "()Lua/privatbank/core/utils/DeviceUtils$Biometric$BiometricChecker;", "setBiometricChecker", "(Lua/privatbank/core/utils/DeviceUtils$Biometric$BiometricChecker;)V", "isSupportBiometric", "", "context", "Landroid/content/Context;", "BiometricChecker", "core_debug"})
    public static final class Biometric {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.utils.DeviceUtils.Biometric INSTANCE = null;
        
        /**
         * This object performs system feature check to ensure that the device supports fingerprint, iris, or face.
         * Currently, there is no FEATURE_IRIS and FEATURE_FACE constant on PackageManager
         * So, only check FEATURE_FINGERPRINT
         */
        @org.jetbrains.annotations.NotNull()
        private static ua.privatbank.core.utils.DeviceUtils.Biometric.BiometricChecker biometricChecker;
        
        private Biometric() {
            super();
        }
        
        public final boolean isSupportBiometric(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.utils.DeviceUtils.Biometric.BiometricChecker getBiometricChecker() {
            return null;
        }
        
        public final void setBiometricChecker(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.utils.DeviceUtils.Biometric.BiometricChecker p0) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lua/privatbank/core/utils/DeviceUtils$Biometric$BiometricChecker;", "", "isSupportBiometric", "", "context", "Landroid/content/Context;", "core_debug"})
        public static abstract interface BiometricChecker {
            
            public abstract boolean isSupportBiometric(@org.jetbrains.annotations.NotNull()
            android.content.Context context);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/utils/DeviceUtils$Root;", "", "()V", "isDeviceRooted", "", "()Z", "checkRootMethodUseSuShellCommand", "executeShellCommand", "command", "", "core_debug"})
    public static final class Root {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.utils.DeviceUtils.Root INSTANCE = null;
        private static final boolean isDeviceRooted = false;
        
        private Root() {
            super();
        }
        
        public final boolean isDeviceRooted() {
            return false;
        }
        
        private final boolean checkRootMethodUseSuShellCommand() {
            return false;
        }
        
        private final boolean executeShellCommand(java.lang.String command) {
            return false;
        }
    }
}