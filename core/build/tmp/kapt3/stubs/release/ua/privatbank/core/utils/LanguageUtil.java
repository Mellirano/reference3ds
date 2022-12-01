package ua.privatbank.core.utils;

import android.content.Context;
import android.content.res.Configuration;
import ua.privatbank.core.logger.LoggerFactory;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004JE\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004J\n\u0010\u0013\u001a\u00020\u0014*\u00020\bJ\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0015\u00a8\u0006\u0017"}, d2 = {"Lua/privatbank/core/utils/LanguageUtil;", "", "()V", "getAppLanguage", "", "savedLanguage", "getCurrentLanguage", "context", "Landroid/content/Context;", "getDefaultLanguageFromLocale", "setAppLanguage", "selectedLanguage", "updateLanguage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "language", "", "updateResources", "firstLocale", "Ljava/util/Locale;", "Landroid/content/res/Configuration;", "Locales", "core_release"})
public final class LanguageUtil {
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.utils.LanguageUtil INSTANCE = null;
    
    private LanguageUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String savedLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String savedLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context setAppLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String savedLanguage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> updateLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context updateResources(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultLanguageFromLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale firstLocale(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration $this$firstLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale firstLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$firstLocale) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lua/privatbank/core/utils/LanguageUtil$Locales;", "", "()V", "EN", "", "RU", "UA", "core_release"})
    public static final class Locales {
        @org.jetbrains.annotations.NotNull()
        public static final ua.privatbank.core.utils.LanguageUtil.Locales INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RU = "ru";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UA = "uk";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EN = "en";
        
        private Locales() {
            super();
        }
    }
}