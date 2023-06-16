package uz.gita.shop_app.ui.screen.onBoarding

import org.orbitmvi.orbit.ContainerHost

interface OnBoardingContract {
    sealed interface Intent {
        object OpenLogin : Intent
        object OpenSignUp : Intent
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