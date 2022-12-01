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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lua/privatbank/core/location/LocationListener;", "", "updateLocation", "", "location", "Landroid/location/Location;", "core_release"})
public abstract interface LocationListener {
    
    public abstract void updateLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location location);
}