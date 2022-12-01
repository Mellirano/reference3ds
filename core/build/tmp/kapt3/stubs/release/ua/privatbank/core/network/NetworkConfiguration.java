package ua.privatbank.core.network;

import io.reactivex.Single;
import ua.privatbank.core.network.defaults.DefaultConfiguration;
import ua.privatbank.core.network.helpers.*;
import java.lang.reflect.Type;
import javax.net.ssl.SSLSocketFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0016J\u001a\u0010?\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020@0\u0012J\u001a\u0010C\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020@0\u0012J\u000e\u0010\u001b\u001a\u00020@2\u0006\u0010E\u001a\u00020\u0003J\u0012\u0010F\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010H\u001a\u00020\u0000H&J=\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030J2\u0006\u0010K\u001a\u00020L2\u001d\u0010M\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020@\u0018\u00010\u0012j\u0002`N\u00a2\u0006\u0002\bO2\u0006\u0010P\u001a\u00020QH&J5\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030J2\u0006\u0010K\u001a\u00020L2\u001d\u0010M\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020@\u0018\u00010\u0012j\u0002`N\u00a2\u0006\u0002\bOH&J\u001a\u0010\u000b\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020@0\u0012J\u001a\u0010\r\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020@0\u0012J\u000e\u0010S\u001a\u00020B2\u0006\u0010T\u001a\u00020LJ\u001f\u0010U\u001a\u00020@2\u0017\u0010V\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020@0\u0012\u00a2\u0006\u0002\bOR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>\u00a8\u0006W"}, d2 = {"Lua/privatbank/core/network/NetworkConfiguration;", "", "_baseUrl", "", "headers", "", "Lua/privatbank/core/network/helpers/Header;", "queries", "Lua/privatbank/core/network/helpers/Param;", "timeOut", "Lua/privatbank/core/network/helpers/TimeOut;", "inInterceptor", "Lua/privatbank/core/network/helpers/InInterceptor;", "outInterceptor", "Lua/privatbank/core/network/helpers/OutInterceptor;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "errorInterceptor", "Lkotlin/Function1;", "", "", "retryOnConnectionFailure", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lua/privatbank/core/network/helpers/TimeOut;Lua/privatbank/core/network/helpers/InInterceptor;Lua/privatbank/core/network/helpers/OutInterceptor;Ljavax/net/ssl/SSLSocketFactory;Lkotlin/jvm/functions/Function1;Z)V", "get_baseUrl", "()Ljava/lang/String;", "set_baseUrl", "(Ljava/lang/String;)V", "baseUrl", "getBaseUrl", "getErrorInterceptor", "()Lkotlin/jvm/functions/Function1;", "setErrorInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "extraInInterceptors", "", "getExtraInInterceptors", "()Ljava/util/List;", "extraOutInterceptors", "getExtraOutInterceptors", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getInInterceptor", "()Lua/privatbank/core/network/helpers/InInterceptor;", "setInInterceptor", "(Lua/privatbank/core/network/helpers/InInterceptor;)V", "getOutInterceptor", "()Lua/privatbank/core/network/helpers/OutInterceptor;", "setOutInterceptor", "(Lua/privatbank/core/network/helpers/OutInterceptor;)V", "getQueries", "setQueries", "getRetryOnConnectionFailure", "()Z", "setRetryOnConnectionFailure", "(Z)V", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)V", "getTimeOut", "()Lua/privatbank/core/network/helpers/TimeOut;", "addExtraInInterceptor", "", "callback", "Lua/privatbank/core/network/helpers/MutableRequestParams;", "addExtraOutInterceptor", "Lua/privatbank/core/network/helpers/PrivatResponse;", "url", "buildUrl", "path", "copy", "createGetRequest", "Lio/reactivex/Single;", "requestParams", "Lua/privatbank/core/network/helpers/ParamsHolder;", "config", "Lua/privatbank/core/network/helpers/NetworkConfBuilder;", "Lkotlin/ExtensionFunctionType;", "type", "Ljava/lang/reflect/Type;", "createPostRequest", "prepareParams", "paramsHolder", "timeout", "init", "core_release"})
public abstract class NetworkConfiguration {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String _baseUrl;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> headers;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, ? extends java.lang.Object> queries;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.helpers.TimeOut timeOut = null;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.network.helpers.InInterceptor inInterceptor;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.network.helpers.OutInterceptor outInterceptor;
    @org.jetbrains.annotations.Nullable()
    private javax.net.ssl.SSLSocketFactory sslSocketFactory;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> errorInterceptor;
    private boolean retryOnConnectionFailure;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.privatbank.core.network.helpers.InInterceptor> extraInInterceptors = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.privatbank.core.network.helpers.OutInterceptor> extraOutInterceptors = null;
    
    public NetworkConfiguration() {
        super();
    }
    
    public NetworkConfiguration(@org.jetbrains.annotations.Nullable()
    java.lang.String _baseUrl, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queries, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.TimeOut timeOut, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.InInterceptor inInterceptor, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.OutInterceptor outInterceptor, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLSocketFactory sslSocketFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> errorInterceptor, boolean retryOnConnectionFailure) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String get_baseUrl() {
        return null;
    }
    
    public final void set_baseUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    public final void setHeaders(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getQueries() {
        return null;
    }
    
    public final void setQueries(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.TimeOut getTimeOut() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.network.helpers.InInterceptor getInInterceptor() {
        return null;
    }
    
    public final void setInInterceptor(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.InInterceptor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.network.helpers.OutInterceptor getOutInterceptor() {
        return null;
    }
    
    public final void setOutInterceptor(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.OutInterceptor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return null;
    }
    
    public final void setSslSocketFactory(@org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLSocketFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> getErrorInterceptor() {
        return null;
    }
    
    public final void setErrorInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> p0) {
    }
    
    public final boolean getRetryOnConnectionFailure() {
        return false;
    }
    
    public final void setRetryOnConnectionFailure(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ua.privatbank.core.network.helpers.InInterceptor> getExtraInInterceptors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ua.privatbank.core.network.helpers.OutInterceptor> getExtraOutInterceptors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    public final void baseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void timeout(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.TimeOut, kotlin.Unit> init) {
    }
    
    public final void outInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.PrivatResponse, kotlin.Unit> callback) {
    }
    
    public final void inInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.MutableRequestParams, kotlin.Unit> callback) {
    }
    
    public final void addExtraInInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.MutableRequestParams, kotlin.Unit> callback) {
    }
    
    public final void addExtraOutInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.helpers.PrivatResponse, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.String> createGetRequest(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder requestParams, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> config, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.String> createPostRequest(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder requestParams, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> config);
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.privatbank.core.network.NetworkConfiguration copy();
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.MutableRequestParams prepareParams(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder paramsHolder) {
        return null;
    }
    
    private final java.lang.String buildUrl(java.lang.String path) {
        return null;
    }
}