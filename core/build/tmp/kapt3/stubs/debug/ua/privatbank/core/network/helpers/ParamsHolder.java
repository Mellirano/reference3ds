package ua.privatbank.core.network.helpers;

import org.json.JSONObject;
import java.net.HttpURLConnection;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006H\u00c6\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\bH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u00c6\u0003JY\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u00062\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0002`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lua/privatbank/core/network/helpers/ParamsHolder;", "", "path", "", "header", "", "Lua/privatbank/core/network/helpers/Header;", "queries", "Lua/privatbank/core/network/helpers/Param;", "body", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lorg/json/JSONObject;)V", "getBody", "()Lorg/json/JSONObject;", "getHeader", "()Ljava/util/Map;", "getPath", "()Ljava/lang/String;", "getQueries", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_debug"})
public final class ParamsHolder {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String path = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> header = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> queries = null;
    @org.jetbrains.annotations.Nullable()
    private final org.json.JSONObject body = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.helpers.ParamsHolder copy(@org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queries, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject body) {
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
    
    public ParamsHolder() {
        super();
    }
    
    public ParamsHolder(@org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queries, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject body) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject getBody() {
        return null;
    }
}