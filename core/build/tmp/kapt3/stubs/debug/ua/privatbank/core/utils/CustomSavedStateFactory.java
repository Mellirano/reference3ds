package ua.privatbank.core.utils;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.*;
import androidx.savedstate.SavedStateRegistryOwner;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ7\u0010\u000e\u001a\u0002H\u000f\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0014\u00a2\u0006\u0002\u0010\u0015R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lua/privatbank/core/utils/CustomSavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "createViewModel", "Lkotlin/Function1;", "Landroidx/lifecycle/SavedStateHandle;", "Lkotlin/ParameterName;", "name", "savedStateHandle", "Landroidx/lifecycle/ViewModel;", "defaultArgs", "Landroid/os/Bundle;", "(Landroidx/savedstate/SavedStateRegistryOwner;Lkotlin/jvm/functions/Function1;Landroid/os/Bundle;)V", "create", "T", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "core_debug"})
public final class CustomSavedStateFactory extends androidx.lifecycle.AbstractSavedStateViewModelFactory {
    private final kotlin.jvm.functions.Function1<androidx.lifecycle.SavedStateHandle, androidx.lifecycle.ViewModel> createViewModel = null;
    
    public CustomSavedStateFactory(@org.jetbrains.annotations.NotNull()
    androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.lifecycle.SavedStateHandle, ? extends androidx.lifecycle.ViewModel> createViewModel, @org.jetbrains.annotations.Nullable()
    android.os.Bundle defaultArgs) {
        super(null, null);
    }
    
    @java.lang.Override()
    protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        return null;
    }
}