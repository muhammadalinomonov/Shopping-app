package uz.gita.shop_app.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenDirection
import uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenDirectionImpl
import uz.gita.shop_app.ui.screen.login.LoginDirection
import uz.gita.shop_app.ui.screen.login.LoginDirectionImpl
import uz.gita.shop_app.ui.screen.main.addproduct.AddProductDirection
import uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract
import uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirection
import uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductDirectionImpl
import uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirection
import uz.gita.shop_app.ui.screen.onBoarding.OnBoardingDirectionImpl
import uz.gita.shop_app.ui.screen.signup.SignUpDirection
import uz.gita.shop_app.ui.screen.signup.SignUpDirectionImpl

@Module
@InstallIn(ActivityComponent::class)
interface DirectionModule {

    @Binds
    fun firstScreenDirection(impl: FirstScreenDirectionImpl): FirstScreenDirection

    @Binds
    fun onBoardingDirection(impl: OnBoardingDirectionImpl): OnBoardingDirection


    @Binds
    fun loginDirection(impl: LoginDirectionImpl): LoginDirection


    @Binds
    fun signUpDirection(impl: SignUpDirectionImpl): SignUpDirection

    @Binds
    fun myProductsDirection(impl: MyProductDirectionImpl): MyProductDirection

    @Binds
    fun addProductsDirection(impl: AddProductDirection): AddProductScreenContract.Direction


}
