package ua.privatbank.core.navigation;

import android.util.Log;
import ua.privatbank.core.DI;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0015J\u0016\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018J\u001c\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tJ\u0006\u0010%\u001a\u00020\u0015J\u0010\u0010&\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\tJ&\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lua/privatbank/core/navigation/AnalyticsProvider;", "", "()V", "<set-?>", "Lua/privatbank/core/navigation/AnalyticsConnector;", "analyticsConnector", "getAnalyticsConnector", "()Lua/privatbank/core/navigation/AnalyticsConnector;", "currentPosition", "Lua/privatbank/core/navigation/AnalyticsInfo;", "getCurrentPosition", "()Lua/privatbank/core/navigation/AnalyticsInfo;", "hasSubService", "", "getHasSubService", "()Z", "navStack", "Ljava/util/LinkedList;", "subService", "Lua/privatbank/core/navigation/SubServiceAnalyticInfo;", "cancel", "", "check", "tag", "", "checked", "clear", "click", "currentService", "init", "leaveSubService", "onSubService", "service", "view", "openPage", "analytics", "lastService", "pop", "popUntil", "screenEvent", "screen", "event", "action", "swipe", "core_debug"})
public final class AnalyticsProvider {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.navigation.AnalyticsProvider INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static ua.privatbank.core.navigation.AnalyticsConnector analyticsConnector;
    private static final java.util.LinkedList<ua.privatbank.core.navigation.AnalyticsInfo> navStack = null;
    private static ua.privatbank.core.navigation.SubServiceAnalyticInfo subService;
    
    private AnalyticsProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.navigation.AnalyticsConnector getAnalyticsConnector() {
        return null;
    }
    
    private final ua.privatbank.core.navigation.AnalyticsInfo getCurrentPosition() {
        return null;
    }
    
    private final boolean getHasSubService() {
        return false;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsConnector analyticsConnector) {
    }
    
    public final void cancel() {
    }
    
    public final void openPage(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo analytics, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo lastService) {
    }
    
    public final void click(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final void click(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsInfo currentService) {
    }
    
    public final void pop() {
    }
    
    public final void popUntil(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo analytics) {
    }
    
    public final void check(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean checked) {
    }
    
    public final void clear() {
    }
    
    public final void swipe(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final void onSubService(@org.jetbrains.annotations.NotNull()
    java.lang.String service, @org.jetbrains.annotations.NotNull()
    java.lang.String view) {
    }
    
    public final void leaveSubService() {
    }
    
    public final void screenEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String screen, @org.jetbrains.annotations.NotNull()
    java.lang.String view, @org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.String action) {
    }
}