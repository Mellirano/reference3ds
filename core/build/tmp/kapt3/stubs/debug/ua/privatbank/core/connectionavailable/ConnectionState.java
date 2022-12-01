package ua.privatbank.core.connectionavailable;

import androidx.annotation.IntDef;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/connectionavailable/ConnectionState;", "", "value", "", "(I)V", "getValue", "()I", "isAtLeast", "", "state", "isAtLeast$core_debug", "toString", "", "Companion", "Def", "core_debug"})
public final class ConnectionState {
    @ua.privatbank.core.connectionavailable.ConnectionState.Def()
    private final int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.connectionavailable.ConnectionState.Companion Companion = null;
    
    /**
     * No connection on hardware layer, e.g. mobile network or wi-fi network is disconnected
     */
    public static final int DISCONNECTED = 0;
    
    /**
     * Has connection on hardware layer,
     * but still has no successful ping response-request to ping server
     */
    public static final int CONNECTING = 1;
    
    /**
     * Has connection on hardware layer,
     * and successful result ping response-request from ping server
     */
    public static final int CONNECTED = 2;
    
    public ConnectionState(int value) {
        super();
    }
    
    @ua.privatbank.core.connectionavailable.ConnectionState.Def()
    public final int getValue() {
        return 0;
    }
    
    public final boolean isAtLeast$core_debug(@ua.privatbank.core.connectionavailable.ConnectionState.Def()
    int state) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @androidx.annotation.IntDef(value = {0, 1, 2})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lua/privatbank/core/connectionavailable/ConnectionState$Def;", "", "core_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Def {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/connectionavailable/ConnectionState$Companion;", "", "()V", "CONNECTED", "", "CONNECTING", "DISCONNECTED", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}