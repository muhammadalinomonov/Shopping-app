package uz.gita.shop_app.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Luz/gita/shop_app/di/DirectionModule;", "", "addProductsDirection", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Direction;", "impl", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductDirection;", "firstScreenDirection", "Luz/gita/shop_app/ui/screen/firsrscreen/FirstScreenDirection;", "Luz/gita/shop_app/ui/screen/firsrscreen/FirstScreenDirectionImpl;", "loginDirection", "Luz/gita/shop_app/ui/screen/login/LoginDirection;", "Luz/gita/shop_app/ui/screen/login/LoginDirectionImpl;", "myProductsDirection", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductDirection;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductDirectionImpl;", "onBoardingDirection", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingDirection;", "Luz/gita/shop_app/ui/screen/onBoarding/OnBoardingDirectionImpl;", "signUpDirection", "Luz/gita/shop_app/ui/screen/signup/SignUpDirection;", "Luz/gita/shop_app/ui/screen/signup/SignUpDirectionImpl;", "app_debug"})
@dagger.Module
public abstract interface DirectionModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenDirection firstScreenDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirection onBoardingDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.login.LoginDirection loginDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.login.LoginDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.signup.SignUpDirection signUpDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.signup.SignUpDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirection myProductsDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Direction addProductsDirection(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.ui.screen.main.addproduct.AddProductDirection impl);
}