package uz.gita.shop_app.ui.screen.main.page.shopscreen

import org.orbitmvi.orbit.ContainerHost
import uz.gita.shop_app.data.model.CategoryData

interface ShopContract {
    sealed interface Intent {
        data class LoadData(val name:String) : Intent
    }

    sealed interface UiState {
        object Loading : UiState
        object PreparedData : UiState
        data class Categories(val list: List<CategoryData>):UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface Model : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }
}