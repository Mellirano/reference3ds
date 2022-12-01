package ua.privatbank.core.network;

import io.reactivex.Single;
import ua.privatbank.core.BuildConfig;
import ua.privatbank.core.logger.LoggerFactory;
import ua.privatbank.core.network.defaults.DefaultConfiguration;
import ua.privatbank.core.network.errors.HttpException;
import ua.privatbank.core.network.helpers.*;
import ua.privatbank.core.network.interceptors.GzipDecompressInterceptor;
import ua.privatbank.core.network.interceptors.HttpLoggingInterceptor;
import ua.privatbank.core.network.interceptors.LevelDef;
import java.lang.reflect.Type;
import javax.net.ssl.SSLSocketFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005\u001a0\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\n"}, d2 = {"networkConfiguration", "Lua/privatbank/core/network/NetworkConfiguration;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "forEachOnCopy", "T", "", "action", "core_release"})
public final class OkhttpNetworkConfigurationKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final ua.privatbank.core.network.NetworkConfiguration networkConfiguration(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.privatbank.core.network.NetworkConfiguration, kotlin.Unit> init) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void forEachOnCopy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> $this$forEachOnCopy, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
}