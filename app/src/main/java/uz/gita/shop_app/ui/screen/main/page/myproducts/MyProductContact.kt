package uz.gita.shop_app.ui.screen.main.page.myproducts

import org.orbitmvi.orbit.ContainerHost
import uz.gita.shop_app.data.model.ProductData

interface MyProductContact {
    sealed interface Intent {
        object OpenAddProduct:Intent
        object LoadData : Intent
    }

    sealed interface UiState {
        object Loading : UiState
        data class Products(val list: List<ProductData>) : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface Model : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }
}