package ua.privatbank.core.network.defaults;

import ua.privatbank.core.network.NetworkApi;
import ua.privatbank.core.network.NetworkConfiguration;
import ua.privatbank.core.network.mockserver.MockData;
import ua.privatbank.core.network.mockserver.MockServerConfiguration;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\u0002\b\u0012R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/network/defaults/Network;", "", "()V", "api", "Lua/privatbank/core/network/NetworkApi;", "getApi", "()Lua/privatbank/core/network/NetworkApi;", "netApi", "init", "", "baseUrl", "", "networkConfiguration", "Lua/privatbank/core/network/NetworkConfiguration;", "mock", "mockBuilder", "Lkotlin/Function1;", "Lua/privatbank/core/network/mockserver/MockData;", "Lkotlin/ExtensionFunctionType;", "core_debug"})
public final class Network {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.network.defaults.Network INSTANCE = null;
    private static ua.privatbank.core.network.NetworkApi netApi;
    
    private Network() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.NetworkApi getApi() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.NetworkConfiguration networkConfiguration) {
    }
    
    public final void mock(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData, kotlin.Unit> mockBuilder) {
    }
}