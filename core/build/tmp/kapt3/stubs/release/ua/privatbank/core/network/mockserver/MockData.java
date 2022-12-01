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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003&\'(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u001a\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0086\u0004J&\u0010\u001a\u001a\u00020\u0018*\u00020\u000b2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u001c\u00a2\u0006\u0002\b\u001dH\u0086\u0004J\u0015\u0010\u001e\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0086\u0004J&\u0010\u001f\u001a\u00020\u0018*\u00020\u000b2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00180\u001c\u00a2\u0006\u0002\b\u001dH\u0086\u0004J\u0019\u0010\"\u001a\u00020\u0018*\u00020\u000b2\n\u0010#\u001a\u00060$j\u0002`%H\u0086\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lua/privatbank/core/network/mockserver/MockData;", "", "()V", "strictMode", "", "getStrictMode", "()Z", "setStrictMode", "(Z)V", "stubsData", "", "", "Ljava/util/ArrayList;", "Lua/privatbank/core/network/mockserver/MockData$Scenario;", "Lkotlin/collections/ArrayList;", "getResponse", "key", "Lua/privatbank/core/network/helpers/ParamsHolder;", "result", "Lua/privatbank/core/network/mockserver/MockData$TestResponse;", "code", "", "body", "setRequestParams", "", "requestParams", "response", "dataBlock", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "responseObj", "stubs", "mockBuilder", "Lua/privatbank/core/network/mockserver/MockData$GroupScenarioBuilder;", "throwException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "GroupScenarioBuilder", "Scenario", "TestResponse", "core_release"})
public final class MockData {
    private java.util.Map<java.lang.String, java.util.ArrayList<ua.privatbank.core.network.mockserver.MockData.Scenario>> stubsData;
    private boolean strictMode = false;
    
    public MockData() {
        super();
    }
    
    public final boolean getStrictMode() {
        return false;
    }
    
    public final void setStrictMode(boolean p0) {
    }
    
    public final void setRequestParams(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.helpers.ParamsHolder requestParams) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.network.mockserver.MockData.Scenario getResponse(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.helpers.ParamsHolder key) {
        return null;
    }
    
