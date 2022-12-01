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

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a#\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004\u00a2\u0006\u0002\u0010\b\u001a\u0014\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"hasGrantedPermission", "", "Landroid/content/Context;", "permission", "", "hasGrantedPermissions", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "vibrate", "", "milliseconds", "", "core_release"})
public final class DeviceUtilsKt {
    
    public static final boolean hasGrantedPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hasGrantedPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
        return false;
    }
    
    public static final boolean hasGrantedPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hasGrantedPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public static final void vibrate(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$vibrate, long milliseconds) {
    }
}