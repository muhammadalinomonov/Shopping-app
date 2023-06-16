package uz.gita.shop_app.ui.screen.firsrscreen

import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.ui.screen.onBoarding.OnBoardingScreen
import javax.inject.Inject

interface FirstScreenDirection {
    suspend fun openOnBoardingScreen()
}

class FirstScreenDirectionImpl @Inject constructor(private val navigator: AppNavigator) :
    FirstScreenDirection {
    override suspend fun openOnBoardingScreen() {
        navigator.navigateTo(OnBoardingScreen())
    }
}