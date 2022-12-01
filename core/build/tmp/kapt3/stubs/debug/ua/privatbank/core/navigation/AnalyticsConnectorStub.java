package ua.privatbank.core.navigation;

import android.util.Log;
import ua.privatbank.core.DI;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/navigation/AnalyticsConnectorStub;", "Lua/privatbank/core/navigation/AnalyticsConnector;", "()V", "onSubService", "", "subServiceInfo", "Lua/privatbank/core/navigation/SubServiceAnalyticInfo;", "sendOpenPageEventToStorage", "analytics", "Lua/privatbank/core/navigation/AnalyticsInfo;", "source", "sendUserActionEventToStorage", "action", "", "tag", "sentUserActionEventFromSubService", "core_debug"})
public final class AnalyticsConnectorStub implements ua.privatbank.core.navigation.AnalyticsConnector {
    
    public AnalyticsConnectorStub() {
        super();
    }
    
    @java.lang.Override()
    public void sendOpenPageEventToStorage(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsInfo analytics, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo source) {
    }
    
    @java.lang.Override()
    public void sendUserActionEventToStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsInfo analytics) {
    }
    
    @java.lang.Override()
    public void onSubService(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.SubServiceAnalyticInfo subServiceInfo) {
    }
    
    @java.lang.Override()
    public void sentUserActionEventFromSubService(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.SubServiceAnalyticInfo analytics) {
    }
}