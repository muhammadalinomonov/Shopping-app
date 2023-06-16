package uz.gita.shop_app.ui.screen.onBoarding

import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.ui.screen.login.LoginScreen
import uz.gita.shop_app.ui.screen.signup.SignUpScreen
import javax.inject.Inject

interface OnBoardingDirection {
    suspend fun openLoginScreen()
    suspend fun openSignUpScreen()
    suspend fun back()
}

class OnBoardingDirectionImpl @Inject constructor(
    private val navigator: AppNavigator
) : OnBoardingDirection {
    override suspend fun openLoginScreen() {
        navigator.navigateTo(LoginScreen())
    }

    override suspend fun openSignUpScreen() {
        navigator.navigateTo(SignUpScreen())
    }

    override suspend fun back() {
        navigator.back()
    }

}