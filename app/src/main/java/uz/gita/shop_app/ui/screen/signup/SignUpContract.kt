package uz.gita.shop_app.ui.screen.signup

import org.orbitmvi.orbit.ContainerHost

interface SignUpContract {
    sealed interface Intent {
        data class LoginUser(val email: String, val password: String) : Intent
        object Back : Intent
    }

    sealed interface UiState {
        object Default : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface Model : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

}