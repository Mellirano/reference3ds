package ua.privatbank.core.jsonconverter;

import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/jsonconverter/ParsedElement;", "", "asArray", "Lua/privatbank/core/jsonconverter/ParsedArray;", "asString", "", "getField", "name", "core_release"})
public abstract interface ParsedElement {
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.jsonconverter.ParsedElement getField(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String asString();
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.jsonconverter.ParsedArray asArray();
}