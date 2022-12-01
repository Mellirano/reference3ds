package ua.privatbank.core.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lua/privatbank/core/location/FusedLocationHandler;", "Lua/privatbank/core/location/LocationHandler;", "context", "Landroid/content/Context;", "locationListener", "Lua/privatbank/core/location/LocationListener;", "(Landroid/content/Context;Lua/privatbank/core/location/LocationListener;)V", "getContext", "()Landroid/content/Context;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kotlin.jvm.PlatformType", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "startListenLocation", "", "stopListenLocation", "core_debug"})
public final class FusedLocationHandler extends ua.privatbank.core.location.LocationHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    public FusedLocationHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.location.LocationListener locationListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void startListenLocation() {
    }
    
    @java.lang.Override()
    public void stopListenLocation() {
    }
}