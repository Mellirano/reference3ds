package ua.privatbank.core.base;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import ua.privatbank.core.R;
import ua.privatbank.core.logger.DebugLogger;
import ua.privatbank.core.navigation.NavRouter;
import ua.privatbank.core.navigation.NavRouter2;
import ua.privatbank.core.network.errors.Message;
import ua.privatbank.core.progress.ProgressDialogController;
import ua.privatbank.core.utils.CustomFactory;
import ua.privatbank.permissioncontroller.DefaultPermissionExplanationDialogFactory;
import ua.privatbank.permissioncontroller.PermissionController;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010>\u001a\u00020?H\u0002J\r\u0010@\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00101J\b\u0010A\u001a\u0004\u0018\u00010BJ\u0012\u0010C\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0006\u0010F\u001a\u00020?J\b\u0010G\u001a\u00020?H\u0016J\b\u0010H\u001a\u00020?H\u0016J\u0012\u0010I\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0010\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020:H\u0016J\u0010\u0010L\u001a\u00020?2\u0006\u0010M\u001a\u00020\u0011H\u0016J-\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020\u00072\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020:0Q2\u0006\u0010R\u001a\u00020SH\u0016\u00a2\u0006\u0002\u0010TJ\u0010\u0010U\u001a\u00020?2\u0006\u0010V\u001a\u00020\u0011H\u0016J\b\u0010W\u001a\u00020?H\u0016J\u001a\u0010X\u001a\u00020?2\b\b\u0002\u0010Y\u001a\u00020\u00112\b\b\u0002\u0010Z\u001a\u00020\u0011J\u0019\u0010[\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0002\u0010\\J\n\u0010]\u001a\u00020\u0002*\u00020\u0002J*\u0010^\u001a\u00020?\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010_2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020?0aJ$\u0010^\u001a\u00020?\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010_2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00010bJ,\u0010c\u001a\u00020?\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010_2\u0014\u0010`\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0004\u0012\u00020?0aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020\u0007X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\tR\u001c\u0010/\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u0015\u00109\u001a\u00020:*\u00020;8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010=\u00a8\u0006d"}, d2 = {"Lua/privatbank/core/base/BaseActivity;", "T", "Lua/privatbank/core/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "Lua/privatbank/core/base/ProgressAndBackPressedActivityController;", "()V", "fragmentsContainerId", "", "getFragmentsContainerId", "()I", "initViewModel", "Lkotlin/Function0;", "getInitViewModel", "()Lkotlin/jvm/functions/Function0;", "setInitViewModel", "(Lkotlin/jvm/functions/Function0;)V", "isActivityOnFocus", "", "()Z", "setActivityOnFocus", "(Z)V", "logger", "Lua/privatbank/core/logger/DebugLogger;", "getLogger", "()Lua/privatbank/core/logger/DebugLogger;", "navRouter", "Lua/privatbank/core/navigation/NavRouter;", "getNavRouter", "()Lua/privatbank/core/navigation/NavRouter;", "navRouter2", "Lua/privatbank/core/navigation/NavRouter2;", "getNavRouter2", "()Lua/privatbank/core/navigation/NavRouter2;", "permissionController", "Lua/privatbank/permissioncontroller/PermissionController;", "getPermissionController", "()Lua/privatbank/permissioncontroller/PermissionController;", "setPermissionController", "(Lua/privatbank/permissioncontroller/PermissionController;)V", "progressDialogController", "Lua/privatbank/core/progress/ProgressDialogController;", "getProgressDialogController", "()Lua/privatbank/core/progress/ProgressDialogController;", "setProgressDialogController", "(Lua/privatbank/core/progress/ProgressDialogController;)V", "resId", "getResId", "viewModel", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "setViewModel", "(Lua/privatbank/core/base/BaseViewModel;)V", "Lua/privatbank/core/base/BaseViewModel;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "messageString", "", "Lua/privatbank/core/network/errors/Message;", "getMessageString", "(Lua/privatbank/core/network/errors/Message;)Ljava/lang/String;", "cleanupProgress", "", "createViewModel", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "handleOnCreate", "savedInstanceState", "Landroid/os/Bundle;", "hideProgressDialog", "observeLiveData", "onBackPressed", "onCreate", "onError", "message", "onProgress", "isProgress", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onWindowFocusChanged", "hasFocus", "safeOnBackPressed", "showProgressDialog", "isCancelable", "showNow", "viewModelByFactory", "(Lkotlin/jvm/functions/Function0;)Lua/privatbank/core/base/BaseViewModel;", "observBaseEvents", "observe", "Landroidx/lifecycle/LiveData;", "observer", "Lkotlin/Function1;", "Landroidx/lifecycle/Observer;", "observeNullable", "core_release"})
public abstract class BaseActivity<T extends ua.privatbank.core.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity implements ua.privatbank.core.base.ProgressAndBackPressedActivityController {
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.progress.ProgressDialogController progressDialogController;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<? extends T> initViewModel;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.logger.DebugLogger logger = null;
    public T viewModel;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.permissioncontroller.PermissionController permissionController;
    private final int fragmentsContainerId = -1;
    private boolean isActivityOnFocus = false;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.privatbank.core.progress.ProgressDialogController getProgressDialogController() {
        return null;
    }
    
    public void setProgressDialogController(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.progress.ProgressDialogController p0) {
    }
    
    protected abstract int getResId();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<T> getViewModelClass();
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<T> getInitViewModel() {
        return null;
    }
    
    public void setInitViewModel(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final ua.privatbank.core.logger.DebugLogger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final ua.privatbank.permissioncontroller.PermissionController getPermissionController() {
        return null;
    }
    
    protected final void setPermissionController(@org.jetbrains.annotations.Nullable()
    ua.privatbank.permissioncontroller.PermissionController p0) {
    }
    
    public int getFragmentsContainerId() {
        return 0;
    }
    
    public final boolean isActivityOnFocus() {
        return false;
    }
    
    public final void setActivityOnFocus(boolean p0) {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void cleanupProgress() {
    }
    
    protected void handleOnCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.BaseViewModel observBaseEvents(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.BaseViewModel $this$observBaseEvents) {
        return null;
    }
    
    public void onProgress(boolean isProgress) {
    }
    
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public void observeLiveData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T viewModelByFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> viewModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public T createViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    public final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observe, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public final <T extends java.lang.Object>void observeNullable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeNullable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public final void showProgressDialog(boolean isCancelable, boolean showNow) {
    }
    
    public final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public void safeOnBackPressed() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getCurrentFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageString(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message $this$messageString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public ua.privatbank.core.navigation.NavRouter getNavRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public ua.privatbank.core.navigation.NavRouter2 getNavRouter2() {
        return null;
    }
}