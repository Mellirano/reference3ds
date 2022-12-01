package ua.privatbank.core.utils;

import android.os.Build;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import ua.privatbank.core.R;
import ua.privatbank.core.network.errors.Message;
import ua.privatbank.core.network.errors.RetryErrorEvent;
import ua.privatbank.core.snackbar.SnackbarHelper;
import ua.privatbank.core.snackbar.SnackbarPreset;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/utils/ManualRetry;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "configure", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_release"})
public final class ManualRetry extends ua.privatbank.core.snackbar.SnackbarPreset {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> clickListener = null;
    
    public ManualRetry(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getClickListener() {
        return null;
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
    }
}