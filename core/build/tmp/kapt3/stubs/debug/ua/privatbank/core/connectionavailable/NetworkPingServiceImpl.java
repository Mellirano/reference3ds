package ua.privatbank.core.connectionavailable;

import androidx.core.util.Pair;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import ua.privatbank.core.logger.Logger;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0002J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u00060\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lua/privatbank/core/connectionavailable/NetworkPingServiceImpl;", "Lua/privatbank/core/connectionavailable/NetworkPingService;", "logger", "Lua/privatbank/core/logger/Logger;", "(Lua/privatbank/core/logger/Logger;)V", "isStarted", "", "pingDisposable", "Lio/reactivex/disposables/Disposable;", "pingErrorConsumer", "Lio/reactivex/functions/Consumer;", "", "pingObservable", "Lio/reactivex/Observable;", "getPingObservable", "()Lio/reactivex/Observable;", "primaryTcpPingPort", "", "Ljava/lang/Integer;", "publishSubjectInternet", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "findAvailableTcpPortRxSingle", "Lio/reactivex/Single;", "getPingObs", "isHostReachable", "serverAddress", "", "serverTCPPort", "timeoutMS", "isHostReachableRxSingle", "tcpPort", "start", "", "startPeriodicPing", "stop", "stopPeriodicPing", "Companion", "core_debug"})
public final class NetworkPingServiceImpl implements ua.privatbank.core.connectionavailable.NetworkPingService {
    private final ua.privatbank.core.logger.Logger logger = null;
    private java.lang.Integer primaryTcpPingPort;
    private io.reactivex.disposables.Disposable pingDisposable;
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubjectInternet = null;
    private boolean isStarted = false;
    private final io.reactivex.functions.Consumer<java.lang.Throwable> pingErrorConsumer = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Boolean> pingObservable = null;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.connectionavailable.NetworkPingServiceImpl.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String DEFAULT_PING_SERVER_ADDRESS = "8.8.8.8";
    private static final int DEFAULT_PING_TCP_PORT = 53;
    private static final java.util.List<java.lang.Integer> ALL_TCP_PORTS = null;
    private static final int DEFAULT_TIMEOUT_MILLIS = 3000;
    private static final int PING_DELAY_AFTER_SUCCESS_SECONDS = 3;
    private static final int PING_DELAY_AFTER_FAIL_SECONDS = 10;
    private static final int RETRY_COUNT_BEFORE_FAIL = 3;
    
    public NetworkPingServiceImpl(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.logger.Logger logger) {
        super();
    }
    
    private final io.reactivex.Single<java.lang.Integer> findAvailableTcpPortRxSingle() {
        return null;
    }
    
    private final boolean isHostReachable(java.lang.String serverAddress, int serverTCPPort, int timeoutMS) {
        return false;
    }
    
    private final io.reactivex.Single<java.lang.Boolean> isHostReachableRxSingle() {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.Boolean> isHostReachableRxSingle(int tcpPort) {
        return null;
    }
    
    private final void startPeriodicPing() {
    }
    
    private final io.reactivex.Single<java.lang.Boolean> getPingObs() {
        return null;
    }
    
    private final void stopPeriodicPing() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> getPingObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n \u0006*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lua/privatbank/core/connectionavailable/NetworkPingServiceImpl$Companion;", "", "()V", "ALL_TCP_PORTS", "", "", "kotlin.jvm.PlatformType", "", "DEFAULT_PING_SERVER_ADDRESS", "", "DEFAULT_PING_TCP_PORT", "DEFAULT_TIMEOUT_MILLIS", "PING_DELAY_AFTER_FAIL_SECONDS", "PING_DELAY_AFTER_SUCCESS_SECONDS", "RETRY_COUNT_BEFORE_FAIL", "TAG", "getTAG", "()Ljava/lang/String;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final java.lang.String getTAG() {
            return null;
        }
    }
}