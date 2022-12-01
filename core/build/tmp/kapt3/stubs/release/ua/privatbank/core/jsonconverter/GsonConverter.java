package ua.privatbank.core.jsonconverter;

import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001b\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u0002H\u0012H\u0016\u00a2\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\"\u0004\b\u0000\u0010\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0016H\u0016J+\u0010\u0018\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ+\u0010\u0018\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001bH\u0016\u00a2\u0006\u0002\u0010\u001dJ+\u0010\u001e\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00120\u0016\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001bH\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J\u001a\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001c\u0010\'\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001c\u0010(\u001a\u0004\u0018\u00010\u00102\b\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001a\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0016J)\u0010/\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u00100\u001a\u0002012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001bH\u0002\u00a2\u0006\u0002\u00102J-\u0010/\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010/\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0016J#\u00103\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010#\u001a\u00020\u00102\u0006\u00104\u001a\u000205H\u0016\u00a2\u0006\u0002\u00106J.\u00107\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u000108\"\u0004\b\u0000\u0010\u00122\u0006\u00109\u001a\u00020:2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006;"}, d2 = {"Lua/privatbank/core/jsonconverter/GsonConverter;", "Lua/privatbank/core/jsonconverter/JsonConverter;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getGson", "()Lcom/google/gson/Gson;", "jsonParser", "Lcom/google/gson/JsonParser;", "getJsonParser", "()Lcom/google/gson/JsonParser;", "jsonParser$delegate", "Lkotlin/Lazy;", "convertToJsonConverterObject", "", "data", "", "convertToJsonText", "T", "object", "(Ljava/lang/Object;)Ljava/lang/String;", "convertToJsonTextList", "", "objectsList", "convertToPojoModel", "jsonConverterObject", "tClass", "Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "convertToPojoModelFromJsonAny", "jsonAny", "convertToPojoModelList", "getElement", "Lua/privatbank/core/jsonconverter/ParsedElement;", "json", "name", "getStringValueByKey", "key", "getStringValueByKeyFromJsonAny", "getStringValueByKeyFromRawString", "jsonString", "getValueByKey", "getValueByKeyFromJsonString", "isJsonObjectNull", "", "jsonObject", "parse", "element", "Lcom/google/gson/JsonElement;", "(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;", "parseByType", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "parseCollection", "", "jsonArray", "Lcom/google/gson/JsonArray;", "core_release"})
public final class GsonConverter implements ua.privatbank.core.jsonconverter.JsonConverter {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    private final kotlin.Lazy jsonParser$delegate = null;
    
    public GsonConverter(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isJsonObjectNull(@org.jetbrains.annotations.Nullable()
    java.lang.Object jsonObject) {
        return false;
    }
    
    private final com.google.gson.JsonParser getJsonParser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>T convertToPojoModel(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends java.lang.Object>java.lang.String convertToJsonText(T object) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends java.lang.Object>java.util.List<java.lang.String> convertToJsonTextList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> objectsList) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValueByKey(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValueByKeyFromJsonString(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getStringValueByKey(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getStringValueByKeyFromRawString(@org.jetbrains.annotations.Nullable()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStringValueByKeyFromJsonAny(@org.jetbrains.annotations.Nullable()
    java.lang.Object jsonAny, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends java.lang.Object>java.util.List<T> convertToPojoModelList(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.util.Collection<T> parseCollection(com.google.gson.JsonArray jsonArray, java.lang.Class<T> tClass) {
        return null;
    }
    
    private final <T extends java.lang.Object>T parse(com.google.gson.JsonElement element, java.lang.Class<T> tClass) {
        return null;
    }
    
    private final <T extends java.lang.Object>T parse(java.lang.String data, java.lang.Class<T> tClass) {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>T parseByType(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.privatbank.core.jsonconverter.ParsedElement parse(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.privatbank.core.jsonconverter.ParsedElement getElement(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object convertToJsonConverterObject(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>T convertToPojoModel(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>T convertToPojoModelFromJsonAny(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonAny, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass) {
        return null;
    }
}