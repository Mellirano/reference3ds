package ua.privatbank.core.toolbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.LayoutRes;
import androidx.annotation.MenuRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.google.android.material.tabs.TabLayout;
import ua.privatbank.core.R;
import ua.privatbank.core.navigation.AnalyticsProvider;
import ua.privatbank.core.utils.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0088\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001b\u0010_\u001a\u00028\u00002\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020E\u00a2\u0006\u0002\u0010bJ\u0017\u0010\u0004\u001a\u00028\u00002\b\u0010c\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010dJ\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010eJ\u001e\u0010f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0016J\u0018\u0010k\u001a\u00020j2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH$J\u0018\u0010l\u001a\u00020E2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0002J\u0006\u0010m\u001a\u00020\'J\u000e\u0010n\u001a\u00020C2\u0006\u0010g\u001a\u00020hJ\u000b\u0010o\u001a\u00028\u0000\u00a2\u0006\u0002\u0010pJ\u0016\u0010q\u001a\u00020\'2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u0016J\u000e\u0010s\u001a\u00020\u00162\u0006\u0010`\u001a\u00020\u000bJ#\u0010#\u001a\u00028\u00002\b\b\u0001\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0016\u00a2\u0006\u0002\u0010tJ\u0017\u0010-\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010.H\u0016\u00a2\u0006\u0002\u0010uJ\u0017\u00103\u001a\u00028\u00002\b\u00103\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010dJ\u0015\u00103\u001a\u00028\u00002\u0006\u00106\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010eJ\u0018\u0010v\u001a\u00020\'2\u0006\u0010g\u001a\u00020h2\u0006\u0010w\u001a\u00020jH\u0004J\u0019\u0010x\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010y\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010zJ&\u0010{\u001a\u00020\'2\u0006\u0010g\u001a\u00020h2\b\b\u0001\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0016J!\u0010|\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\'0&\u00a2\u0006\u0002\u0010}J\u0013\u0010~\u001a\u00028\u00002\u0006\u0010:\u001a\u000209\u00a2\u0006\u0002\u0010\u007fJ\u0014\u0010\u0080\u0001\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\u000b\u00a2\u0006\u0002\u0010eJ\"\u0010\u0081\u0001\u001a\u00028\u00002\u0014\u0010V\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020\'0&\u00a2\u0006\u0002\u0010}J\u0011\u0010\u0082\u0001\u001a\u00020\'2\u0006\u0010g\u001a\u00020hH\u0016J\u0016\u0010J\u001a\u00028\u00002\u0006\u0010J\u001a\u00020\u0016H\u0016\u00a2\u0006\u0003\u0010\u0083\u0001J\u0016\u0010M\u001a\u00028\u00002\u0006\u0010M\u001a\u00020NH\u0016\u00a2\u0006\u0003\u0010\u0084\u0001J\u0017\u0010M\u001a\u00028\u00002\b\b\u0001\u0010S\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010eJ\u000e\u0010\u0085\u0001\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010pJ\u001d\u0010\u0086\u0001\u001a\u00020\'2\b\b\u0001\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u000109J\u0019\u0010\u0087\u0001\u001a\u00020\'2\u0006\u00106\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR@\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\'0&2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\'0&@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001a\u00106\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fR(\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0015\u001a\u0004\u0018\u000109@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000fR\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010\u001eR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010S\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010\u000fR(\u0010V\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u00a8\u0006\u0089\u0001"}, d2 = {"Lua/privatbank/core/toolbar/ToolbarCoordinator;", "T", "Lua/privatbank/core/toolbar/ToolbarCoordinatorProvider;", "()V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground", "()Landroid/graphics/drawable/Drawable;", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "backgroundId", "", "getBackgroundId", "()I", "setBackgroundId", "(I)V", "expandableViews", "", "Lua/privatbank/core/toolbar/ToolbarCoordinator$ViewInfo;", "getExpandableViews", "()Ljava/util/Map;", "<set-?>", "", "hasExpandableView", "getHasExpandableView", "()Z", "isProgressBarEnabled", "value", "isProgressVisible", "setProgressVisible", "(Z)V", "menu", "Landroid/view/Menu;", "getMenu", "()Landroid/view/Menu;", "menuRes", "getMenuRes", "setMenuRes", "Lkotlin/Function1;", "", "menuSetupAction", "getMenuSetupAction", "()Lkotlin/jvm/functions/Function1;", "setMenuSetupAction$core_debug", "(Lkotlin/jvm/functions/Function1;)V", "navigationClickListener", "Landroid/view/View$OnClickListener;", "getNavigationClickListener", "()Landroid/view/View$OnClickListener;", "setNavigationClickListener", "(Landroid/view/View$OnClickListener;)V", "navigationIcon", "getNavigationIcon", "setNavigationIcon", "navigationIconId", "getNavigationIconId", "setNavigationIconId", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "onMenuItemClickListener", "getOnMenuItemClickListener", "()Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "setOnMenuItemClickListener$core_debug", "(Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;)V", "parentId", "getParentId", "setParentId", "progressBar", "Landroid/widget/ProgressBar;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "showNavigationIcon", "getShowNavigationIcon", "setShowNavigationIcon", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "tabLayoutId", "getTabLayoutId", "setTabLayoutId", "tabLayoutSetupAction", "getTabLayoutSetupAction", "setTabLayoutSetupAction", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "addExpandableView", "id", "view", "(ILandroid/view/View;)Ljava/lang/Object;", "drawable", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Object;", "(I)Ljava/lang/Object;", "build", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "buildInternal", "buildView", "clearMenu", "createProgressBar", "enableProgressBar", "()Ljava/lang/Object;", "expandInnerView", "expand", "isViewExpanded", "(ILandroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;)Ljava/lang/Object;", "(Landroid/view/View$OnClickListener;)Ljava/lang/Object;", "prepareTabLayout", "viewGroup", "prodiveToolbarCoordinator", "builder", "(Ljava/lang/Object;)Lua/privatbank/core/toolbar/ToolbarCoordinator;", "setMenu", "setMenuSetupAction", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setOnMenuItemClickListener", "(Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;)Ljava/lang/Object;", "setParentLayoutId", "setTabLayoutSetUpAction", "setUpMenu", "(Z)Ljava/lang/Object;", "(Lcom/google/android/material/tabs/TabLayout;)Ljava/lang/Object;", "toolbarAsT", "updateMenuRes", "updateNavigation", "ViewInfo", "core_debug"})
public abstract class ToolbarCoordinator<T extends java.lang.Object> implements ua.privatbank.core.toolbar.ToolbarCoordinatorProvider {
    @org.jetbrains.annotations.Nullable()
    private android.view.View rootView;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.tabs.TabLayout tabLayout;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable navigationIcon;
    private int navigationIconId = 0;
    @androidx.annotation.LayoutRes()
    private int tabLayoutId = 0;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable background;
    private int backgroundId = 0;
    @androidx.annotation.MenuRes()
    private int menuRes = 0;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.google.android.material.tabs.TabLayout, kotlin.Unit> tabLayoutSetupAction;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super android.view.Menu, kotlin.Unit> menuSetupAction;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener navigationClickListener;
    private boolean showNavigationIcon = true;
    private boolean isProgressBarEnabled = false;
    private boolean hasExpandableView = false;
    private int parentId = -1;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, ua.privatbank.core.toolbar.ToolbarCoordinator.ViewInfo> expandableViews = null;
    private boolean isProgressVisible = false;
    private android.widget.ProgressBar progressBar;
    
