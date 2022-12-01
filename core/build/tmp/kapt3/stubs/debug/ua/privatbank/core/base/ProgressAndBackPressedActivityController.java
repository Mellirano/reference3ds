package ua.privatbank.core.base;

import ua.privatbank.core.progress.ProgressDialogController;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/base/ProgressAndBackPressedActivityController;", "", "progressDialogController", "Lua/privatbank/core/progress/ProgressDialogController;", "getProgressDialogController", "()Lua/privatbank/core/progress/ProgressDialogController;", "safeOnBackPressed", "", "core_debug"})
public abstract interface ProgressAndBackPressedActivityController {
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.progress.ProgressDialogController getProgressDialogController();
    
    public abstract void safeOnBackPressed();
}