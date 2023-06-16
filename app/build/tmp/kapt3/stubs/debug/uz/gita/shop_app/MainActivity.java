package uz.gita.shop_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Luz/gita/shop_app/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "navigationHandler", "Luz/gita/shop_app/navigation/NavigationHandler;", "getNavigationHandler", "()Luz/gita/shop_app/navigation/NavigationHandler;", "setNavigationHandler", "(Luz/gita/shop_app/navigation/NavigationHandler;)V", "sharedPref", "Luz/gita/shopappexam/data/locale/SharedPref;", "getSharedPref", "()Luz/gita/shopappexam/data/locale/SharedPref;", "setSharedPref", "(Luz/gita/shopappexam/data/locale/SharedPref;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    @javax.inject.Inject
    public uz.gita.shop_app.navigation.NavigationHandler navigationHandler;
    @javax.inject.Inject
    public uz.gita.shopappexam.data.locale.SharedPref sharedPref;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.shop_app.navigation.NavigationHandler getNavigationHandler() {
        return null;
    }
    
    public final void setNavigationHandler(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.navigation.NavigationHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.shopappexam.data.locale.SharedPref getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    uz.gita.shopappexam.data.locale.SharedPref p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}