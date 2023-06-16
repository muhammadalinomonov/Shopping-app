package uz.gita.shop_app.ui.screen.main.page.myproducts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/ProductsModel;", "Lcafe/adriel/voyager/core/model/ScreenModel;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Model;", "repository", "Luz/gita/shop_app/domain/repository/ShopRepository;", "direction", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductDirection;", "(Luz/gita/shop_app/domain/repository/ShopRepository;Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductDirection;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "modelScope", "Lkotlinx/coroutines/CoroutineScope;", "onEventDispatcher", "", "intent", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent;", "app_debug"})
public final class ProductsModel implements cafe.adriel.voyager.core.model.ScreenModel, uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Model {
    private final uz.gita.shop_app.domain.repository.ShopRepository repository = null;
    private final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirection direction = null;
    private final kotlinx.coroutines.CoroutineScope modelScope = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState, uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.SideEffect> container = null;
    
    @javax.inject.Inject
    public ProductsModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.domain.repository.ShopRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState, uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent intent) {
    }
    
    public void onDispose() {
    }
}