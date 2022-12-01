package ua.privatbank.core.base;

import ua.privatbank.permissioncontroller.Permission;
import ua.privatbank.permissioncontroller.PermissionController;
import ua.privatbank.permissioncontroller.PermissionListener;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0002\u0010\u0010J8\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\n\"\u00020\u00112\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00142\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b\u00a2\u0006\u0002\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lua/privatbank/core/base/PbPermissions;", "", "permissionController", "Lua/privatbank/permissioncontroller/PermissionController;", "(Lua/privatbank/permissioncontroller/PermissionController;)V", "getPermissionController", "()Lua/privatbank/permissioncontroller/PermissionController;", "ask", "", "permission", "", "", "block", "Lkotlin/Function1;", "Lua/privatbank/core/base/PermissionListeners;", "Lkotlin/ExtensionFunctionType;", "([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lua/privatbank/permissioncontroller/Permission;", "([Lua/privatbank/permissioncontroller/Permission;Lkotlin/jvm/functions/Function1;)V", "checkPermission", "", "([Ljava/lang/String;)Z", "core_release"})
public final class PbPermissions {
    @org.jetbrains.annotations.NotNull()
    private final ua.privatbank.permissioncontroller.PermissionController permissionController = null;
    
    public PbPermissions(@org.jetbrains.annotations.NotNull()
    ua.privatbank.permissioncontroller.PermissionController permissionController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.privatbank.permissioncontroller.PermissionController getPermissionController() {
        return null;
    }
    
    public final void ask(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permission, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.base.PermissionListeners, kotlin.Unit> block) {
    }
    
    public final void ask(@org.jetbrains.annotations.NotNull()
    ua.privatbank.permissioncontroller.Permission[] permission, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.base.PermissionListeners, kotlin.Unit> block) {
    }
    
    public final boolean checkPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String... permission) {
        return false;
    }
}