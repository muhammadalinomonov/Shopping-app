package uz.gita.shop_app.ui.screen.signup

import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.ui.screen.main.MainScreen
import javax.inject.Inject

interface SignUpDirection {
    suspend fun openMainScreen()
    suspend fun back()
}

class SignUpDirectionImpl @Inject constructor(
    private val navigator: AppNavigator
) : SignUpDirection {
    override suspend fun openMainScreen() {
        navigator.replace(MainScreen())
    }

    override suspend fun back() {
        navigator.back()
    }


}