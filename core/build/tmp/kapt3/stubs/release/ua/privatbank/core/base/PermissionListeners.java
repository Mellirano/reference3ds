package ua.privatbank.core.base;

import ua.privatbank.permissioncontroller.Permission;
import ua.privatbank.permissioncontroller.PermissionController;
import ua.privatbank.permissioncontroller.PermissionListener;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lua/privatbank/core/base/PermissionListeners;", "", "()V", "onDeniedCallback", "Lkotlin/Function0;", "", "getOnDeniedCallback$core_release", "()Lkotlin/jvm/functions/Function0;", "setOnDeniedCallback$core_release", "(Lkotlin/jvm/functions/Function0;)V", "onGrantedCallback", "getOnGrantedCallback$core_release", "setOnGrantedCallback$core_release", "onDenied", "onGranted", "core_release"})
public final class PermissionListeners {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onGrantedCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDeniedCallback;
    
    public PermissionListeners() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnGrantedCallback$core_release() {
        return null;
    }
    
    public final void setOnGrantedCallback$core_release(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDeniedCallback$core_release() {
        return null;
    }
    
    public final void setOnDeniedCallback$core_release(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.PermissionListeners onGranted(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGranted) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.core.base.PermissionListeners onDenied(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDenied) {
        return null;
    }
}