package ua.privatbank.core.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import io.reactivex.subjects.BehaviorSubject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/location/LocationHandlerFactory;", "", "()V", "create", "Lua/privatbank/core/location/LocationHandler;", "context", "Landroid/content/Context;", "isGooglePlayAvailable", "", "locationListener", "Lua/privatbank/core/location/LocationListener;", "core_debug"})
final class LocationHandlerFactory {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.location.LocationHandlerFactory INSTANCE = null;
    
    private LocationHandlerFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.location.LocationHandler create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isGooglePlayAvailable, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.location.LocationListener locationListener) {
        return null;
    }
}