package uz.gita.shop_app.ui.screen.onBoarding

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.container
import javax.inject.Inject

class OnBoardingModel @Inject constructor(private val direction: OnBoardingDirection) :
    OnBoardingContract.Model, ScreenModel {
    override val container =
        coroutineScope.container<OnBoardingContract.UiState, OnBoardingContract.SideEffect>(
            OnBoardingContract.UiState.Default
        )

    private val modelScope = CoroutineScope(Dispatchers.Main + Job())

    override fun onEventDispatcher(intent: OnBoardingContract.Intent) {
        when (intent) {
            OnBoardingContract.Intent.OpenLogin -> {
                modelScope.launch {
                    direction.openLoginScreen()
                }
            }

            OnBoardingContract.Intent.OpenSignUp -> {
                modelScope.launch {
                    direction.openSignUpScreen()
                }
            }

            OnBoardingContract.Intent.Back -> {
                modelScope.launch {
                    direction.back()
                }
            }
        }
    }
}