package ua.privatbank.core.navigation;

import android.util.Log;
import ua.privatbank.core.DI;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/navigation/AnalyticsConnector;", "", "onSubService", "", "subServiceInfo", "Lua/privatbank/core/navigation/SubServiceAnalyticInfo;", "sendOpenPageEventToStorage", "analytics", "Lua/privatbank/core/navigation/AnalyticsInfo;", "source", "sendUserActionEventToStorage", "action", "", "tag", "sentUserActionEventFromSubService", "core_release"})
public abstract interface AnalyticsConnector {
    
    public abstract void sendOpenPageEventToStorage(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsInfo analytics, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.navigation.AnalyticsInfo source);
    
    public abstract void sendUserActionEventToStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.AnalyticsInfo analytics);
    
    public abstract void onSubService(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.SubServiceAnalyticInfo subServiceInfo);
    
    public abstract void sentUserActionEventFromSubService(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.SubServiceAnalyticInfo analytics);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}