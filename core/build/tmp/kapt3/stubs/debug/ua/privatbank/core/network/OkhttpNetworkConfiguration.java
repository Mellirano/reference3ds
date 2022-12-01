package ua.privatbank.core.network;

import io.reactivex.Single;
import ua.privatbank.core.BuildConfig;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.network.defaults.DefaultConfiguration;
import ua.privatbank.core.network.errors.HttpException;
import ua.privatbank.core.network.helpers.*;
import ua.privatbank.core.network.interceptors.GzipDecompressInterceptor;
import ua.privatbank.core.network.interceptors.HttpLoggingInterceptor;
import ua.privatbank.core.network.interceptors.LevelDef;
import java.lang.reflect.Type;
import javax.net.ssl.SSLSocketFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005j\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0017JK\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010!\u001a\u00020\"2\u001f\b\u0002\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010\u0013j\u0002`%\u00a2\u0006\u0002\b&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0013H\u0002J\b\u0010*\u001a\u00020\u0001H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0001H\u0002J=\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010.\u001a\u00020\"2\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010\u0013j\u0002`%\u00a2\u0006\u0002\b&2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002022\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u0010.\u001a\u00020(H\u0002J5\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010.\u001a\u00020\"2\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010\u0013j\u0002`%\u00a2\u0006\u0002\b&H\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lua/privatbank/core/network/OkhttpNetworkConfiguration;", "Lua/privatbank/core/network/NetworkConfiguration;", "_baseUrl", "", "headers", "", "Lua/privatbank/core/network/helpers/Header;", "queries", "", "Lua/privatbank/core/network/helpers/Param;", "timeOut", "Lua/privatbank/core/network/helpers/TimeOut;", "inInterceptor", "Lua/privatbank/core/network/helpers/InInterceptor;", "outInterceptor", "Lua/privatbank/core/network/helpers/OutInterceptor;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "errorInterceptor", "Lkotlin/Function1;", "", "", "retryOnConnectionFailure", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lua/privatbank/core/network/helpers/TimeOut;Lua/privatbank/core/network/helpers/InInterceptor;Lua/privatbank/core/network/helpers/OutInterceptor;Ljavax/net/ssl/SSLSocketFactory;Lkotlin/jvm/functions/Function1;Z)V", "defaultClient", "Lokhttp3/OkHttpClient;", "defaultOkHttpClient", "getDefaultOkHttpClient", "()Lokhttp3/OkHttpClient;", "jsonMediaType", "Lokhttp3/MediaType;", "baseRequest", "Lio/reactivex/Single;", "paramsHolder", "Lua/privatbank/core/network/helpers/ParamsHolder;", "config", "", "Lua/privatbank/core/network/helpers/NetworkConfBuilder;", "Lkotlin/ExtensionFunctionType;", "createRequest", "Lua/privatbank/core/network/helpers/MutableRequestParams;", "Lokhttp3/Request;", "copy", "createClientByConfiguration", "networkConfiguration", "createGetRequest", "requestParams", "type", "Ljava/lang/reflect/Type;", "createOkhttpBaseRequest", "Lokhttp3/Request$Builder;", "createOkhttpGetRequest", "createOkhttpPostRequest", "createPostRequest", "core_debug"})
public final class OkhttpNetworkConfiguration extends ua.privatbank.core.network.NetworkConfiguration {
    private final okhttp3.MediaType jsonMediaType = null;
    private okhttp3.OkHttpClient defaultClient;
    
    public OkhttpNetworkConfiguration(@org.jetbrains.annotations.Nullable()
    java.lang.String _baseUrl, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queries, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeOut timeOut, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.InInterceptor inInterceptor, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.OutInterceptor outInterceptor, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLSocketFactory sslSocketFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> errorInterceptor, boolean retryOnConnectionFailure) {
        super(null, null, null, null, null, null, null, null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getDefaultOkHttpClient() {
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
    
    private final okhttp3.Request createOkhttpGetRequest(ua.privatbank.core.network.helpers.MutableRequestParams requestParams) {
        return null;
    }
    
    private final okhttp3.Request createOkhttpPostRequest(ua.privatbank.core.network.helpers.MutableRequestParams requestParams) {
        return null;
    }
    
    private final okhttp3.Request.Builder createOkhttpBaseRequest(ua.privatbank.core.network.helpers.MutableRequestParams requestParams) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.String> baseRequest(ua.privatbank.core.network.helpers.ParamsHolder paramsHolder, kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> config, kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.MutableRequestParams, okhttp3.Request> createRequest) {
        return null;
    }
    
    private final okhttp3.OkHttpClient createClientByConfiguration(ua.privatbank.core.network.NetworkConfiguration networkConfiguration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.network.NetworkConfiguration copy() {
        return null;
    }
}