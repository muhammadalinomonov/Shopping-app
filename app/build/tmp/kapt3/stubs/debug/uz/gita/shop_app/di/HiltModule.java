package uz.gita.shop_app.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Luz/gita/shop_app/di/HiltModule;", "", "()V", "bindAddProductScreenModel", "Lcafe/adriel/voyager/core/model/ScreenModel;", "onBoardingModel", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductModel;", "bindHiltFirstScreenModel", "Luz/gita/shop_app/ui/screen/firsrscreen/FirstScreenModel;", "bindHiltLoginScreenModel", "loginModel", "Luz/gita/shop_app/ui/screen/login/LoginModel;", "bindHiltOnBoardingScreenModel", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingModel;", "bindHiltShopScreenModel", "Luz/gita/shop_app/ui/screen/main/page/shopscreen/ShopModel;", "bindHiltSignUpScreenModel", "signUpModel", "Luz/gita/shop_app/ui/screen/signup/SignUpModel;", "bindProductScreenModel", "Luz/gita/shop_app/ui/screen/main/page/myproducts/ProductsModel;", "app_debug"})
@dagger.Module
public abstract class HiltModule {
    
    public HiltModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.login.LoginModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindHiltLoginScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.login.LoginModel loginModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.signup.SignUpModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindHiltSignUpScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.signup.SignUpModel signUpModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.onBoarding.OnBoardingModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindHiltOnBoardingScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.onBoarding.OnBoardingModel onBoardingModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindHiltFirstScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenModel onBoardingModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.main.page.shopscreen.ShopModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindHiltShopScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.page.shopscreen.ShopModel onBoardingModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.main.page.myproducts.ProductsModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindProductScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.page.myproducts.ProductsModel onBoardingModel);
    
    @org.jetbrains.annotations.NotNull
    @cafe.adriel.voyager.hilt.ScreenModelKey(value = uz.gita.shop_app.ui.screen.main.addproduct.AddProductModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract cafe.adriel.voyager.core.model.ScreenModel bindAddProductScreenModel(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.addproduct.AddProductModel onBoardingModel);
}