package uz.gita.shop_app.ui.screen.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/gita/shop_app/ui/screen/login/LoginModel;", "Luz/gita/shop_app/ui/screen/login/LoginContract$Model;", "Lcafe/adriel/voyager/core/model/ScreenModel;", "repository", "Luz/gita/shop_app/domain/repository/AuthRepository;", "sharedPref", "Luz/gita/shopappexam/data/locale/SharedPref;", "direction", "Luz/gita/shop_app/ui/screen/login/LoginDirection;", "(Luz/gita/shop_app/domain/repository/AuthRepository;Luz/gita/shopappexam/data/locale/SharedPref;Luz/gita/shop_app/ui/screen/login/LoginDirection;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/shop_app/ui/screen/login/LoginContract$UiState;", "Luz/gita/shop_app/ui/screen/login/LoginContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "modelScope", "Lkotlinx/coroutines/CoroutineScope;", "onDispose", "", "onEventDispatcher", "intent", "Luz/gita/shop_app/ui/screen/login/LoginContract$Intent;", "app_debug"})
public final class LoginModel implements uz.gita.shop_app.ui.screen.login.LoginContract.Model, cafe.adriel.voyager.core.model.ScreenModel {
    private final uz.gita.shop_app.domain.repository.AuthRepository repository = null;
    private final uz.gita.shopappexam.data.locale.SharedPref sharedPref = null;
    private final uz.gita.shop_app.ui.screen.login.LoginDirection direction = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.login.LoginContract.UiState, uz.gita.shop_app.ui.screen.login.LoginContract.SideEffect> container = null;
    private final kotlinx.coroutines.CoroutineScope modelScope = null;
    
    @javax.inject.Inject
    public LoginModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.domain.repository.AuthRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.shopappexam.data.locale.SharedPref sharedPref, @org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.login.LoginDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.login.LoginContract.UiState, uz.gita.shop_app.ui.screen.login.LoginContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.login.LoginContract.Intent intent) {
    }
    
    @java.lang.Override
    public void onDispose() {
    }
}