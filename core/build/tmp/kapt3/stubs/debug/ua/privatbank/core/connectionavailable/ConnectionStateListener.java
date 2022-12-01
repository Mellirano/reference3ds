package ua.privatbank.core.connectionavailable;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import ua.privatbank.core.logger.Logger;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019J\u001e\u0010\u001a\u001a\u0018\u0012\u0006\b\u0000\u0012\u00020\t\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00192\u0006\u0010\"\u001a\u00020\tH\u0002J\u0018\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020&H\u0016J\u0016\u0010\'\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020&J\b\u0010(\u001a\u00020$H\u0014J\b\u0010)\u001a\u00020$H\u0014J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0002H\u0014J\u0006\u0010,\u001a\u00020$J\u0016\u0010-\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020&J\b\u0010.\u001a\u00020$H\u0002J\u000e\u0010/\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u00100\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lua/privatbank/core/connectionavailable/ConnectionStateListener;", "Landroidx/lifecycle/LiveData;", "Lua/privatbank/core/connectionavailable/ConnectionState;", "context", "Landroid/content/Context;", "logger", "Lua/privatbank/core/logger/Logger;", "(Landroid/content/Context;Lua/privatbank/core/logger/Logger;)V", "isActive", "", "isOnMainThread", "()Z", "networkChangeDisposable", "Lio/reactivex/disposables/Disposable;", "networkPingService", "Lua/privatbank/core/connectionavailable/NetworkPingService;", "networkReceiver", "Landroid/content/BroadcastReceiver;", "networkSubject", "Lio/reactivex/subjects/Subject;", "reconnectionThresholdMillis", "", "stateSubject", "wasConnectionStateShown", "asRx", "Lio/reactivex/Observable;", "createDebounceNetworkFun", "Lio/reactivex/functions/Function;", "Lio/reactivex/ObservableSource;", "", "getValue", "isOnline", "mapHardwareConnectionToConnectionState", "", "result", "observeForever", "", "observer", "Landroidx/lifecycle/Observer;", "observeForeverOnMainThread", "onActive", "onInactive", "postValue", "value", "refresh", "removeObserverOnMainThread", "sendConnectionStateToNetworkSubject", "setReconnectionThresholdMillis", "setValue", "Companion", "core_debug"})
public final class ConnectionStateListener extends androidx.lifecycle.LiveData<ua.privatbank.core.connectionavailable.ConnectionState> {
    private final android.content.Context context = null;
    private final ua.privatbank.core.logger.Logger logger = null;
    private long reconnectionThresholdMillis = 2000L;
    private io.reactivex.disposables.Disposable networkChangeDisposable;
    private io.reactivex.subjects.Subject<java.lang.Boolean> networkSubject;
    private final io.reactivex.subjects.Subject<ua.privatbank.core.connectionavailable.ConnectionState> stateSubject = null;
    private final ua.privatbank.core.connectionavailable.NetworkPingService networkPingService = null;
    private boolean isActive = false;
    private final android.content.BroadcastReceiver networkReceiver = null;
    private boolean wasConnectionStateShown = false;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.connectionavailable.ConnectionStateListener.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECTION_STATE_LISTENER = "ConnectionStateListener";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_SUBJECT = "networkSubject";
    private static final java.lang.String TAG = null;
    private static final int DEFAULT_RECONNECTION_THRESHOLD_MILLIS = 2000;
    
    public ConnectionStateListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.logger.Logger logger) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    private final io.reactivex.Observable<java.lang.Integer> mapHardwareConnectionToConnectionState(boolean result) {
        return null;
    }
    
    private final io.reactivex.functions.Function<? super java.lang.Boolean, ? extends io.reactivex.ObservableSource<java.lang.Object>> createDebounceNetworkFun() {
        return null;
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.reactivex.annotations.NonNull()
    @java.lang.Override()
    public ua.privatbank.core.connectionavailable.ConnectionState getValue() {
        return null;
    }
    
    public final void setReconnectionThresholdMillis(long reconnectionThresholdMillis) {
    }
    
    private final boolean isOnline(android.content.Context context) {
        return false;
    }
    
    @java.lang.Override()
    protected void setValue(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.connectionavailable.ConnectionState value) {
    }
    
    @java.lang.Override()
    protected void postValue(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.connectionavailable.ConnectionState value) {
    }
    
    /**
     * Doesn't creates LiveData observers, just silently listening for connections changes,
     * if there are any active observer
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<ua.privatbank.core.connectionavailable.ConnectionState> asRx() {
        return null;
    }
    
    @java.lang.Override()
    public void observeForever(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super ua.privatbank.core.connectionavailable.ConnectionState> observer) {
    }
    
    public final void observeForeverOnMainThread(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super ua.privatbank.core.connectionavailable.ConnectionState> observer) {
    }
    
    public final void removeObserverOnMainThread(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super ua.privatbank.core.connectionavailable.ConnectionState> observer) {
    }
    
    private final boolean isOnMainThread() {
        return false;
    }
    
    private final void sendConnectionStateToNetworkSubject() {
    }
    
    public final void refresh() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/connectionavailable/ConnectionStateListener$Companion;", "", "()V", "CONNECTION_STATE_LISTENER", "", "DEFAULT_RECONNECTION_THRESHOLD_MILLIS", "", "NETWORK_SUBJECT", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final java.lang.String getTAG() {
            return null;
        }
    }
}