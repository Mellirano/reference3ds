package ua.privatbank.core.navigation;

import androidx.fragment.app.Fragment;
import ua.privatbank.core.base.BaseViewModel;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/navigation/InputModelRequiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "screenClass", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "modelClass", "", "(Ljava/lang/Class;Ljava/lang/Class;)V", "core_release"})
public final class InputModelRequiredException extends java.lang.Exception {
    
    public InputModelRequiredException(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends androidx.fragment.app.Fragment> screenClass, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends java.lang.Object> modelClass) {
        super();
    }
}