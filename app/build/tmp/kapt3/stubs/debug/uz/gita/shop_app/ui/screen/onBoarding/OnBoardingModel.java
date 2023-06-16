package uz.gita.shop_app.ui.screen.onBoarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingModel;", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingContract$Model;", "Lcafe/adriel/voyager/core/model/ScreenModel;", "direction", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingDirection;", "(Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingDirection;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingContract$UiState;", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "modelScope", "Lkotlinx/coroutines/CoroutineScope;", "onEventDispatcher", "", "intent", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingContract$Intent;", "app_debug"})
public final class OnBoardingModel implements uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.Model, cafe.adriel.voyager.core.model.ScreenModel {
    private final uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirection direction = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.UiState, uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.SideEffect> container = null;
    private final kotlinx.coroutines.CoroutineScope modelScope = null;
    
    @javax.inject.Inject
    public OnBoardingModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.UiState, uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.onBoarding.OnBoardingContract.Intent intent) {
    }
    
    public void onDispose() {
    }
}