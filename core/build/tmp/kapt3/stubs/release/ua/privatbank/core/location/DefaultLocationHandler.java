package ua.privatbank.core.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0016J$\u0010\u001b\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0017J\b\u0010!\u001a\u00020\u0015H\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lua/privatbank/core/location/DefaultLocationHandler;", "Lua/privatbank/core/location/LocationHandler;", "Landroid/location/LocationListener;", "context", "Landroid/content/Context;", "locationListener", "Lua/privatbank/core/location/LocationListener;", "(Landroid/content/Context;Lua/privatbank/core/location/LocationListener;)V", "action", "", "broadCast", "Landroid/content/BroadcastReceiver;", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager$delegate", "Lkotlin/Lazy;", "isLocationEnabled", "", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "p0", "onProviderEnabled", "onStatusChanged", "p1", "", "p2", "Landroid/os/Bundle;", "startListenLocation", "stopListenLocation", "core_release"})
public final class DefaultLocationHandler extends ua.privatbank.core.location.LocationHandler implements android.location.LocationListener {
    private final android.content.Context context = null;
    private final java.lang.String action = "android.location.PROVIDERS_CHANGED";
    private final kotlin.Lazy locationManager$delegate = null;
    private final android.content.BroadcastReceiver broadCast = null;
    
    public DefaultLocationHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.location.LocationListener locationListener) {
        super(null);
    }
    
    private final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final boolean isLocationEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, int p1, @org.jetbrains.annotations.Nullable()
    android.os.Bundle p2) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void startListenLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void stopListenLocation() {
    }
}