package ua.privatbank.core.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import io.reactivex.subjects.BehaviorSubject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0007J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lua/privatbank/core/location/LocationHelper;", "Lua/privatbank/core/location/LocationHelperInterface;", "()V", "behaviorLocation", "Lio/reactivex/subjects/BehaviorSubject;", "Landroid/location/Location;", "getBehaviorLocation", "()Lio/reactivex/subjects/BehaviorSubject;", "lastLatLng", "Lua/privatbank/core/location/LatLng;", "getLastLatLng", "()Lua/privatbank/core/location/LatLng;", "lastLocation", "getLastLocation", "()Landroid/location/Location;", "locationLocationHandler", "Lua/privatbank/core/location/LocationHandler;", "init", "", "context", "Landroid/content/Context;", "locationListener", "Lua/privatbank/core/location/LocationListener;", "start", "startTracking", "stop", "stopTracking", "core_release"})
public final class LocationHelper implements ua.privatbank.core.location.LocationHelperInterface {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.location.LocationHelper INSTANCE = null;
    private static ua.privatbank.core.location.LocationHandler locationLocationHandler;
    
    private LocationHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.location.LatLng getLastLatLng() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getLastLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<android.location.Location> getBehaviorLocation() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.location.LocationListener locationListener) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void startTracking() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void stopTracking() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void start() {
    }
}