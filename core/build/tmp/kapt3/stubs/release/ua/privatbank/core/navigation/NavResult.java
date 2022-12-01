package ua.privatbank.core.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ua.privatbank.core.base.BaseFragment;
import ua.privatbank.core.logger.LoggerFactory;
import kotlin.properties.Delegates;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/navigation/NavResult;", "T", "", "data", "requestId", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getRequestId", "()Ljava/lang/String;", "core_release"})
public final class NavResult<T extends java.lang.Object> {
    private final T data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String requestId = null;
    
    public NavResult(T data, @org.jetbrains.annotations.NotNull()
    java.lang.String requestId) {
        super();
    }
    
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequestId() {
        return null;
    }
}