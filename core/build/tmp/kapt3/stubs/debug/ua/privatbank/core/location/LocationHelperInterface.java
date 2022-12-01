package ua.privatbank.core.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import io.reactivex.subjects.BehaviorSubject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/location/LocationHelperInterface;", "", "lastLatLng", "Lua/privatbank/core/location/LatLng;", "getLastLatLng", "()Lua/privatbank/core/location/LatLng;", "start", "", "stop", "core_debug"})
public abstract interface LocationHelperInterface {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.privatbank.core.location.LatLng getLastLatLng();
    
    public abstract void stop();
    
    public abstract void start();
}