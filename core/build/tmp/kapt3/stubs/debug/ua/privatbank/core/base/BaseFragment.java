package ua.privatbank.core.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.disposables.CompositeDisposable;
import ua.privatbank.core.R;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.navigation.AnalyticsProvider;
import ua.privatbank.core.navigation.NavRouter;
import ua.privatbank.core.navigation.NavRouter2;
import ua.privatbank.core.network.errors.Message;
import ua.privatbank.core.network.errors.QueryParamsErrorInfo;
import ua.privatbank.core.progress.ProgressDialogController;
import ua.privatbank.core.snackbar.SnackbarHelper;
import ua.privatbank.core.snackbar.SnackbarPreset;
import ua.privatbank.core.toolbar.ToolbarCoordinator;
import ua.privatbank.core.toolbar.ToolbarCoordinatorProvider;
import ua.privatbank.core.utils.*;
import ua.privatbank.permissioncontroller.DefaultPermissionExplanationDialogFactory;
import ua.privatbank.permissioncontroller.PermissionController;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00fc\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u00a9\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010X\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020C2\b\b\u0002\u0010Z\u001a\u00020\f2\b\b\u0002\u0010[\u001a\u00020\\H\u0002J.\u0010]\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`H\u0084\b\u00a2\u0006\u0002\u0010aJ\u0010\u0010b\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\fH\u0004J\u001a\u0010d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\r\u0010e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010LJ\u0012\u0010f\u001a\u00020\u00162\b\u0010g\u001a\u0004\u0018\u00010hH\u0014J\u0006\u0010i\u001a\u00020\u0016J\u0006\u0010j\u001a\u00020\u0016J\u0006\u0010k\u001a\u00020\u0016J\b\u0010l\u001a\u00020\u0016H\u0014J\b\u0010m\u001a\u00020\u0016H\u0016J\r\u0010n\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\boJ\u0012\u0010p\u001a\u00020\u00162\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\"\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020\f2\u0006\u0010t\u001a\u00020\\2\u0006\u0010u\u001a\u00020\fH\u0016J&\u0010v\u001a\u0004\u0018\u00010w2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010x\u001a\u00020\u0016H\u0016J\b\u0010y\u001a\u00020\u0016H\u0016J\u0010\u0010z\u001a\u00020\u00162\u0006\u0010{\u001a\u00020UH\u0016J\u0018\u0010z\u001a\u00020\u00162\u0006\u0010{\u001a\u00020U2\u0006\u0010|\u001a\u00020wH\u0016J\u0010\u0010}\u001a\u00020\u00162\u0006\u0010~\u001a\u00020\\H\u0016J\u0012\u0010\u007f\u001a\u00020\u00162\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J2\u0010\u0082\u0001\u001a\u00020\u00162\u0007\u0010\u0083\u0001\u001a\u00020\f2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016\u00a2\u0006\u0003\u0010\u0088\u0001J\u001c\u0010\u0089\u0001\u001a\u00020\u00162\u0007\u0010\u008a\u0001\u001a\u00020w2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\f\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001H$J\t\u0010\u008d\u0001\u001a\u00020\u001bH\u0002J8\u0010\u008e\u0001\u001a\u00020\u00162\u0007\u0010\u008f\u0001\u001a\u00020\u00112$\u0010\u0090\u0001\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0016J\t\u0010\u0091\u0001\u001a\u00020\u0016H\u0004J\u001d\u0010\u0092\u0001\u001a\u00020\u00162\t\b\u0002\u0010\u0093\u0001\u001a\u00020\\2\t\b\u0002\u0010\u0094\u0001\u001a\u00020\\J\u001a\u0010\u0095\u0001\u001a\u00020\u00162\u0006\u0010{\u001a\u00020\u00112\t\b\u0002\u0010\u0093\u0001\u001a\u00020\\J\u000f\u0010\u0096\u0001\u001a\u00020\u00162\u0006\u0010{\u001a\u00020\u0011J\u000f\u0010\u0097\u0001\u001a\u00020\u00162\u0006\u0010{\u001a\u00020\u0011J\u000f\u0010\u0098\u0001\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020CJ\u001d\u0010\u0099\u0001\u001a\u00028\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0003\u0010\u009a\u0001J-\u0010\u009b\u0001\u001a\u00020\u0016\"\u0004\b\u0001\u0010\u0001*\t\u0012\u0004\u0012\u0002H\u00010\u009c\u00012\u0013\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00160\u0012J(\u0010\u009b\u0001\u001a\u00020\u0016\"\u0004\b\u0001\u0010\u0001*\t\u0012\u0004\u0012\u0002H\u00010\u009c\u00012\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u0002H\u00010\u009e\u0001J\u000b\u0010\u009f\u0001\u001a\u00020\u0002*\u00020\u0002J/\u0010\u00a0\u0001\u001a\u00020\u0016\"\u0004\b\u0001\u0010\u0001*\t\u0012\u0004\u0012\u0002H\u00010\u009c\u00012\u0015\u0010\u009d\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0004\u0012\u00020\u00160\u0012J-\u0010\u00a1\u0001\u001a\u00020\u0016\"\u0004\b\u0001\u0010\u0001*\t\u0012\u0004\u0012\u0002H\u00010\u00a2\u00012\u0013\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00160\u0012J)\u0010\u00a3\u0001\u001a\u00020\u0016*\u00020w2\u0006\u0010Y\u001a\u00020C2\b\b\u0002\u0010Z\u001a\u00020\f2\b\b\u0002\u0010[\u001a\u00020\\H\u0002J$\u0010\u0098\u0001\u001a\u00020\u0016*\u00020w2\b\b\u0002\u0010{\u001a\u00020\f2\r\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 J\u001f\u0010\u0098\u0001\u001a\u00020\u0016*\u00020w2\b\b\u0001\u0010{\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020\fJ\u001d\u0010\u0098\u0001\u001a\u00020C*\u00020w2\u0006\u0010{\u001a\u00020\u00112\b\b\u0002\u0010Z\u001a\u00020\fJ-\u0010\u0098\u0001\u001a\u00020C*\u00020w2\u0006\u0010{\u001a\u00020\u00112\t\b\u0002\u0010\u00a5\u0001\u001a\u00020\f2\r\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 J\"\u0010\u0098\u0001\u001a\u00020C*\u00020w2\u0006\u0010{\u001a\u00020U2\r\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 J-\u0010\u0098\u0001\u001a\u00020\u0016*\u00020w2\u0006\u0010{\u001a\u00020U2\t\b\u0001\u0010\u00a5\u0001\u001a\u00020\f2\r\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 J7\u0010\u0098\u0001\u001a\u00020\u0016*\u00020w2\u0006\u0010{\u001a\u00020U2\t\b\u0001\u0010\u00a5\u0001\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020\f2\r\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 J)\u0010\u0098\u0001\u001a\u00020\u0016*\u00020w2\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\b\b\u0002\u0010Z\u001a\u00020\f2\b\b\u0002\u0010[\u001a\u00020\\J\u0013\u0010\u00a8\u0001\u001a\u00020\u0016*\u00020w2\u0006\u0010{\u001a\u00020UR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR7\u0010\u000f\u001a+\u0012\u0004\u0012\u00020\u0011\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u00120\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000RH\u0010\u0017\u001a6\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u001b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010\'\u001a\u0004\u0018\u00010\fX\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R&\u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b5\u0010\u0004\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u00010;8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020\fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b?\u0010\u000eR\u000e\u0010@\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010EX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010O\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000QX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u0015\u0010T\u001a\u00020\u0011*\u00020U8F\u00a2\u0006\u0006\u001a\u0004\bV\u0010W\u00a8\u0006\u00aa\u0001"}, d2 = {"Lua/privatbank/core/base/BaseFragment;", "T", "Lua/privatbank/core/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposableViewLifecycle", "getCompositeDisposableViewLifecycle", "containerId", "", "getContainerId", "()I", "errorParamsErrorMap", "Ljava/util/HashMap;", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "errorMessage", "", "getDataView", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getGetDataView", "()Lkotlin/jvm/functions/Function2;", "initViewModel", "Lkotlin/Function0;", "getInitViewModel", "()Lkotlin/jvm/functions/Function0;", "logger", "Lua/privatbank/core/logger/Logger;", "getLogger", "()Lua/privatbank/core/logger/Logger;", "oldSystemUiVisibility", "getOldSystemUiVisibility", "()Ljava/lang/Integer;", "setOldSystemUiVisibility", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pbPermissions", "Lua/privatbank/core/base/PbPermissions;", "getPbPermissions", "()Lua/privatbank/core/base/PbPermissions;", "setPbPermissions", "(Lua/privatbank/core/base/PbPermissions;)V", "permissionController", "Lua/privatbank/permissioncontroller/PermissionController;", "getPermissionController$annotations", "getPermissionController", "()Lua/privatbank/permissioncontroller/PermissionController;", "setPermissionController", "(Lua/privatbank/permissioncontroller/PermissionController;)V", "progressDialogController", "Lua/privatbank/core/progress/ProgressDialogController;", "getProgressDialogController", "()Lua/privatbank/core/progress/ProgressDialogController;", "resId", "getResId", "rootLayout", "snackBars", "", "Lua/privatbank/core/snackbar/SnackbarHelper;", "toolbarCoordinator", "Lua/privatbank/core/toolbar/ToolbarCoordinator;", "getToolbarCoordinator", "()Lua/privatbank/core/toolbar/ToolbarCoordinator;", "setToolbarCoordinator", "(Lua/privatbank/core/toolbar/ToolbarCoordinator;)V", "viewModel", "getViewModel", "()Lua/privatbank/core/base/BaseViewModel;", "setViewModel", "(Lua/privatbank/core/base/BaseViewModel;)V", "Lua/privatbank/core/base/BaseViewModel;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "messageString", "Lua/privatbank/core/network/errors/Message;", "getMessageString", "(Lua/privatbank/core/network/errors/Message;)Ljava/lang/String;", "addAndShowSnackbar", "snackbarHelper", "duration", "addToStack", "", "bindInterface", "parent", "context", "Landroid/content/Context;", "(Landroidx/fragment/app/Fragment;Landroid/content/Context;)Ljava/lang/Object;", "changeSystemUiVisibilityOnlyForCurrentFragment", "newSystemUiVisibility", "createDataView", "createViewModel", "handleOnCreate", "savedInstanceState", "Landroid/os/Bundle;", "hideMessageAndShowDefaultProgressColor", "hideProgressDialog", "hideProgressMessage", "navigateBack", "observeLiveData", "onBackPressInternal", "onBackPressInternal$core_debug", "onCreate", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "onDestroy", "onDestroyView", "onError", "message", "rootView", "onProgress", "isProgress", "onQueryParamsErrorHandler", "queryParamsError", "Lua/privatbank/core/network/errors/QueryParamsErrorInfo;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "provideToolbar", "Lua/privatbank/core/toolbar/ToolbarCoordinatorProvider;", "provideWrapperView", "registerQueryParamError", "param", "function", "restoreOldSystemUiVisibilityIfNeed", "showProgressDialog", "isCancelable", "showNow", "showProgressDialogWithMessage", "showProgressErrorMessage", "showProgressMessage", "snackbar", "viewModelByFactory", "(Lkotlin/jvm/functions/Function0;)Lua/privatbank/core/base/BaseViewModel;", "observe", "Landroidx/lifecycle/LiveData;", "observer", "Landroidx/lifecycle/Observer;", "observeBaseEvents", "observeNullable", "observeWithClearValue", "Landroidx/lifecycle/MutableLiveData;", "showSnackbarWithPostIfNeed", "callback", "buttonText", "preset", "Lua/privatbank/core/snackbar/SnackbarPreset;", "snackbarInfo", "ManualRetry", "core_debug"})
public abstract class BaseFragment<T extends ua.privatbank.core.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<T> initViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.logger.Logger logger = null;
    public T viewModel;
    @org.jetbrains.annotations.Nullable()
    private ua.privatbank.core.toolbar.ToolbarCoordinator<?> toolbarCoordinator;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer oldSystemUiVisibility;
    @org.jetbrains.annotations.Nullable()
    @java.lang.Deprecated()
    private ua.privatbank.permissioncontroller.PermissionController permissionController;
    public ua.privatbank.core.base.PbPermissions pbPermissions;
    private java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> errorParamsErrorMap;
    private android.view.ViewGroup rootLayout;
    private final java.util.List<ua.privatbank.core.snackbar.SnackbarHelper> snackBars = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposableViewLifecycle = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function2<android.view.LayoutInflater, android.view.ViewGroup, android.view.ViewGroup> getDataView = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    protected abstract int getResId();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<T> getViewModelClass();
    
    @org.jetbrains.annotations.Nullable()
    protected kotlin.jvm.functions.Function0<T> getInitViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final ua.privatbank.core.logger.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final ua.privatbank.core.progress.ProgressDialogController getProgressDialogController() {
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
    protected final ua.privatbank.core.toolbar.ToolbarCoordinator<?> getToolbarCoordinator() {
        return null;
    }
    
    protected final void setToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.toolbar.ToolbarCoordinator<?> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Integer getOldSystemUiVisibility() {
        return null;
    }
    
    protected final void setOldSystemUiVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Deprecated()
    public final ua.privatbank.permissioncontroller.PermissionController getPermissionController() {
        return null;
    }
    
    @java.lang.Deprecated()
    public static void getPermissionController$annotations() {
    }
    
    @java.lang.Deprecated()
    public final void setPermissionController(@org.jetbrains.annotations.Nullable()
    ua.privatbank.permissioncontroller.PermissionController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.PbPermissions getPbPermissions() {
        return null;
    }
    
    public final void setPbPermissions(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.PbPermissions p0) {
    }
    
    public void observeLiveData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public int getContainerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposableViewLifecycle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected kotlin.jvm.functions.Function2<android.view.LayoutInflater, android.view.ViewGroup, android.view.ViewGroup> getGetDataView() {
        return null;
    }
    
    protected final void changeSystemUiVisibilityOnlyForCurrentFragment(int newSystemUiVisibility) {
    }
    
    protected final void restoreOldSystemUiVisibilityIfNeed() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.animation.Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }
    
    protected void handleOnCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final android.view.ViewGroup createDataView(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
        return null;
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @androidx.annotation.StringRes()
    int message, int duration) {
    }
    
    public final void snackbarInfo(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbarInfo, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message) {
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, int message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int buttonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.snackbar.SnackbarHelper snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        return null;
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message, @androidx.annotation.StringRes()
    int buttonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message, @androidx.annotation.StringRes()
    int buttonText, int duration, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.snackbar.SnackbarPreset preset, int duration, boolean addToStack) {
    }
    
    private final void showSnackbarWithPostIfNeed(android.view.View $this$showSnackbarWithPostIfNeed, ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper, int duration, boolean addToStack) {
    }
    
    private final void addAndShowSnackbar(ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper, int duration, boolean addToStack) {
    }
    
    public final void snackbar(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
    }
    
    protected void navigateBack() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final android.view.ViewGroup provideWrapperView() {
        return null;
    }
    
    public final void showProgressDialog(boolean isCancelable, boolean showNow) {
    }
    
    public final void showProgressDialogWithMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isCancelable) {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void showProgressMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void hideProgressMessage() {
    }
    
    public final void showProgressErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void hideMessageAndShowDefaultProgressColor() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public T viewModelByFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> viewModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public T createViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.BaseViewModel observeBaseEvents(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.base.BaseViewModel $this$observeBaseEvents) {
        return null;
    }
    
    public final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    public final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observe, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public final <T extends java.lang.Object>void observeWithClearValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<T> $this$observeWithClearValue, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public final <T extends java.lang.Object>void observeNullable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeNullable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageString(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message $this$messageString) {
        return null;
    }
    
    public void onProgress(boolean isProgress) {
    }
    
    public void onError(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message) {
    }
    
    public void onError(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.Message message, @org.jetbrains.annotations.NotNull()
    android.view.View rootView) {
    }
    
    public final void onBackPressInternal$core_debug() {
    }
    
    private final void onQueryParamsErrorHandler(ua.privatbank.core.network.errors.QueryParamsErrorInfo queryParamsError) {
    }
    
    public void registerQueryParamError(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function) {
    }
    
    /**
     * @return ToolbarCoordinatorProvider for predefined toolbar.
     * May be nullable, if you want use custom implementation
     * Called from the fragment's `onCreateView()`
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract ua.privatbank.core.toolbar.ToolbarCoordinatorProvider provideToolbar();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/base/BaseFragment$ManualRetry;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "configure", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_debug"})
    public static final class ManualRetry extends ua.privatbank.core.snackbar.SnackbarPreset {
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
}