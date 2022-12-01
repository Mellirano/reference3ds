package ua.privatbank.core.widgets;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import androidx.lifecycle.Observer;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import androidx.annotation.ColorInt;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlinx.android.synthetic.main.main_internet_status_view.view.*;
import ua.privatbank.core.R;
import ua.privatbank.core.connectionavailable.ConnectionState;
import ua.privatbank.core.connectionavailable.ConnectionStateListener;
import ua.privatbank.core.connectionavailable.ConnectionStateListenerFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fH\u0003J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u000fH\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020 H\u0014J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u000e\u0010\'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010(\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lua/privatbank/core/widgets/InternetStatusView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoReactToConnectionState", "", "connectionStateListener", "Lua/privatbank/core/connectionavailable/ConnectionStateListener;", "getConnectionStateListener", "()Lua/privatbank/core/connectionavailable/ConnectionStateListener;", "connectionStateObserver", "Landroidx/lifecycle/Observer;", "Lua/privatbank/core/connectionavailable/ConnectionState;", "handlerHelper", "Lua/privatbank/core/widgets/InternetStatusView$HandlerSingleActionHelper;", "<set-?>", "lastConnectionState", "getLastConnectionState", "()Lua/privatbank/core/connectionavailable/ConnectionState;", "visibilityRequestListener", "Lua/privatbank/core/widgets/InternetStatusView$VisibilityRequestListener;", "changeBackground", "", "animate", "actualConnectionState", "changeText", "disableAutoRefreshByConnectionState", "enableAutoReactToConnectionState", "getColorByConnectionState", "", "connectionState", "getStatusByConnectionState", "", "onWindowVisibilityChanged", "visibility", "reactToConnectionState", "refresh", "setConnectionState", "Companion", "HandlerSingleActionHelper", "VisibilityRequestListener", "core_release"})
public final class InternetStatusView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.connectionavailable.ConnectionStateListener connectionStateListener = null;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.connectionavailable.ConnectionState lastConnectionState;
    private ua.privatbank.core.widgets.InternetStatusView.VisibilityRequestListener visibilityRequestListener;
    private final ua.privatbank.core.widgets.InternetStatusView.HandlerSingleActionHelper handlerHelper = null;
    private boolean autoReactToConnectionState = true;
    private final androidx.lifecycle.Observer<ua.privatbank.core.connectionavailable.ConnectionState> connectionStateObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.widgets.InternetStatusView.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACKGROUND_COLOR = "backgroundColor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEXT_COLOR = "textColor";
    private static final int COLOR_CHANGE_DURATION = 350;
    private static final int SHOW_REQUEST_DELAY = 1000;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public InternetStatusView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public InternetStatusView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.connectionavailable.ConnectionStateListener getConnectionStateListener() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.connectionavailable.ConnectionState getLastConnectionState() {
        return null;
    }
    
    public final void refresh(boolean animate) {
    }
    
    private final void reactToConnectionState(ua.privatbank.core.connectionavailable.ConnectionState connectionState, boolean animate) {
    }
    
    private final void changeBackground(boolean animate, ua.privatbank.core.connectionavailable.ConnectionState actualConnectionState) {
    }
    
    private final void changeText(boolean animate, ua.privatbank.core.connectionavailable.ConnectionState actualConnectionState) {
    }
    
    public final void setConnectionState(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.connectionavailable.ConnectionState connectionState) {
    }
    
    public final void enableAutoReactToConnectionState() {
    }
    
    public final void disableAutoRefreshByConnectionState() {
    }
    
    @java.lang.Override()
    protected void onWindowVisibilityChanged(int visibility) {
    }
    
    private final java.lang.String getStatusByConnectionState(ua.privatbank.core.connectionavailable.ConnectionState connectionState) {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    private final int getColorByConnectionState(ua.privatbank.core.connectionavailable.ConnectionState connectionState) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/widgets/InternetStatusView$VisibilityRequestListener;", "", "hideInternetStatusView", "", "showInternetStatusView", "core_release"})
    public static abstract interface VisibilityRequestListener {
        
        public abstract void showInternetStatusView();
        
        public abstract void hideInternetStatusView();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lua/privatbank/core/widgets/InternetStatusView$HandlerSingleActionHelper;", "", "(Lua/privatbank/core/widgets/InternetStatusView;)V", "handler", "Landroid/os/Handler;", "runnable", "Ljava/lang/Runnable;", "clearRunnable", "", "action", "post", "postDelayed", "delay", "", "core_release"})
    final class HandlerSingleActionHelper {
        private final android.os.Handler handler = null;
        private java.lang.Runnable runnable;
        
        public HandlerSingleActionHelper() {
            super();
        }
        
        public final void postDelayed(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action, int delay) {
        }
        
        public final void post(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action) {
        }
        
        private final void clearRunnable(java.lang.Runnable action) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/widgets/InternetStatusView$Companion;", "", "()V", "BACKGROUND_COLOR", "", "COLOR_CHANGE_DURATION", "", "SHOW_REQUEST_DELAY", "TEXT_COLOR", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}