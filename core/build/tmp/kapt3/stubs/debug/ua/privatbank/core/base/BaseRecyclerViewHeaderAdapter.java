package ua.privatbank.core.base;

import androidx.recyclerview.widget.RecyclerView;
import ua.privatbank.core.utils.SectionHeaderItemDecoration;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0015\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/base/BaseRecyclerViewHeaderAdapter;", "Item", "TViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lua/privatbank/core/base/BaseRecyclerViewAdapter;", "Lua/privatbank/core/utils/SectionHeaderItemDecoration$StickyHeaderInterface;", "data", "", "(Ljava/util/List;)V", "getHeaderPositionForItem", "", "itemPosition", "core_debug"})
public abstract class BaseRecyclerViewHeaderAdapter<Item extends java.lang.Object, TViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends ua.privatbank.core.base.BaseRecyclerViewAdapter<Item, TViewHolder> implements ua.privatbank.core.utils.SectionHeaderItemDecoration.StickyHeaderInterface {
    
    public BaseRecyclerViewHeaderAdapter() {
        super(null);
    }
    
    public BaseRecyclerViewHeaderAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> data) {
        super(null);
    }
    
    @java.lang.Override()
    public int getHeaderPositionForItem(int itemPosition) {
        return 0;
    }
}