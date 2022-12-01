package ua.privatbank.core.navigation;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Single;
import ua.privatbank.core.base.BaseViewModel;
import ua.privatbank.core.jsonconverter.JsonConverterFactory;
import java.io.Serializable;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2;", "", "()V", "route", "", "router", "Lua/privatbank/core/navigation/NavRouter2;", "Back", "BackTo", "BackWithResult", "BackWithResultTo", "NavTo", "Lua/privatbank/core/navigation/NavCommand2$Back;", "Lua/privatbank/core/navigation/NavCommand2$BackTo;", "Lua/privatbank/core/navigation/NavCommand2$BackWithResult;", "Lua/privatbank/core/navigation/NavCommand2$BackWithResultTo;", "Lua/privatbank/core/navigation/NavCommand2$NavTo;", "core_debug"})
public abstract class NavCommand2 {
    
    private NavCommand2() {
        super();
    }
    
    public final void route(@org.jetbrains.annotations.NotNull()
    ua.privatbank.core.navigation.NavRouter2 router) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2$NavTo;", "Lua/privatbank/core/navigation/NavCommand2;", "dest", "Lua/privatbank/core/navigation/NavKey;", "input", "Ljava/io/Serializable;", "jsonInput", "", "config", "Lua/privatbank/core/navigation/Config;", "anim", "Lua/privatbank/core/navigation/Anim;", "(Lua/privatbank/core/navigation/NavKey;Ljava/io/Serializable;Ljava/lang/String;Lua/privatbank/core/navigation/Config;Lua/privatbank/core/navigation/Anim;)V", "getAnim", "()Lua/privatbank/core/navigation/Anim;", "getConfig", "()Lua/privatbank/core/navigation/Config;", "getDest", "()Lua/privatbank/core/navigation/NavKey;", "getInput", "()Ljava/io/Serializable;", "getJsonInput", "()Ljava/lang/String;", "core_debug"})
    public static final class NavTo extends ua.privatbank.core.navigation.NavCommand2 {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.navigation.NavKey dest = null;
        @org.jetbrains.annotations.Nullable()
        private final java.io.Serializable input = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String jsonInput = null;
        @org.jetbrains.annotations.Nullable()
        private final ua.privatbank.core.navigation.Config config = null;
        @org.jetbrains.annotations.Nullable()
        private final ua.privatbank.core.navigation.Anim anim = null;
        
        public NavTo(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.navigation.NavKey dest, @org.jetbrains.annotations.Nullable()
        java.io.Serializable input, @org.jetbrains.annotations.Nullable()
        java.lang.String jsonInput, @org.jetbrains.annotations.Nullable()
        ua.privatbank.core.navigation.Config config, @org.jetbrains.annotations.Nullable()
        ua.privatbank.core.navigation.Anim anim) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.navigation.NavKey getDest() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.Serializable getInput() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getJsonInput() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ua.privatbank.core.navigation.Config getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ua.privatbank.core.navigation.Anim getAnim() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2$Back;", "Lua/privatbank/core/navigation/NavCommand2;", "()V", "core_debug"})
    public static final class Back extends ua.privatbank.core.navigation.NavCommand2 {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.navigation.NavCommand2.Back INSTANCE = null;
        
        private Back() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2$BackTo;", "Lua/privatbank/core/navigation/NavCommand2;", "dest", "Lua/privatbank/core/navigation/NavKey;", "(Lua/privatbank/core/navigation/NavKey;)V", "getDest", "()Lua/privatbank/core/navigation/NavKey;", "core_debug"})
    public static final class BackTo extends ua.privatbank.core.navigation.NavCommand2 {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.navigation.NavKey dest = null;
        
        public BackTo(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.navigation.NavKey dest) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.navigation.NavKey getDest() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2$BackWithResult;", "Lua/privatbank/core/navigation/NavCommand2;", "result", "Lua/privatbank/core/navigation/NavResult;", "(Lua/privatbank/core/navigation/NavResult;)V", "getResult", "()Lua/privatbank/core/navigation/NavResult;", "core_debug"})
    public static final class BackWithResult extends ua.privatbank.core.navigation.NavCommand2 {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.navigation.NavResult<?> result = null;
        
        public BackWithResult(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.navigation.NavResult<?> result) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.navigation.NavResult<?> getResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/privatbank/core/navigation/NavCommand2$BackWithResultTo;", "Lua/privatbank/core/navigation/NavCommand2;", "result", "Lua/privatbank/core/navigation/NavResult;", "dest", "Lua/privatbank/core/navigation/NavKey;", "(Lua/privatbank/core/navigation/NavResult;Lua/privatbank/core/navigation/NavKey;)V", "getDest", "()Lua/privatbank/core/navigation/NavKey;", "getResult", "()Lua/privatbank/core/navigation/NavResult;", "core_debug"})
    public static final class BackWithResultTo extends ua.privatbank.core.navigation.NavCommand2 {
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.navigation.NavResult<?> result = null;
        @org.jetbrains.annotations.NotNull()
        private final ua.privatbank.core.navigation.NavKey dest = null;
        
        public BackWithResultTo(@org.jetbrains.annotations.NotNull()
        ua.privatbank.core.navigation.NavResult<?> result, @org.jetbrains.annotations.NotNull()
        ua.privatbank.core.navigation.NavKey dest) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.navigation.NavResult<?> getResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.privatbank.core.navigation.NavKey getDest() {
            return null;
        }
    }
}