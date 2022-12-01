package ua.privatbank.core.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ua.privatbank.core.base.BaseFragment;
import ua.privatbank.core.logger.LoggerFactory;
import kotlin.properties.Delegates;
import kotlin.reflect.KClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"INNER_ENABLE_ANALYTIC", "", "INNER_NAV_KEY_DEEPLINK", "INPUT_DATA_ARG", "INPUT_DATA_JSON_ARG", "core_release"})
public final class NavigationFragmentCoreKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_JSON_ARG = "input_data_json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_ARG = "input_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INNER_ENABLE_ANALYTIC = "inner_nav_router_data_enable_analytic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INNER_NAV_KEY_DEEPLINK = "inner_nav_router_data_nav_key_deeplink";
}