package ua.privatbank.core.network.errors;

import android.content.Context;
import androidx.annotation.StringRes;
import io.reactivex.subjects.Subject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/network/errors/RetryErrorEvent;", "", "subject", "Lio/reactivex/subjects/Subject;", "", "exception", "", "retryTrigger", "Lkotlin/Function0;", "(Lio/reactivex/subjects/Subject;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "getException", "()Ljava/lang/Throwable;", "getSubject", "()Lio/reactivex/subjects/Subject;", "onAction", "core_release"})
public final class RetryErrorEvent {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<kotlin.Unit> subject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Throwable exception = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retryTrigger = null;
    
    public RetryErrorEvent(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.Subject<kotlin.Unit> subject, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryTrigger) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.Subject<kotlin.Unit> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Throwable getException() {
        return null;
    }
    
    public final void onAction() {
    }
}