package ua.privatbank.core.network.mockserver;

import io.reactivex.Single;
import ua.privatbank.core.network.NetworkConfiguration;
import ua.privatbank.core.network.OkhttpNetworkConfiguration;
import ua.privatbank.core.network.defaults.Network;
import ua.privatbank.core.network.helpers.NetworkConfBuilder;
import ua.privatbank.core.network.helpers.ParamsHolder;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00a2\u0006\u0002\u0010\bB\u00cc\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012h\u0010\t\u001ad\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012*\u0012(\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n\u0012S\u0010\u0014\u001aO\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012*\u0012(\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0015\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0001H\u0016J=\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u00052\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u00052\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u0010H\u0016Rp\u0010\t\u001ad\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012*\u0012(\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R[\u0010\u0014\u001aO\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012*\u0012(\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lua/privatbank/core/network/mockserver/MockServerConfigurationSimple;", "Lua/privatbank/core/network/NetworkConfiguration;", "networkConfiguration", "getResponse", "Lkotlin/Function1;", "Lua/privatbank/core/network/helpers/ParamsHolder;", "Lio/reactivex/Single;", "", "(Lua/privatbank/core/network/NetworkConfiguration;Lkotlin/jvm/functions/Function1;)V", "createGetRequest", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "requestParams", "", "Lua/privatbank/core/network/helpers/NetworkConfBuilder;", "Lkotlin/ExtensionFunctionType;", "config", "Ljava/lang/reflect/Type;", "type", "createPostRequest", "Lkotlin/Function2;", "(Lua/privatbank/core/network/NetworkConfiguration;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "getNetworkConfiguration", "()Lua/privatbank/core/network/NetworkConfiguration;", "copy", "core_debug"})
public final class MockServerConfigurationSimple extends ua.privatbank.core.network.NetworkConfiguration {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.NetworkConfiguration networkConfiguration = null;
    private final kotlin.jvm.functions.Function3<ua.privatbank.core.network.helpers.ParamsHolder, kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit>, java.lang.reflect.Type, io.reactivex.Single<java.lang.String>> createGetRequest = null;
    private final kotlin.jvm.functions.Function2<ua.privatbank.core.network.helpers.ParamsHolder, kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit>, io.reactivex.Single<java.lang.String>> createPostRequest = null;
    
    public MockServerConfigurationSimple(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.NetworkConfiguration networkConfiguration, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super ua.privatbank.core.network.helpers.ParamsHolder, ? super kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit>, ? super java.lang.reflect.Type, ? extends io.reactivex.Single<java.lang.String>> createGetRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super ua.privatbank.core.network.helpers.ParamsHolder, ? super kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit>, ? extends io.reactivex.Single<java.lang.String>> createPostRequest) {
        super(null, null, null, null, null, null, null, null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.NetworkConfiguration getNetworkConfiguration() {
        return null;
    }
    
    public MockServerConfigurationSimple(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.NetworkConfiguration networkConfiguration, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.ParamsHolder, ? extends io.reactivex.Single<java.lang.String>> getResponse) {
        super(null, null, null, null, null, null, null, null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.String> createGetRequest(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder requestParams, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> config, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.String> createPostRequest(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder requestParams, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> config) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.network.NetworkConfiguration copy() {
        return null;
    }
}