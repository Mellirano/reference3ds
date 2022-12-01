package ua.privatbank.core.base;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.StringRes;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.*;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import ua.privatbank.core.DI;
import ua.privatbank.core.R;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.navigation.*;
import ua.privatbank.core.network.OkhttpNetworkConfiguration;
import ua.privatbank.core.network.errors.*;
import ua.privatbank.core.network.helpers.ErrorFun;
import ua.privatbank.core.utils.*;
import java.security.cert.CertPathValidatorException;
import javax.net.ssl.SSLHandshakeException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u000206H\u0086\u0004J\u0018\u00107\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u0002H908\"\u0004\b\u0000\u00109JH\u0010:\u001a\b\u0012\u0004\u0012\u0002H90;\"\u0004\b\u0000\u001092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020\u00070=2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\b\u0002\u0010?\u001a\u00020\u0003H\u0004J.\u0010@\u001a\u00020A2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0002JX\u0010D\u001a\b\u0012\u0004\u0012\u0002H90E\"\u0004\b\u0000\u001092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020\u00070=2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C2\b\b\u0002\u0010?\u001a\u00020\u0003H\u0004J \u0010F\u001a\u0012\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00070=j\u0002`H2\u0006\u0010I\u001a\u00020\u0011H\u0002J\u0014\u0010J\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015J\u0010\u0010K\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020NJ\b\u0010O\u001a\u00020\u0007H\u0014J\b\u0010P\u001a\u00020\u0007H\u0016J\u000e\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0003J\b\u0010S\u001a\u00020\u0007H\u0002J\u000e\u0010T\u001a\u00020\u00072\u0006\u00105\u001a\u000206J\n\u00107\u001a\u00020U*\u00020UJ\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002H90V\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90VJ\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002H90W\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90WJ\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002H90X\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90XJ\u001c\u0010Y\u001a\u00020\u0007*\u00020U2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010CJ8\u0010Y\u001a\u00020\u0007*\u00020U2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015Jb\u0010Y\u001a\u00020\u0007\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90V2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020\u00070=2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C2\b\b\u0002\u0010?\u001a\u00020\u0003J*\u0010Y\u001a\u00020\u0007\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90X2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020\u00070=JP\u0010Y\u001a\u00020\u0007\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90X2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020\u00070=2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\b\u0002\u0010?\u001a\u00020\u0003JB\u0010Y\u001a\u00020\u0007\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u0002H90X2\u000e\u0010[\u001a\n\u0012\u0006\b\u0000\u0012\u0002H90\u00152\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u00030!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\tR\u001b\u0010.\u001a\u00020/8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101\u00a8\u0006]"}, d2 = {"Lua/privatbank/core/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "isErrorRestorable", "", "(Z)V", "closeAppData", "Lua/privatbank/core/utils/SingleLiveData;", "", "getCloseAppData", "()Lua/privatbank/core/utils/SingleLiveData;", "closeScreenData", "getCloseScreenData", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "defErrorMess", "Lua/privatbank/core/network/errors/Message;", "getDefErrorMess", "()Lua/privatbank/core/network/errors/Message;", "errorData", "Landroidx/lifecycle/MutableLiveData;", "getErrorData", "()Landroidx/lifecycle/MutableLiveData;", "errorManager", "Lua/privatbank/core/network/errors/ErrorManager;", "getErrorManager", "()Lua/privatbank/core/network/errors/ErrorManager;", "logger", "Lua/privatbank/core/logger/Logger;", "getLogger", "()Lua/privatbank/core/logger/Logger;", "progressData", "Landroidx/lifecycle/MediatorLiveData;", "kotlin.jvm.PlatformType", "getProgressData", "()Landroidx/lifecycle/MediatorLiveData;", "queryParamsErrorData", "Lua/privatbank/core/network/errors/QueryParamsErrorInfo;", "getQueryParamsErrorData", "routeData", "Lua/privatbank/core/navigation/NavCommand;", "getRouteData", "routeData2", "Lua/privatbank/core/navigation/NavCommand2;", "getRouteData2", "sessionRetryHelper", "Lua/privatbank/core/network/errors/Retry;", "getSessionRetryHelper", "()Lua/privatbank/core/network/errors/Retry;", "sessionRetryHelper$delegate", "Lkotlin/Lazy;", "addDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "attachSessionRetryHelper", "Lio/reactivex/SingleTransformer;", "T", "createConsumer", "Lio/reactivex/SingleObserver;", "onSuccess", "Lkotlin/Function1;", "progressLiveData", "bindToViewModelLifecycle", "createConsumerCompletable", "Lio/reactivex/CompletableObserver;", "onComplete", "Lkotlin/Function0;", "createConsumerMaybe", "Lio/reactivex/MaybeObserver;", "errorEvent", "", "Lua/privatbank/core/network/helpers/ErrorFun;", "message", "getDefaultErrorManager", "getString", "", "stringRes", "", "onCleared", "onNavigationIconClick", "progress", "inProgress", "sendDefaultError", "subscribeTo", "Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "Lio/reactivex/Observable;", "Lio/reactivex/Single;", "startRequest", "errorHandler", "liveData", "Companion", "core_release"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.base.BaseViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.reactivex.subjects.PublishSubject<java.lang.String> maintenceDataStream = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.SingleLiveData<kotlin.Unit> closeScreenData = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.SingleLiveData<kotlin.Unit> closeAppData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> progressData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> errorData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.QueryParamsErrorInfo> queryParamsErrorData = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.logger.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.SingleLiveData<ua.privatbank.core.navigation.NavCommand> routeData = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.SingleLiveData<ua.privatbank.core.navigation.NavCommand2> routeData2 = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.errors.Message defErrorMess = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.network.errors.ErrorManager errorManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sessionRetryHelper$delegate = null;
    
    public BaseViewModel() {
        super();
    }
    
    public BaseViewModel(boolean isErrorRestorable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.SingleLiveData<kotlin.Unit> getCloseScreenData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.SingleLiveData<kotlin.Unit> getCloseAppData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getProgressData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> getErrorData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.QueryParamsErrorInfo> getQueryParamsErrorData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.logger.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.SingleLiveData<ua.privatbank.core.navigation.NavCommand> getRouteData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.SingleLiveData<ua.privatbank.core.navigation.NavCommand2> getRouteData2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.Message getDefErrorMess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public ua.privatbank.core.network.errors.ErrorManager getErrorManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.ErrorManager getDefaultErrorManager(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<ua.privatbank.core.network.errors.Message> errorData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.network.errors.Retry getSessionRetryHelper() {
        return null;
    }
    
    private final void sendDefaultError() {
    }
    
    public final void progress(boolean inProgress) {
    }
    
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> errorEvent(ua.privatbank.core.network.errors.Message message) {
        return null;
    }
    
    public final <T extends java.lang.Object>void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $this$startRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.ErrorManager errorHandler, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress, boolean bindToViewModelLifecycle) {
    }
    
    public final <T extends java.lang.Object>void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $this$startRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
    }
    
    public final <T extends java.lang.Object>void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $this$startRequest, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<? super T> liveData, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.ErrorManager errorHandler, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress) {
    }
    
    public final void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $this$startRequest, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.ErrorManager errorHandler, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress) {
    }
    
    public final void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $this$startRequest, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final <T extends java.lang.Object>void startRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Maybe<T> $this$startRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.Nullable()
    ua.privatbank.core.network.errors.ErrorManager errorHandler, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, boolean bindToViewModelLifecycle) {
    }
    
    public void onNavigationIconClick() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.MaybeObserver<T> createConsumerMaybe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.ErrorManager errorManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, boolean bindToViewModelLifecycle) {
        return null;
    }
    
    private final io.reactivex.CompletableObserver createConsumerCompletable(kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, ua.privatbank.core.network.errors.ErrorManager errorManager, androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.SingleObserver<T> createConsumer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.network.errors.ErrorManager errorManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData, boolean bindToViewModelLifecycle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int stringRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Single<T> attachSessionRetryHelper(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $this$attachSessionRetryHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Maybe<T> attachSessionRetryHelper(@org.jetbrains.annotations.NotNull()
    io.reactivex.Maybe<T> $this$attachSessionRetryHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Observable<T> attachSessionRetryHelper(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $this$attachSessionRetryHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable attachSessionRetryHelper(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $this$attachSessionRetryHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.SingleTransformer<T, T> attachSessionRetryHelper() {
        return null;
    }
    
    public final void subscribeTo(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/base/BaseViewModel$Companion;", "", "()V", "maintenceDataStream", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getMaintenceDataStream", "()Lio/reactivex/subjects/PublishSubject;", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.reactivex.subjects.PublishSubject<java.lang.String> getMaintenceDataStream() {
            return null;
        }
    }
}