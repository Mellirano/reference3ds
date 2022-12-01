package ua.privatbank.core.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.privatbank.core.base.CoreApplication;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.navigation.AnalyticsProvider;
import java.util.regex.Pattern;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u00d4\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001a\u0016\u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u001a\u0015\u0010\u0015\u001a\u00020\r\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0014H\u0086\b\u001a\u001a\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001a\u001a\u0010\u001a\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u001b\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u001c\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001a\u001a\u0010\u001e\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u001f\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0000\u001a\u0006\u0010 \u001a\u00020!\u001a\u0006\u0010\"\u001a\u00020!\u001a\u0006\u0010#\u001a\u00020!\u001a\u001c\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001aB\u0010&\u001a\u0004\u0018\u0001H\'\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\'2\b\u0010(\u001a\u0004\u0018\u0001H\u00162\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\'0*\u00a2\u0006\u0002\b+H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,\u001a\u0012\u0010-\u001a\u00020\u0004*\u00020\u00042\u0006\u0010.\u001a\u00020\u0004\u001a\u0016\u0010/\u001a\u00020\u0004*\u00020\u00042\n\u00100\u001a\u000201\"\u00020\u0004\u001a6\u00102\u001a\u000203*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002032\b\b\u0001\u00107\u001a\u00020\u00042\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u001a\n\u0010\u0011\u001a\u00020\r*\u00020\u0014\u001a\u0012\u0010\u0011\u001a\u00020\r*\n\u0012\u0006\b\u0001\u0012\u00020\u001409\u001a\u0014\u0010:\u001a\u0004\u0018\u00010\r*\u00020;2\u0006\u0010<\u001a\u00020\r\u001a\n\u0010=\u001a\u00020>*\u000205\u001a\n\u0010?\u001a\u00020!*\u000205\u001a\n\u0010@\u001a\u00020\r*\u00020\r\u001a&\u0010A\u001a\u00020\u0010*\u00020B2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100*\u001a \u00108\u001a\u00020\u0010*\u00020D2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001a4\u0010E\u001a\u0012\u0012\u0004\u0012\u0002H\u00160Fj\b\u0012\u0004\u0012\u0002H\u0016`G\"\u0004\b\u0000\u0010\u0016*\u0016\u0012\u0004\u0012\u0002H\u0016\u0018\u00010Fj\n\u0012\u0004\u0012\u0002H\u0016\u0018\u0001`G\u001a\u0011\u0010H\u001a\u00020!*\u0004\u0018\u00010!\u00a2\u0006\u0002\u0010I\u001a\u0011\u0010J\u001a\u00020K*\u0004\u0018\u00010K\u00a2\u0006\u0002\u0010L\u001a\u0011\u0010J\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010M\u001a\u0011\u0010J\u001a\u00020\u0004*\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010N\u001a\u0011\u0010J\u001a\u00020O*\u0004\u0018\u00010O\u00a2\u0006\u0002\u0010P\u001a\u0015\u0010Q\u001a\u00020\u0010*\u00020R2\u0006\u0010S\u001a\u00020TH\u0086\u0006\u001a\u0012\u0010U\u001a\u00020\u0004*\u00020\u00042\u0006\u0010.\u001a\u00020\u0004\u001a\u0016\u0010V\u001a\u00020\u0004*\u00020\u00042\n\u00100\u001a\u000201\"\u00020\u0004\u001a>\u0010W\u001a\u0004\u0018\u0001H\'\"\u0004\b\u0000\u0010\'*\u0004\u0018\u00010\r2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\'0X\u00a2\u0006\u0002\b+H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010Y\u001a>\u0010Z\u001a\u0004\u0018\u0001H\'\"\u0004\b\u0000\u0010\'*\u0004\u0018\u00010\r2\u001d\u0010)\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\'0X\u00a2\u0006\u0002\b+H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010Y\u001a\f\u0010[\u001a\u00020K*\u0004\u0018\u00010\r\u001a\f\u0010\\\u001a\u00020]*\u0004\u0018\u00010\r\u001a\f\u0010^\u001a\u00020\u0004*\u0004\u0018\u00010\r\u001a\u0016\u0010_\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010`*\u0004\u0018\u00010a\u001a/\u0010b\u001a\u0002H\'\"\u0004\b\u0000\u0010\'*\u00020c2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u0002H\'0*H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010d\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006e"}, d2 = {"dpToPx", "", "getDpToPx", "(F)F", "", "(I)I", "pxToDp", "getPxToDp", "spToPx", "getSpToPx", "clickListener", "Landroid/view/View$OnClickListener;", "tag", "", "callback", "Lkotlin/Function0;", "", "createTag", "clazz", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "createTagForFragment", "T", "ifKitkat", "action", "ifLollipop", "ifMarshmallow", "ifNougat", "ifPreKitkat", "ifPreLollipop", "ifPreMarshmallow", "ifR", "isKitkat", "", "isLollipop", "isMarshmallow", "menuListener", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "withNotNull", "R", "receiver", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "addBitFlag", "flag", "addBitFlags", "flags", "", "createClickableSpan", "", "context", "Landroid/content/Context;", "clickableRegion", "style", "onClick", "Lkotlin/reflect/KClass;", "findField", "Lorg/json/JSONObject;", "field", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "isNetworkHardwareConnected", "leftOnlyDigits", "onCheckChange", "Landroid/widget/CompoundButton;", "onChange", "Landroid/view/View;", "orEmptyArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "orFalse", "(Ljava/lang/Boolean;)Z", "orZero", "", "(Ljava/lang/Double;)D", "(Ljava/lang/Float;)F", "(Ljava/lang/Integer;)I", "", "(Ljava/lang/Long;)J", "plusAssign", "Lio/reactivex/disposables/CompositeDisposable;", "subscribe", "Lio/reactivex/disposables/Disposable;", "removeBitFlag", "removeBitFlags", "takeIfNullOrEmpry", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "takeUnlessNullOrEmpry", "toDoubleOrZero", "toHtmlSpannable", "Landroid/text/Spanned;", "toInOrZero", "toMap", "", "", "use", "Landroid/content/res/TypedArray;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core_release"})
public final class ExtentionsKt {
    
    public static final void plusAssign(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable $this$plusAssign, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable subscribe) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String createTag(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$createTag) {
        return null;
    }
    
    public static final int getPxToDp(int $this$pxToDp) {
        return 0;
    }
    
    public static final int getDpToPx(int $this$dpToPx) {
        return 0;
    }
    
    public static final float getDpToPx(float $this$dpToPx) {
        return 0.0F;
    }
    
    public static final int getSpToPx(int $this$spToPx) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String createTag(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends androidx.fragment.app.Fragment> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String createTag(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends androidx.fragment.app.Fragment> $this$createTag) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object, R extends java.lang.Object>R withNotNull(@org.jetbrains.annotations.Nullable()
    T receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <R extends java.lang.Object>R takeIfNullOrEmpry(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$takeIfNullOrEmpry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <R extends java.lang.Object>R takeUnlessNullOrEmpry(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$takeUnlessNullOrEmpry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.util.DisplayMetrics getDisplayMetrics(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDisplayMetrics) {
        return null;
    }
    
    public static final void ifNougat(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifMarshmallow(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifR(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifPreMarshmallow(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifLollipop(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifKitkat(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void ifPreLollipop(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final boolean isMarshmallow() {
        return false;
    }
    
    public static final boolean isLollipop() {
        return false;
    }
    
    public static final boolean isKitkat() {
        return false;
    }
    
    public static final void ifPreKitkat(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String leftOnlyDigits(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$leftOnlyDigits) {
        return null;
    }
    
    public static final double orZero(@org.jetbrains.annotations.Nullable()
    java.lang.Double $this$orZero) {
        return 0.0;
    }
    
    public static final int orZero(@org.jetbrains.annotations.Nullable()
    java.lang.Integer $this$orZero) {
        return 0;
    }
    
    public static final float orZero(@org.jetbrains.annotations.Nullable()
    java.lang.Float $this$orZero) {
        return 0.0F;
    }
    
    public static final long orZero(@org.jetbrains.annotations.Nullable()
    java.lang.Long $this$orZero) {
        return 0L;
    }
    
    public static final boolean orFalse(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean $this$orFalse) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.text.Spanned toHtmlSpannable(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$toHtmlSpannable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence createClickableSpan(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence $this$createClickableSpan, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence clickableRegion, @androidx.annotation.StyleRes()
    int style, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    public static final double toDoubleOrZero(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$toDoubleOrZero) {
        return 0.0;
    }
    
    public static final int toInOrZero(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$toInOrZero) {
        return 0;
    }
    
    public static final boolean isNetworkHardwareConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isNetworkHardwareConnected) {
        return false;
    }
    
    public static final <R extends java.lang.Object>R use(@org.jetbrains.annotations.NotNull()
    android.content.res.TypedArray $this$use, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, ? extends R> block) {
        return null;
    }
    
    public static final int removeBitFlag(int $this$removeBitFlag, int flag) {
        return 0;
    }
    
    public static final int addBitFlag(int $this$addBitFlag, int flag) {
        return 0;
    }
    
    public static final int addBitFlags(int $this$addBitFlags, @org.jetbrains.annotations.NotNull()
    int... flags) {
        return 0;
    }
    
    public static final int removeBitFlags(int $this$removeBitFlags, @org.jetbrains.annotations.NotNull()
    int... flags) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String findField(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject $this$findField, @org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.ArrayList<T> orEmptyArrayList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<T> $this$orEmptyArrayList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.appcompat.widget.Toolbar.OnMenuItemClickListener menuListener(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View.OnClickListener clickListener(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        return null;
    }
    
    public static final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onClick, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void onCheckChange(@org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton $this$onCheckChange, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onChange) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Map<?, ?> toMap(@org.jetbrains.annotations.Nullable()
    java.lang.Object $this$toMap) {
        return null;
    }
}