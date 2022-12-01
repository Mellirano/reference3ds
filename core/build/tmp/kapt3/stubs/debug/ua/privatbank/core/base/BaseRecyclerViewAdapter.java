package ua.privatbank.core.base;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import ua.privatbank.core.logger.LoggerFactory;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001.B\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0013\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001eH\u0016J\u001d\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010%\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010*J0\u0010+\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010*H\u0002J\u0016\u0010,\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J.\u0010,\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010*J\u0016\u0010-\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016R*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u00120\u0013R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lua/privatbank/core/base/BaseRecyclerViewAdapter;", "Item", "TViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "data", "", "(Ljava/util/List;)V", "<set-?>", "", "getData", "()Ljava/util/List;", "onItemsUpdatedSubject", "Lio/reactivex/subjects/Subject;", "", "getOnItemsUpdatedSubject", "()Lio/reactivex/subjects/Subject;", "pendingUpdates", "Ljava/util/Queue;", "Lua/privatbank/core/base/BaseRecyclerViewAdapter$PendingUpdate;", "add", "", "item", "(Ljava/lang/Object;)Z", "addAll", "collection", "", "clear", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "insert", "(Ljava/lang/Object;I)V", "remove", "removeAndNotify", "updateItemsQueued", "newObjects", "callback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "onItemsUpdated", "Lkotlin/Function0;", "updateItemsQueuedInternal", "updateListItems", "updateListItemsWithNotify", "PendingUpdate", "core_debug"})
public abstract class BaseRecyclerViewAdapter<Item extends java.lang.Object, TViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<TViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<kotlin.Unit> onItemsUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<Item> data;
    private final java.util.Queue<ua.privatbank.core.base.BaseRecyclerViewAdapter<Item, TViewHolder>.PendingUpdate> pendingUpdates = null;
    
    public BaseRecyclerViewAdapter() {
        super();
    }
    
    public BaseRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.Subject<kotlin.Unit> getOnItemsUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Item> getData() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final boolean add(Item item) {
        return false;
    }
    
    protected final boolean remove(Item item) {
        return false;
    }
    
    public final void removeAndNotify(int position) {
    }
    
    public final Item getItem(int position) {
        return null;
    }
    
    public void insert(Item item, int position) {
    }
    
    public void clear() {
    }
    
    public final boolean addAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends Item> collection) {
        return false;
    }
    
    public void updateListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> newObjects) {
    }
    
    public void updateListItemsWithNotify(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> newObjects) {
    }
    
    public final void updateListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> newObjects, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.Callback callback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onItemsUpdated) {
    }
    
    public final void updateItemsQueued(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Item> newObjects, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.Callback callback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onItemsUpdated) {
    }
    
    private final void updateItemsQueuedInternal(java.util.List<? extends Item> newObjects, androidx.recyclerview.widget.DiffUtil.Callback callback, kotlin.jvm.functions.Function0<kotlin.Unit> onItemsUpdated) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lua/privatbank/core/base/BaseRecyclerViewAdapter$PendingUpdate;", "", "items", "", "diffUtilCallback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "onItemsUpdated", "Lkotlin/Function0;", "", "(Lua/privatbank/core/base/BaseRecyclerViewAdapter;Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$Callback;Lkotlin/jvm/functions/Function0;)V", "getDiffUtilCallback", "()Landroidx/recyclerview/widget/DiffUtil$Callback;", "getItems", "()Ljava/util/List;", "getOnItemsUpdated", "()Lkotlin/jvm/functions/Function0;", "core_debug"})
    public final class PendingUpdate {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<Item> items = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.DiffUtil.Callback diffUtilCallback = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onItemsUpdated = null;
        
        public PendingUpdate(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends Item> items, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.DiffUtil.Callback diffUtilCallback, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> onItemsUpdated) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<Item> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.Callback getDiffUtilCallback() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnItemsUpdated() {
            return null;
        }
    }
}