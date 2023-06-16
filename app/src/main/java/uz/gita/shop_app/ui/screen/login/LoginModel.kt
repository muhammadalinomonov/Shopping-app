package uz.gita.shop_app.ui.screen.login

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import uz.gita.shop_app.domain.repository.AuthRepository
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

class LoginModel @Inject constructor(
    private val repository: AuthRepository,
    private val sharedPref:SharedPref,
    private val direction: LoginDirection
) : LoginContract.Model, ScreenModel {
    override val container =
        coroutineScope.container<LoginContract.UiState, LoginContract.SideEffect>(LoginContract.UiState.Default)

    private val modelScope = CoroutineScope(Dispatchers.Main + Job())
    override fun onEventDispatcher(intent: LoginContract.Intent) {
        when (intent) {
            is LoginContract.Intent.LoginUser -> {
                repository.login(intent.email, intent.password)
                    .onEach {
                        it.onSuccess {
                            sharedPref.email = intent.email
                            sharedPref.hasToken = true
                            direction.openMainScreen()
                        }
                        it.onFailure {
                            intent {
                                postSideEffect(
                                    LoginContract.SideEffect.HasError(
                                        it.message ?: "Exception occured!"
                                    )
                                )
                            }
                        }
                    }.launchIn(modelScope)
            }

            LoginContract.Intent.Back -> {
                modelScope.launch {
                    direction.back()
                }
            }
        }
    }

    override fun onDispose() {
        super.onDispose()
        modelScope.cancel()
    }
}