    public ToolbarCoordinator() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.tabs.TabLayout getTabLayout() {
        return null;
    }
    
    public final void setTabLayout(@org.jetbrains.annotations.Nullable()
    com.google.android.material.tabs.TabLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.Menu getMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getNavigationIcon() {
        return null;
    }
    
    public final void setNavigationIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    public final int getNavigationIconId() {
        return 0;
    }
    
    public final void setNavigationIconId(int p0) {
    }
    
    public final int getTabLayoutId() {
        return 0;
    }
    
    public final void setTabLayoutId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getBackground() {
        return null;
    }
    
    public final void setBackground(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    public final int getBackgroundId() {
        return 0;
    }
    
    public final void setBackgroundId(int p0) {
    }
    
    public final int getMenuRes() {
        return 0;
    }
    
    public final void setMenuRes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.google.android.material.tabs.TabLayout, kotlin.Unit> getTabLayoutSetupAction() {
        return null;
    }
    
    public final void setTabLayoutSetupAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.material.tabs.TabLayout, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.view.Menu, kotlin.Unit> getMenuSetupAction() {
        return null;
    }
    
    public final void setMenuSetupAction$core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.Menu, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar.OnMenuItemClickListener getOnMenuItemClickListener() {
        return null;
    }
    
    public final void setOnMenuItemClickListener$core_debug(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getNavigationClickListener() {
        return null;
    }
    
    public final void setNavigationClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    public final boolean getShowNavigationIcon() {
        return false;
    }
    
    public final void setShowNavigationIcon(boolean p0) {
    }
    
    public final boolean isProgressBarEnabled() {
        return false;
    }
    
    public final boolean getHasExpandableView() {
        return false;
    }
    
    public final int getParentId() {
        return 0;
    }
    
    public final void setParentId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, ua.privatbank.core.toolbar.ToolbarCoordinator.ViewInfo> getExpandableViews() {
        return null;
    }
    
    public final T enableProgressBar() {
        return null;
    }
    
    public final T addExpandableView(int id, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public final boolean isViewExpanded(int id) {
        return false;
    }
    
    public final void expandInnerView(int id, boolean expand) {
    }
    
    public final boolean isProgressVisible() {
        return false;
    }
    
    public final void setProgressVisible(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar createProgressBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public T background(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    public T background(int backgroundId) {
        return null;
    }
    
    public T navigationClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener navigationClickListener) {
        return null;
    }
    
    public T navigationIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable navigationIcon) {
        return null;
    }
    
    public T navigationIcon(int navigationIconId) {
        return null;
    }
    
    public T showNavigationIcon(boolean showNavigationIcon) {
        return null;
    }
    
    public T tabLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout tabLayout) {
        return null;
    }
    
    public T tabLayout(@androidx.annotation.LayoutRes()
    int tabLayoutId) {
        return null;
    }
    
    public final T setParentLayoutId(int parentId) {
        return null;
    }
    
    public T menuRes(@androidx.annotation.MenuRes()
    int menuRes, @org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        return null;
    }
    
    public final void updateNavigation(int navigationIconId, @org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener navigationClickListener) {
    }
    
    public final void updateMenuRes(@androidx.annotation.MenuRes()
    int menuRes, @org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
    }
    
    public final void clearMenu() {
    }
    
    public void setMenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.MenuRes()
    int menuRes, @org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
    }
    
    public void setUpMenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final T setTabLayoutSetUpAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.material.tabs.TabLayout, kotlin.Unit> tabLayoutSetupAction) {
        return null;
    }
    
    public final T setMenuSetupAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.Menu, kotlin.Unit> menuSetupAction) {
        return null;
    }
    
    public final T setOnMenuItemClickListener(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        return null;
    }
    
    protected final void prepareTabLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup) {
    }
    
    private final android.view.View buildView(android.content.Context context, android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.view.ViewGroup buildInternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.privatbank.core.toolbar.ToolbarCoordinator<?> prodiveToolbarCoordinator(T builder);
    
    protected final T toolbarAsT() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.privatbank.core.toolbar.ToolbarCoordinator<?> build(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/toolbar/ToolbarCoordinator$ViewInfo;", "", "view", "Landroid/view/View;", "expanded", "", "(Landroid/view/View;Z)V", "getExpanded", "()Z", "setExpanded", "(Z)V", "getView", "()Landroid/view/View;", "core_debug"})
    public static final class ViewInfo {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        private boolean expanded;
        
        public ViewInfo(@org.jetbrains.annotations.NotNull()
        android.view.View view, boolean expanded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final boolean getExpanded() {
            return false;
        }
        
        public final void setExpanded(boolean p0) {
        }
    }
}