package ua.privatbank.core.snackbar;

import android.view.View;
import androidx.annotation.AttrRes;
import com.google.android.material.snackbar.Snackbar;
import ua.privatbank.core.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarPreset;", "", "()V", "configure", "", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "Error", "Info", "NoInternet", "Success", "core_release"})
public abstract class SnackbarPreset {
    
    public SnackbarPreset() {
        super();
    }
    
    public abstract void configure(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarPreset$Info;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "title", "", "message", "cornersRadius", "", "backgroundColor", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;FI)V", "getBackgroundColor", "()I", "getCornersRadius", "()F", "getMessage", "()Ljava/lang/CharSequence;", "getTitle", "configure", "", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_release"})
    public static final class Info extends ua.privatbank.core.snackbar.SnackbarPreset {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence message = null;
        private final float cornersRadius = 0.0F;
        private final int backgroundColor = 0;
        
        public Info() {
            super();
        }
        
        public Info(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence message, float cornersRadius, @androidx.annotation.AttrRes()
        int backgroundColor) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getMessage() {
            return null;
        }
        
        public final float getCornersRadius() {
            return 0.0F;
        }
        
        public final int getBackgroundColor() {
            return 0;
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarPreset$Error;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "title", "", "message", "cornersRadius", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;F)V", "getCornersRadius", "()F", "getMessage", "()Ljava/lang/CharSequence;", "getTitle", "configure", "", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_release"})
    public static final class Error extends ua.privatbank.core.snackbar.SnackbarPreset {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence message = null;
        private final float cornersRadius = 0.0F;
        
        public Error() {
            super();
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence message, float cornersRadius) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getMessage() {
            return null;
        }
        
        public final float getCornersRadius() {
            return 0.0F;
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarPreset$Success;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "title", "", "message", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getMessage", "()Ljava/lang/CharSequence;", "getTitle", "configure", "", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_release"})
    public static final class Success extends ua.privatbank.core.snackbar.SnackbarPreset {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.CharSequence message = null;
        
        public Success() {
            super();
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence message) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getMessage() {
            return null;
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/privatbank/core/snackbar/SnackbarPreset$NoInternet;", "Lua/privatbank/core/snackbar/SnackbarPreset;", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "configure", "snackbarHelper", "Lua/privatbank/core/snackbar/SnackbarHelper;", "core_release"})
    public static final class NoInternet extends ua.privatbank.core.snackbar.SnackbarPreset {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> clickListener = null;
        
        public NoInternet(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getClickListener() {
            return null;
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.snackbar.SnackbarHelper snackbarHelper) {
        }
    }
}