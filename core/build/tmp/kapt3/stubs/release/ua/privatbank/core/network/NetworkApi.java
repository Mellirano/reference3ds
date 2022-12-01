package ua.privatbank.core.network;

import com.google.gson.reflect.TypeToken;
import io.reactivex.Single;
import org.json.JSONObject;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import ua.privatbank.core.network.helpers.Header;
import ua.privatbank.core.network.helpers.NetworkConfBuilder;
import ua.privatbank.core.network.helpers.Param;
import ua.privatbank.core.network.helpers.ParamsHolder;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u007f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0006\b\u0000\u0010\u0012\u0018\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0002`\u00162\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015j\u0002`\u00182\u001f\b\n\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\u0002`\u001c\u00a2\u0006\u0002\b\u001dH\u0086\b\u00f8\u0001\u0000J%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00120\u001a\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u001f\u001a\u00020 H\u0081\bJ\u00a7\u0001\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0006\b\u0000\u0010\u0012\u0018\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0002`\u00162\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015j\u0002`\u00182\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\u001a\b\u0002\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0002`\u00162\u001f\b\n\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\u0002`\u001c\u00a2\u0006\u0002\b\u001dH\u0086\b\u00f8\u0001\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006$"}, d2 = {"Lua/privatbank/core/network/NetworkApi;", "", "baseUrl", "", "(Ljava/lang/String;)V", "networkConfiguration", "Lua/privatbank/core/network/NetworkConfiguration;", "(Lua/privatbank/core/network/NetworkConfiguration;)V", "getNetworkConfiguration", "()Lua/privatbank/core/network/NetworkConfiguration;", "parser", "Lua/privatbank/core/jsonconverter/JsonConverter;", "getParser$annotations", "()V", "getParser", "()Lua/privatbank/core/jsonconverter/JsonConverter;", "get", "Lio/reactivex/Single;", "T", "path", "queries", "", "Lua/privatbank/core/network/helpers/Param;", "headers", "Lua/privatbank/core/network/helpers/Header;", "config", "Lkotlin/Function1;", "", "Lua/privatbank/core/network/helpers/NetworkConfBuilder;", "Lkotlin/ExtensionFunctionType;", "getResponseParser", "type", "Ljava/lang/reflect/Type;", "post", "body", "bodyMap", "core_release"})
public final class NetworkApi {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.NetworkConfiguration networkConfiguration = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.jsonconverter.JsonConverter parser = null;
    
    public NetworkApi(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.NetworkConfiguration networkConfiguration) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.NetworkConfiguration getNetworkConfiguration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.jsonconverter.JsonConverter getParser() {
        return null;
    }
    
    @kotlin.PublishedApi()
    @java.lang.Deprecated()
    public static void getParser$annotations() {
    }
    
    public NetworkApi(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        super();
    }
}