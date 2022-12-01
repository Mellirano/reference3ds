package ua.privatbank.core.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0003-./B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u001aJ \u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0006\u0010*\u001a\u00020#J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u000eR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lua/privatbank/core/utils/EndlessScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "rvToScroll", "Landroidx/recyclerview/widget/RecyclerView;", "visibleThreshold", "", "direction", "Lua/privatbank/core/utils/EndlessScrollListener$ScrollDirection;", "(Landroidx/recyclerview/widget/RecyclerView;ILua/privatbank/core/utils/EndlessScrollListener$ScrollDirection;)V", "_lastVisibleItemSubject", "Lio/reactivex/subjects/Subject;", "getDirection", "()Lua/privatbank/core/utils/EndlessScrollListener$ScrollDirection;", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "lastVisibleItemObservable", "Lio/reactivex/Observable;", "getLastVisibleItemObservable", "()Lio/reactivex/Observable;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loadMoreListener", "Lua/privatbank/core/utils/EndlessScrollListener$OnLoadMoreListener;", "loading", "needToLoadMore", "previousTotal", "getVisibleThreshold", "()I", "setVisibleThreshold", "(I)V", "initScrollListener", "", "rv", "onLoadMoreListener", "onScrolled", "recyclerView", "dx", "dy", "reset", "updateNeedToLoad", "loadMore", "Companion", "OnLoadMoreListener", "ScrollDirection", "core_debug"})
public final class EndlessScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private androidx.recyclerview.widget.RecyclerView rvToScroll;
    private int visibleThreshold;
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.core.utils.EndlessScrollListener.ScrollDirection direction = null;
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.EndlessScrollListener.Companion Companion = null;
    private static final int DEFAULT_THRESHOLD = 5;
    private int previousTotal = 0;
    private boolean loading = true;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private ua.privatbank.core.utils.EndlessScrollListener.OnLoadMoreListener loadMoreListener;
    private boolean needToLoadMore = false;
    private boolean enabled = true;
    private final io.reactivex.subjects.Subject<java.lang.Integer> _lastVisibleItemSubject = null;
    
    public EndlessScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rvToScroll, int visibleThreshold, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.utils.EndlessScrollListener.ScrollDirection direction) {
        super();
    }
    
    public final int getVisibleThreshold() {
        return 0;
    }
    
    public final void setVisibleThreshold(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.EndlessScrollListener.ScrollDirection getDirection() {
        return null;
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Integer> getLastVisibleItemObservable() {
        return null;
    }
    
    public final void initScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv) {
    }
    
    public final void updateNeedToLoad(boolean loadMore) {
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.utils.EndlessScrollListener onLoadMoreListener(@org.jetbrains.annotations.Nullable()
    ua.privatbank.core.utils.EndlessScrollListener.OnLoadMoreListener onLoadMoreListener) {
        return null;
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/utils/EndlessScrollListener$ScrollDirection;", "", "(Ljava/lang/String;I)V", "SCROLL_DIRECTION_UP", "SCROLL_DIRECTION_DOWN", "core_debug"})
    public static enum ScrollDirection {
        /*public static final*/ SCROLL_DIRECTION_UP /* = new SCROLL_DIRECTION_UP() */,
        /*public static final*/ SCROLL_DIRECTION_DOWN /* = new SCROLL_DIRECTION_DOWN() */;
        
        ScrollDirection() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lua/privatbank/core/utils/EndlessScrollListener$OnLoadMoreListener;", "", "loadMore", "", "core_debug"})
    @java.lang.FunctionalInterface()
    public static abstract interface OnLoadMoreListener {
        
        public abstract void loadMore();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/privatbank/core/utils/EndlessScrollListener$Companion;", "", "()V", "DEFAULT_THRESHOLD", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}