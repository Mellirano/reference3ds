package ua.privatbank.core.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003\u001d\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0014J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0015\u001a\u00020\u0000H\u0016J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001f\u0010\b\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u00a2\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lua/privatbank/core/toolbar/SearchableToolbarCoordinator;", "Lua/privatbank/core/toolbar/ToolbarCoordinator;", "()V", "etSearchInput", "Landroid/widget/EditText;", "ibBack", "Landroid/widget/ImageButton;", "ibClose", "searchListener", "Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListener;", "buildInternal", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parent", "navigationClickListener", "Landroid/view/View$OnClickListener;", "navigationIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "prodiveToolbarCoordinator", "builder", "init", "Lkotlin/Function1;", "Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListenerDsl;", "", "Lkotlin/ExtensionFunctionType;", "showNavigationIcon", "", "SearchListener", "SearchListenerAdapter", "SearchListenerDsl", "core_debug"})
public final class SearchableToolbarCoordinator extends ua.privatbank.core.toolbar.ToolbarCoordinator<ua.privatbank.core.toolbar.SearchableToolbarCoordinator> {
    private ua.privatbank.core.toolbar.SearchableToolbarCoordinator.SearchListener searchListener;
    private android.widget.ImageButton ibBack;
    private android.widget.EditText etSearchInput;
    private android.widget.ImageButton ibClose;
    
    public SearchableToolbarCoordinator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.SearchableToolbarCoordinator navigationClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener navigationClickListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.SearchableToolbarCoordinator navigationIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.SearchableToolbarCoordinator showNavigationIcon(boolean showNavigationIcon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.toolbar.SearchableToolbarCoordinator searchListener(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.toolbar.SearchableToolbarCoordinator.SearchListener searchListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.toolbar.SearchableToolbarCoordinator searchListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.toolbar.SearchableToolbarCoordinator.SearchListenerDsl, kotlin.Unit> init) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.ToolbarCoordinator<?> prodiveToolbarCoordinator(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.toolbar.SearchableToolbarCoordinator builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup buildInternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0005H\u0016J\u001a\u0010\u0003\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\n\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListenerDsl;", "Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListenerAdapter;", "()V", "onImeSearchClick", "Lkotlin/Function1;", "", "getOnImeSearchClick", "()Lkotlin/jvm/functions/Function1;", "setOnImeSearchClick", "(Lkotlin/jvm/functions/Function1;)V", "onTextChanged", "", "getOnTextChanged", "setOnTextChanged", "onTextCleared", "getOnTextCleared", "setOnTextCleared", "listener", "text", "core_debug"})
    public static final class SearchListenerDsl extends ua.privatbank.core.toolbar.SearchableToolbarCoordinator.SearchListenerAdapter {
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> onTextChanged;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> onImeSearchClick;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> onTextCleared;
        
        public SearchListenerDsl() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<java.lang.CharSequence, kotlin.Unit> getOnTextChanged() {
            return null;
        }
        
        public final void setOnTextChanged(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> getOnImeSearchClick() {
            return null;
        }
        
        public final void setOnImeSearchClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> getOnTextCleared() {
            return null;
        }
        
        public final void setOnTextCleared(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> p0) {
        }
        
        public final void onTextChanged(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> listener) {
        }
        
        public final void onImeSearchClick(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> listener) {
        }
        
        public final void onTextCleared(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super kotlin.Unit, kotlin.Unit> listener) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        @java.lang.Override()
        public void onImeSearchClick() {
        }
        
        @java.lang.Override()
        public void onTextCleared() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListener;", "", "onImeSearchClick", "", "onTextChanged", "text", "", "onTextCleared", "core_debug"})
    public static abstract interface SearchListener {
        
        public abstract void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text);
        
        public abstract void onImeSearchClick();
        
        public abstract void onTextCleared();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListenerAdapter;", "Lua/privatbank/core/toolbar/SearchableToolbarCoordinator$SearchListener;", "()V", "onImeSearchClick", "", "onTextChanged", "text", "", "onTextCleared", "core_debug"})
    public static abstract class SearchListenerAdapter implements ua.privatbank.core.toolbar.SearchableToolbarCoordinator.SearchListener {
        
        public SearchListenerAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        @java.lang.Override()
        public void onImeSearchClick() {
        }
        
        @java.lang.Override()
        public void onTextCleared() {
        }
    }
}