    public final void response(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$response, @org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    public final void responseObj(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$responseObj, @org.jetbrains.annotations.NotNull()
    java.lang.Object response) {
    }
    
    public final void throwException(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$throwException, @org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    public final void response(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$response, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData.TestResponse, kotlin.Unit> dataBlock) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.mockserver.MockData.TestResponse result(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
        return null;
    }
    
    public final void stubs(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$stubs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData.GroupScenarioBuilder, kotlin.Unit> mockBuilder) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lua/privatbank/core/network/mockserver/MockData$TestResponse;", "", "code", "", "body", "", "(ILjava/lang/String;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
    public static final class TestResponse {
        private int code;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String body;
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.network.mockserver.MockData.TestResponse copy(int code, @org.jetbrains.annotations.NotNull()
        java.lang.String body) {
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
        
        public TestResponse() {
            super();
        }
        
        public TestResponse(int code, @org.jetbrains.annotations.NotNull()
        java.lang.String body) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
        
        public final void setCode(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        public final void setBody(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005J\u001f\u0010\b\u001a\u00020\t2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\u0002\b\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/network/mockserver/MockData$GroupScenarioBuilder;", "", "()V", "stubs", "Ljava/util/ArrayList;", "Lua/privatbank/core/network/mockserver/MockData$Scenario;", "getStubs", "()Ljava/util/ArrayList;", "scenario", "", "scenarioName", "", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "core_release"})
    public static final class GroupScenarioBuilder {
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<ua.privatbank.core.network.mockserver.MockData.Scenario> stubs = null;
        
        public GroupScenarioBuilder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<ua.privatbank.core.network.mockserver.MockData.Scenario> getStubs() {
            return null;
        }
        
        public final void scenario(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData.Scenario, kotlin.Unit> init) {
        }
        
        public final void scenario(@org.jetbrains.annotations.NotNull()
        java.lang.String scenarioName, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData.Scenario, kotlin.Unit> init) {
        }
        
        public final void scenario(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario scenario) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010C\u001a\u00020\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u00020$0\tH\u0086\u0004J\u0014\u0010\b\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tJ\u000e\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u0013J\b\u0010F\u001a\u00020\u0003H\u0016J\u001b\u0010\u0018\u001a\u00020\u0019*\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\tH\u0086\u0004J\u0015\u0010=\u001a\u00020\u0019*\u00020\u00002\u0006\u0010=\u001a\u00020\u0003H\u0086\u0004J&\u0010=\u001a\u00020\u0019*\u00020\u00002\u0017\u0010G\u001a\u0013\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00190H\u00a2\u0006\u0002\bJH\u0086\u0004J\u0015\u0010K\u001a\u00020\u0019*\u00020\u00002\u0006\u0010=\u001a\u00020\u0001H\u0086\u0004J\u0019\u0010L\u001a\u00020\u0019*\u00020\u00002\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eH\u0086\u0004R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\"\u0010\u001c\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001d\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030(8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010&R\u0011\u0010,\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010(8F\u00a2\u0006\u0006\u001a\u0004\b7\u0010*R\u001a\u00108\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u0004\u0018\u00010\u00038FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010?\u00a8\u0006M"}, d2 = {"Lua/privatbank/core/network/mockserver/MockData$Scenario;", "", "scenarioName", "", "_response", "_responseCode", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "action", "Lkotlin/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "body", "Lorg/json/JSONObject;", "getBody", "()Lorg/json/JSONObject;", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "endAction", "", "getEndAction", "setEndAction", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getException", "()Ljava/lang/Exception;", "setException", "(Ljava/lang/Exception;)V", "hasJsonBody", "", "getHasJsonBody", "()Z", "header", "", "getHeader", "()Ljava/util/Map;", "isGet", "isPost", "params", "Lua/privatbank/core/network/helpers/ParamsHolder;", "getParams", "()Lua/privatbank/core/network/helpers/ParamsHolder;", "setParams", "(Lua/privatbank/core/network/helpers/ParamsHolder;)V", "predicate", "getPredicate$core_release", "setPredicate$core_release", "query", "getQuery", "requestCode", "getRequestCode", "()I", "setRequestCode", "(I)V", "response", "getResponse", "()Ljava/lang/String;", "setResponse", "(Ljava/lang/String;)V", "getScenarioName", "When", "delayMillis", "millis", "toString", "dataBlock", "Lkotlin/Function1;", "Lua/privatbank/core/network/mockserver/MockData$TestResponse;", "Lkotlin/ExtensionFunctionType;", "responseObj", "throwException", "core_release"})
    public static final class Scenario {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String scenarioName = null;
        @org.jetbrains.annotations.Nullable()
        private ua.privatbank.core.network.helpers.ParamsHolder params;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Exception exception;
        private long delay = 0L;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function0<java.lang.Boolean> predicate;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function0<java.lang.String> action;
        private int requestCode;
        private final boolean hasJsonBody = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String response;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function0<kotlin.Unit> endAction;
        
        public Scenario() {
            super();
        }
        
        public Scenario(@org.jetbrains.annotations.Nullable()
        java.lang.String scenarioName, @org.jetbrains.annotations.Nullable()
        java.lang.String _response, int _responseCode) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getScenarioName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ua.privatbank.core.network.helpers.ParamsHolder getParams() {
            return null;
        }
        
        public final void setParams(@org.jetbrains.annotations.Nullable()
        ua.privatbank.core.network.helpers.ParamsHolder p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Object> getQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getHeader() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.json.JSONObject getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public final void setException(@org.jetbrains.annotations.Nullable()
        java.lang.Exception p0) {
        }
        
        public final long getDelay() {
            return 0L;
        }
        
        public final void setDelay(long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<java.lang.Boolean> getPredicate$core_release() {
            return null;
        }
        
        public final void setPredicate$core_release(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<java.lang.Boolean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<java.lang.String> getAction() {
            return null;
        }
        
        public final void setAction(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<java.lang.String> p0) {
        }
        
        public final int getRequestCode() {
            return 0;
        }
        
        public final void setRequestCode(int p0) {
        }
        
        public final boolean getHasJsonBody() {
            return false;
        }
        
        public final boolean isGet() {
            return false;
        }
        
        public final boolean isPost() {
            return false;
        }
        
        public final void setResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getResponse() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getEndAction() {
            return null;
        }
        
        public final void setEndAction(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        }
        
        public final void When(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Boolean> predicate) {
        }
        
        public final void action(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.String> action) {
        }
        
        public final void response(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario $this$response, @org.jetbrains.annotations.NotNull()
        java.lang.String response) {
        }
        
        public final void response(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario $this$response, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.mockserver.MockData.TestResponse, kotlin.Unit> dataBlock) {
        }
        
        public final void responseObj(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario $this$responseObj, @org.jetbrains.annotations.NotNull()
        java.lang.Object response) {
        }
        
        public final void endAction(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario $this$endAction, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> endAction) {
        }
        
        public final void delayMillis(long millis) {
        }
        
        public final void throwException(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.network.mockserver.MockData.Scenario $this$throwException, @org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}