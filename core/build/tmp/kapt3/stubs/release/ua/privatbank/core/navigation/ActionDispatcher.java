package ua.privatbank.core.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003H&\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/navigation/ActionDispatcher;", "", "getSimpleActionMap", "", "", "Lkotlin/Function1;", "Lua/privatbank/core/navigation/ActionHelper;", "", "core_release"})
public abstract interface ActionDispatcher {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<ua.privatbank.core.navigation.ActionHelper, kotlin.Unit>> getSimpleActionMap();
}