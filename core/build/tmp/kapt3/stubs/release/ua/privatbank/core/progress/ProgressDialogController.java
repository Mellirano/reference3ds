package ua.privatbank.core.progress;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import io.reactivex.Single;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.utils.SingleLiveData;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u00013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0006\u0010 \u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0006H\u0016J6\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\"2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010-\u001a\u00020\"2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J.\u0010/\u001a\u00020\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00100\u001a\u0002012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lua/privatbank/core/progress/ProgressDialogController;", "Lua/privatbank/core/progress/ProgressBarAction;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "TAG", "", "kotlin.jvm.PlatformType", "factory", "Lua/privatbank/core/progress/ProgressDialogFactory;", "getFactory", "()Lua/privatbank/core/progress/ProgressDialogFactory;", "setFactory", "(Lua/privatbank/core/progress/ProgressDialogFactory;)V", "logger", "Lua/privatbank/core/logger/Logger;", "onDismiss", "Lkotlin/Function0;", "", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss", "(Lkotlin/jvm/functions/Function0;)V", "progressBarAction", "getProgressBarAction", "()Lua/privatbank/core/progress/ProgressBarAction;", "progressDialog", "Lua/privatbank/core/progress/ProgressBarDialog;", "store", "Lua/privatbank/core/progress/ProgressDialogStore;", "hideMessage", "hideMessageAndShowDefaultProgressColor", "hideProgressDialog", "isShowing", "", "redraw", "state", "Lua/privatbank/core/progress/ProgressDialogState;", "showDefaultProgressColor", "showErrorMessage", "message", "showErrorProgressColor", "showMessage", "showProgressDialog", "isCancelable", "showNow", "onCanceledByUser", "showSuccess", "delayInSec", "", "onHide", "Companion", "core_release"})
public final class ProgressDialogController implements ua.privatbank.core.progress.ProgressBarAction {
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    private final java.lang.String TAG = null;
    private final ua.privatbank.core.logger.Logger logger = null;
    private ua.privatbank.core.progress.ProgressBarDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.progress.ProgressDialogFactory factory;
    private final ua.privatbank.core.progress.ProgressDialogStore store = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.progress.ProgressDialogController.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FRAGMENT_TAG = null;
    
    public ProgressDialogController(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
    
    private final ua.privatbank.core.progress.ProgressBarAction getProgressBarAction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ua.privatbank.core.progress.ProgressDialogFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.progress.ProgressDialogFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismiss() {
        return null;
    }
    
    public final void setOnDismiss(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * onDismissLocal - overrides global onDismiss
     */
    public final void showProgressDialog(boolean isCancelable, @org.jetbrains.annotations.Nullable()
    java.lang.String message, boolean showNow, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCanceledByUser) {
    }
    
    private final void redraw(ua.privatbank.core.progress.ProgressDialogState state) {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showErrorProgressColor() {
    }
    
    @java.lang.Override()
    public void showDefaultProgressColor() {
    }
    
    @java.lang.Override()
    public void hideMessage() {
    }
    
    @java.lang.Override()
    public void hideMessageAndShowDefaultProgressColor() {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void showSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String message, long delayInSec, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onHide) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/progress/ProgressDialogController$Companion;", "", "()V", "FRAGMENT_TAG", "", "getFRAGMENT_TAG", "()Ljava/lang/String;", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFRAGMENT_TAG() {
            return null;
        }
    }
}