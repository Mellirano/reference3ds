package ua.privatbank.core.progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/progress/ProgressBarAction;", "", "hideMessage", "", "hideMessageAndShowDefaultProgressColor", "showDefaultProgressColor", "showErrorMessage", "message", "", "showErrorProgressColor", "showMessage", "core_release"})
public abstract interface ProgressBarAction {
    
    public abstract void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showErrorProgressColor();
    
    public abstract void showDefaultProgressColor();
    
    public abstract void hideMessage();
    
    public abstract void hideMessageAndShowDefaultProgressColor();
}