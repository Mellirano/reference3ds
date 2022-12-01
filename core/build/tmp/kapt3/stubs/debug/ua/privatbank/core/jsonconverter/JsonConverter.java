package ua.privatbank.core.jsonconverter;

import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J\u001b\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006H&\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\"\u0004\b\u0000\u0010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH&J+\u0010\f\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH&\u00a2\u0006\u0002\u0010\u0010J+\u0010\f\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH&\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0013\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH&\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H&J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004H&J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u0004H&J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004H&J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H&J\u0014\u0010#\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&J#\u0010$\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H&\u00a2\u0006\u0002\u0010\'\u00a8\u0006("}, d2 = {"Lua/privatbank/core/jsonconverter/JsonConverter;", "", "convertToJsonConverterObject", "data", "", "convertToJsonText", "T", "tObject", "(Ljava/lang/Object;)Ljava/lang/String;", "convertToJsonTextList", "", "tObjectsList", "convertToPojoModel", "jsonConverterObject", "tClass", "Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "convertToPojoModelFromJsonAny", "jsonAny", "convertToPojoModelList", "getElement", "Lua/privatbank/core/jsonconverter/ParsedElement;", "json", "name", "getStringValueByKey", "key", "getStringValueByKeyFromJsonAny", "getStringValueByKeyFromRawString", "jsonString", "getValueByKey", "getValueByKeyFromJsonString", "isJsonObjectNull", "", "jsonObject", "parse", "parseByType", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "core_debug"})
public abstract interface JsonConverter {
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T convertToPojoModel(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T convertToPojoModelFromJsonAny(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonAny, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.util.List<T> convertToPojoModelList(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.lang.String convertToJsonText(T tObject);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.util.List<java.lang.String> convertToJsonTextList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> tObjectsList);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValueByKey(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValueByKeyFromJsonString(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract boolean isJsonObjectNull(@org.jetbrains.annotations.Nullable()
    java.lang.Object jsonObject);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getStringValueByKey(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getStringValueByKeyFromRawString(@org.jetbrains.annotations.Nullable()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStringValueByKeyFromJsonAny(@org.jetbrains.annotations.Nullable()
    java.lang.Object jsonAny, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object convertToJsonConverterObject(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T convertToPojoModel(@org.jetbrains.annotations.NotNull()
    java.lang.Object jsonConverterObject, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass);
    
    public abstract <T extends java.lang.Object>T parseByType(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type);
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.jsonconverter.ParsedElement getElement(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.jsonconverter.ParsedElement parse(@org.jetbrains.annotations.Nullable()
    java.lang.String json);
}