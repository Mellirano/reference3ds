package ua.privatbank.core.toolbar;

import android.graphics.drawable.Drawable;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lua/privatbank/core/toolbar/HasLogo;", "T", "", "logoIcon", "Landroid/graphics/drawable/Drawable;", "isLarge", "", "(Landroid/graphics/drawable/Drawable;Z)Ljava/lang/Object;", "", "(I)Ljava/lang/Object;", "core_release"})
public abstract interface HasLogo<T extends java.lang.Object> {
    
    public abstract T logoIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable logoIcon, boolean isLarge);
    
    public abstract T logoIcon(int logoIcon);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}