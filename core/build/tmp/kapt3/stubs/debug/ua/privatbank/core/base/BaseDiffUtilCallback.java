package ua.privatbank.core.base;

import androidx.recyclerview.widget.DiffUtil;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lua/privatbank/core/base/BaseDiffUtilCallback;", "TData", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "getOldList", "setOldList", "areItemsTheSame", "", "oldItemPosition", "", "newItemPosition", "getNewListSize", "getOldListSize", "core_debug"})
public abstract class BaseDiffUtilCallback<TData extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.Callback {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends TData> oldList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends TData> newList;
    
    public BaseDiffUtilCallback() {
        super();
    }
    
    public BaseDiffUtilCallback(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends TData> oldList, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends TData> newList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<TData> getOldList() {
        return null;
    }
    
    public final void setOldList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends TData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<TData> getNewList() {
        return null;
    }
    
    public final void setNewList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends TData> p0) {
    }
    
    @java.lang.Override()
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
}