package ua.privatbank.core.network.helpers;

import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0016\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0016\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0016\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lua/privatbank/core/network/helpers/TimeOut;", "", "read", "Lua/privatbank/core/network/helpers/TimeInterval;", "write", "connect", "(Lua/privatbank/core/network/helpers/TimeInterval;Lua/privatbank/core/network/helpers/TimeInterval;Lua/privatbank/core/network/helpers/TimeInterval;)V", "getConnect", "()Lua/privatbank/core/network/helpers/TimeInterval;", "setConnect", "(Lua/privatbank/core/network/helpers/TimeInterval;)V", "getRead", "setRead", "getWrite", "setWrite", "component1", "component2", "component3", "", "time", "", "unit", "Ljava/util/concurrent/TimeUnit;", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_debug"})
public final class TimeOut {
    @org.jetbrains.annotations.NotNull()
    private ua.privatbank.core.network.helpers.TimeInterval read;
    @org.jetbrains.annotations.NotNull()
    private ua.privatbank.core.network.helpers.TimeInterval write;
    @org.jetbrains.annotations.NotNull()
    private ua.privatbank.core.network.helpers.TimeInterval connect;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeOut copy(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval read, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval write, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval connect) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TimeOut(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval read, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval write, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval connect) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval getRead() {
        return null;
    }
    
    public final void setRead(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval getWrite() {
        return null;
    }
    
    public final void setWrite(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeInterval getConnect() {
        return null;
    }
    
    public final void setConnect(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeInterval p0) {
    }
    
    public final void read(long time, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit unit) {
    }
    
    public final void write(long time, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit unit) {
    }
    
    public final void connect(long time, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit unit) {
    }
}