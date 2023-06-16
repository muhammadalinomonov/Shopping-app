package uz.gita.shop_app.ui.screen.main.addproduct;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductModel;", "Lcafe/adriel/voyager/core/model/ScreenModel;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$ViewModel;", "repository", "Luz/gita/shop_app/domain/repository/ShopRepository;", "sharedPref", "Luz/gita/shopappexam/data/locale/SharedPref;", "direction", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Direction;", "(Luz/gita/shop_app/domain/repository/ShopRepository;Luz/gita/shopappexam/data/locale/SharedPref;Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Direction;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "modelScope", "Lkotlinx/coroutines/CoroutineScope;", "onEventDispatcher", "", "intent", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "app_debug"})
public final class AddProductModel implements cafe.adriel.voyager.core.model.ScreenModel, uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.ViewModel {
    private final uz.gita.shop_app.domain.repository.ShopRepository repository = null;
    private final uz.gita.shopappexam.data.locale.SharedPref sharedPref = null;
    private final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Direction direction = null;
    private final kotlinx.coroutines.CoroutineScope modelScope = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState, uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.SideEffect> container = null;
    
    @javax.inject.Inject
    public AddProductModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.domain.repository.ShopRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.shopappexam.data.locale.SharedPref sharedPref, @org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Direction direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState, uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent intent) {
    }
    
    public void onDispose() {
    }
}