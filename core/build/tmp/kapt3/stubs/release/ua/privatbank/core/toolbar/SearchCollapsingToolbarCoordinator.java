package ua.privatbank.core.toolbar;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import ua.privatbank.core.R;
import ua.privatbank.core.utils.KeyboardUtils;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BH\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eH\u0014J\u000e\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010%\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 R,\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006&"}, d2 = {"Lua/privatbank/core/toolbar/SearchCollapsingToolbarCoordinator;", "Lua/privatbank/core/toolbar/StandardToolbarCoordinator;", "hint", "", "searchAction", "Lua/privatbank/core/toolbar/SearchAction;", "enableSearch", "", "emitAnalytics", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "visibility", "", "(Ljava/lang/String;Lua/privatbank/core/toolbar/SearchAction;ZLkotlin/jvm/functions/Function1;)V", "getEmitAnalytics", "()Lkotlin/jvm/functions/Function1;", "getEnableSearch", "()Z", "etSearch", "Landroid/widget/EditText;", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "rlSearch", "Landroid/widget/RelativeLayout;", "getSearchAction", "()Lua/privatbank/core/toolbar/SearchAction;", "buildInternal", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parent", "hideSearch", "isSearchVisible", "openSearchView", "showSearch", "core_release"})
public final class SearchCollapsingToolbarCoordinator extends ua.privatbank.core.toolbar.StandardToolbarCoordinator {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hint;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.toolbar.SearchAction searchAction = null;
    private final boolean enableSearch = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> emitAnalytics = null;
    private android.widget.EditText etSearch;
    private android.widget.RelativeLayout rlSearch;
    
    public SearchCollapsingToolbarCoordinator(@org.jetbrains.annotations.Nullable()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.toolbar.SearchAction searchAction, boolean enableSearch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> emitAnalytics) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHint() {
        return null;
    }
    
    public final void setHint(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.toolbar.SearchAction getSearchAction() {
        return null;
    }
    
    public final boolean getEnableSearch() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getEmitAnalytics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup buildInternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final boolean isSearchVisible() {
        return false;
    }
    
    public final void showSearch(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void hideSearch(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void openSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}