package ua.privatbank.core.network.mockserver;

import com.google.gson.Gson;
import io.reactivex.Single;
import org.json.JSONObject;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.network.NetworkConfiguration;
import ua.privatbank.core.network.OkhttpNetworkConfiguration;
import ua.privatbank.core.network.errors.HttpException;
import ua.privatbank.core.network.helpers.NetworkConfBuilder;
import ua.privatbank.core.network.helpers.ParamsHolder;
import ua.privatbank.core.network.helpers.PrivatResponse;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0001H\u0016J=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0002`\u0015\u00a2\u0006\u0002\b\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0002`\u0015\u00a2\u0006\u0002\b\u0007H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lua/privatbank/core/network/mockserver/MockServerConfiguration;", "Lua/privatbank/core/network/NetworkConfiguration;", "networkConfiguration", "mockBuilder", "Lkotlin/Function1;", "Lua/privatbank/core/network/mockserver/MockData;", "", "Lkotlin/ExtensionFunctionType;", "(Lua/privatbank/core/network/NetworkConfiguration;Lkotlin/jvm/functions/Function1;)V", "logger", "Lua/privatbank/core/logger/Logger;", "getLogger", "()Lua/privatbank/core/logger/Logger;", "mockData", "copy", "createGetRequest", "Lio/reactivex/Single;", "", "requestParams", "Lua/privatbank/core/network/helpers/ParamsHolder;", "config", "Lua/privatbank/core/network/helpers/NetworkConfBuilder;", "type", "Ljava/lang/reflect/Type;", "createPostRequest", "getResponseFromMap", "core_debug"})
public final class MockServerConfiguration extends ua.privatbank.core.network.NetworkConfiguration {
    private final ua.privatbank.core.network.mockserver.MockData mockData = null;
    
    public MockServerConfiguration(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.NetworkConfiguration networkConfiguration, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData, kotlin.Unit> mockBuilder) {
        super(null, null, null, null, null, null, null, null, false);
    }
    
    private final ua.privatbank.core.logger.Logger getLogger() {
        return null;
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
    
    private final io.reactivex.Single<java.lang.String> getResponseFromMap(ua.privatbank.core.network.helpers.ParamsHolder requestParams) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.network.NetworkConfiguration copy() {
        return null;
    }
}