package ua.privatbank.core.location;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.ContextCompat;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0004J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0004J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0004J\b\u0010 \u001a\u00020\u0017H&J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H&J\b\u0010#\u001a\u00020\u0017H\u0002R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lua/privatbank/core/location/LocationHandler;", "", "locationListener", "Lua/privatbank/core/location/LocationListener;", "(Lua/privatbank/core/location/LocationListener;)V", "behaviorLocation", "Lio/reactivex/subjects/BehaviorSubject;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "getBehaviorLocation", "()Lio/reactivex/subjects/BehaviorSubject;", "handler", "Landroid/os/Handler;", "<set-?>", "lastLocation", "getLastLocation", "()Landroid/location/Location;", "setLastLocation", "(Landroid/location/Location;)V", "getLocationListener", "()Lua/privatbank/core/location/LocationListener;", "resetLocationRunnable", "Lkotlin/Function0;", "", "isPermissionsGranted", "", "context", "Landroid/content/Context;", "notifyObservables", "location", "setTimer", "timerToStart", "startListenLocation", "startTimer", "stopListenLocation", "stopTimer", "Companion", "core_release"})
public abstract class LocationHandler {
    @org.jetbrains.annotations.Nullable()
    private final ua.privatbank.core.location.LocationListener locationListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.location.LocationHandler.Companion Companion = null;
    public static final long POLLING_FREQ = 30000L;
    public static final long FASTEST_UPDATE_FREQ = 5000L;
    public static final float DISPLACEMENT = 3000.0F;
    private static final long TIME_TO_RESET_LOCATION_MIN = 10L;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<android.location.Location> behaviorLocation = null;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastLocation;
    private final android.os.Handler handler = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> resetLocationRunnable = null;
    
    public LocationHandler(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.location.LocationListener locationListener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.location.LocationListener getLocationListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<android.location.Location> getBehaviorLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLastLocation() {
        return null;
    }
    
    protected final void setLastLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public abstract void startListenLocation();
    
    public abstract void stopListenLocation();
    
    protected final void notifyObservables(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    protected final void setTimer(boolean timerToStart) {
    }
    
    private final void stopTimer() {
    }
    
    private final void startTimer() {
    }
    
    protected final boolean isPermissionsGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/location/LocationHandler$Companion;", "", "()V", "DISPLACEMENT", "", "FASTEST_UPDATE_FREQ", "", "POLLING_FREQ", "TIME_TO_RESET_LOCATION_MIN", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}