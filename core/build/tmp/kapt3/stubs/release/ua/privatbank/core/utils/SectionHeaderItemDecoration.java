package ua.privatbank.core.utils;

import android.graphics.Canvas;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006 "}, d2 = {"Lua/privatbank/core/utils/SectionHeaderItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listener", "Lua/privatbank/core/utils/SectionHeaderItemDecoration$StickyHeaderInterface;", "(Landroidx/recyclerview/widget/RecyclerView;Lua/privatbank/core/utils/SectionHeaderItemDecoration$StickyHeaderInterface;)V", "lastView", "Landroid/view/View;", "stickyHeaderHeight", "", "Ljava/lang/Integer;", "drawHeader", "", "c", "Landroid/graphics/Canvas;", "header", "fixLayoutSize", "parent", "Landroid/view/ViewGroup;", "view", "getChildInItem", "contactPoint", "getHeaderViewForItem", "itemPosition", "moveHeader", "currentHeader", "nextHeader", "onDrawOver", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "StickyHeaderInterface", "core_release"})
public final class SectionHeaderItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final ua.privatbank.core.utils.SectionHeaderItemDecoration.StickyHeaderInterface listener = null;
    private java.lang.Integer stickyHeaderHeight;
    private android.view.View lastView;
    
    public SectionHeaderItemDecoration(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    ua.privatbank.core.utils.SectionHeaderItemDecoration.StickyHeaderInterface listener) {
        super();
    }
    
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final android.view.View getHeaderViewForItem(int itemPosition, androidx.recyclerview.widget.RecyclerView parent) {
        return null;
    }
    
    private final void drawHeader(android.graphics.Canvas c, android.view.View header) {
    }
    
    private final void moveHeader(android.graphics.Canvas c, android.view.View currentHeader, android.view.View nextHeader) {
    }
    
    private final android.view.View getChildInItem(androidx.recyclerview.widget.RecyclerView parent, int contactPoint) {
        return null;
    }
    
    private final void fixLayoutSize(android.view.ViewGroup parent, android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0007H&\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/utils/SectionHeaderItemDecoration$StickyHeaderInterface;", "", "bindHeaderData", "", "header", "Landroid/view/View;", "headerPosition", "", "firstVisibleItem", "(Landroid/view/View;ILjava/lang/Integer;)V", "getHeaderLayout", "getHeaderPositionForItem", "itemPosition", "isHeader", "", "core_release"})
    public static abstract interface StickyHeaderInterface {
        
        public abstract int getHeaderPositionForItem(int itemPosition);
        
        public abstract int getHeaderLayout(int headerPosition);
        
        public abstract void bindHeaderData(@org.jetbrains.annotations.NotNull()
        android.view.View header, int headerPosition, @org.jetbrains.annotations.Nullable()
        java.lang.Integer firstVisibleItem);
        
        public abstract boolean isHeader(int itemPosition);
    }
}