package ua.privatbank.core.utils;

import android.os.Build;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import ua.privatbank.core.R;
import ua.privatbank.core.network.errors.Message;
import ua.privatbank.core.network.errors.RetryErrorEvent;
import ua.privatbank.core.snackbar.SnackbarHelper;
import ua.privatbank.core.snackbar.SnackbarPreset;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"showSnackbarWithPostIfNeed", "", "Landroid/view/View;", "func", "Lkotlin/Function0;", "snackbar", "Lua/privatbank/core/snackbar/SnackbarHelper;", "callback", "Lkotlin/Function1;", "snackbarInfo", "message", "Lua/privatbank/core/network/errors/Message;", "snackbarOffline", "retryErrorEvet", "Lua/privatbank/core/network/errors/RetryErrorEvent;", "core_release"})
public final class SnackBarExtKt {
    
    public static final void snackbarOffline(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbarOffline, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.RetryErrorEvent retryErrorEvet) {
    }
    
    public static final void snackbarInfo(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbarInfo, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message) {
    }
    
    private static final void showSnackbarWithPostIfNeed(android.view.View $this$showSnackbarWithPostIfNeed, kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.snackbar.SnackbarHelper snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> callback) {
        return null;
    }
}