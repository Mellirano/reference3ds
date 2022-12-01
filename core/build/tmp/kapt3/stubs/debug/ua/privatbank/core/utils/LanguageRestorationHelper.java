package ua.privatbank.core.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import ua.privatbank.core.base.CoreApplication;

/**
 * During webView inflation of android 7+ it changes app locale to default one.
 * To fix issue, we save language before inflation and restore it if changes after inflation
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/utils/LanguageRestorationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "oldLocale", "Ljava/util/Locale;", "restoreIfChanged", "", "core_debug"})
public final class LanguageRestorationHelper {
    private final android.content.Context context = null;
    private final java.util.Locale oldLocale = null;
    
    public LanguageRestorationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void restoreIfChanged() {
    }
}