package ua.privatbank.core.toolbar;

import android.content.Context;
import android.view.ViewGroup;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/toolbar/ToolbarCoordinatorProvider;", "", "build", "Lua/privatbank/core/toolbar/ToolbarCoordinator;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "core_debug"})
public abstract interface ToolbarCoordinatorProvider {
    
    @org.jetbrains.annotations.Nullable()
    public abstract ua.privatbank.core.toolbar.ToolbarCoordinator<?> build(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
}