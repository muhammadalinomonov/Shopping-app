package uz.gita.shop_app.ui.screen.signup

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

class SignUpModel @Inject constructor(
    private val repository: AuthRepository,
    private val sharedPref: SharedPref,
    private val direction: SignUpDirection
) : SignUpContract.Model, ScreenModel {
    override val container =
        coroutineScope.container<SignUpContract.UiState, SignUpContract.SideEffect>(SignUpContract.UiState.Default)

    private val modelScope = CoroutineScope(Dispatchers.Main + Job())
    override fun onEventDispatcher(intent: SignUpContract.Intent) {
        when (intent) {
            is SignUpContract.Intent.LoginUser -> {
                repository.createUser(intent.email, intent.password)
                    .onEach {
                        it.onSuccess {
                            sharedPref.email = intent.email
                            sharedPref.hasToken = true
                            direction.openMainScreen()
                        }
                        it.onFailure {
                            intent {
                                postSideEffect(
                                    SignUpContract.SideEffect.HasError(
                                        it.message ?: "Exception occured!"
                                    )
                                )
                            }
                        }
                    }.launchIn(modelScope)
            }

            SignUpContract.Intent.Back -> {
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