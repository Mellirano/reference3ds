package ua.privatbank.core.progress;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import io.reactivex.Single;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.utils.SingleLiveData;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/progress/ProgressDialogStore;", "", "state", "Lua/privatbank/core/progress/ProgressDialogState;", "(Lua/privatbank/core/progress/ProgressDialogState;)V", "stateLiveData", "Lua/privatbank/core/utils/SingleLiveData;", "dispatch", "", "action", "Lua/privatbank/core/progress/ProgressDialogActions;", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "reduce", "removeObservers", "listener", "core_debug"})
public final class ProgressDialogStore {
    private ua.privatbank.core.progress.ProgressDialogState state;
    private final ua.privatbank.core.utils.SingleLiveData<ua.privatbank.core.progress.ProgressDialogState> stateLiveData = null;
    
    public ProgressDialogStore() {
        super();
    }
    
    public ProgressDialogStore(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.progress.ProgressDialogState state) {
        super();
    }
    
    public final void removeObservers(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner listener) {
    }
    
    public final void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<ua.privatbank.core.progress.ProgressDialogState> observer) {
    }
    
    public final void dispatch(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.progress.ProgressDialogActions action) {
    }
    
    private final ua.privatbank.core.progress.ProgressDialogState reduce(ua.privatbank.core.progress.ProgressDialogState state, ua.privatbank.core.progress.ProgressDialogActions action) {
        return null;
    }
}