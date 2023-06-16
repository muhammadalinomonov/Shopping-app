package uz.gita.shop_app.di

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.hilt.ScreenModelKey
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.IntoMap
import uz.gita.shop_app.ui.screen.firsrscreen.FirstScreenModel
import uz.gita.shop_app.ui.screen.login.LoginModel
import uz.gita.shop_app.ui.screen.main.addproduct.AddProductModel
import uz.gita.shop_app.ui.screen.main.page.myproducts.ProductsModel
import uz.gita.shop_app.ui.screen.main.page.shopscreen.ShopModel
import uz.gita.shop_app.ui.screen.onBoarding.OnBoardingModel
import uz.gita.shop_app.ui.screen.signup.SignUpModel

/*
@Module
@InstallIn(ActivityComponent::class) // Must be ActivityComponent at most. See https://dagger.dev/hilt/components
abstract class HiltModule {
    @Binds
    @IntoMap
    @ScreenModelKey(HiltListScreenModel::class) // A key to identify this instance on Multibinding Map
    abstract fun bindHiltListScreenModel(hiltListScreenModel: HiltListScreenModel): ScreenModel

    // Below is a version to have support to assisted injection because there is no support  by default. See https://github.com/google/dagger/issues/2287
    @Binds
    @IntoMap
    @ScreenModelFactoryKey(HiltDetailsScreenModel.Factory::class)
    abstract fun bindHiltDetailsScreenModelFactory(
        hiltDetailsScreenModelFactory: HiltDetailsScreenModel.Factory
    ): ScreenModelFactory
}
* */
@Module
@InstallIn(ActivityComponent::class)
abstract class HiltModule {

    @Binds
    @IntoMap
    @ScreenModelKey(LoginModel::class)
    abstract fun bindHiltLoginScreenModel(loginModel: LoginModel): ScreenModel


    @Binds
    @IntoMap
    @ScreenModelKey(SignUpModel::class)
    abstract fun bindHiltSignUpScreenModel(signUpModel: SignUpModel): ScreenModel


    @Binds
    @IntoMap
    @ScreenModelKey(OnBoardingModel::class)
    abstract fun bindHiltOnBoardingScreenModel(onBoardingModel: OnBoardingModel): ScreenModel

    @Binds
    @IntoMap
    @ScreenModelKey(FirstScreenModel::class)
    abstract fun bindHiltFirstScreenModel(onBoardingModel: FirstScreenModel): ScreenModel

    @Binds
    @IntoMap
    @ScreenModelKey(ShopModel::class)
    abstract fun bindHiltShopScreenModel(onBoardingModel: ShopModel): ScreenModel

    @Binds
    @IntoMap
    @ScreenModelKey(ProductsModel::class)
    abstract fun bindProductScreenModel(onBoardingModel: ProductsModel): ScreenModel

    @Binds
    @IntoMap
    @ScreenModelKey(AddProductModel::class)
    abstract fun bindAddProductScreenModel(onBoardingModel: AddProductModel): ScreenModel


}


