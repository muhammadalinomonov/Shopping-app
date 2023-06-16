package uz.gita.shop_app.ui.screen.login

import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.ui.screen.main.MainScreen
import javax.inject.Inject

interface LoginDirection {
    suspend fun openMainScreen()
    suspend fun back()
}

class LoginDirectionImpl @Inject constructor(
    private val navigator: AppNavigator
) : LoginDirection {
    override suspend fun openMainScreen() {
      navigator.replace(MainScreen())
    }

    override suspend fun back() {
        navigator.back()
    }


}