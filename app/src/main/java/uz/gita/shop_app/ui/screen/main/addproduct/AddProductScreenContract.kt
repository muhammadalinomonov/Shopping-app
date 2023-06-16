package uz.gita.shop_app.ui.screen.main.addproduct

import org.orbitmvi.orbit.ContainerHost
import uz.gita.shop_app.data.model.ProductData
import uz.gita.shop_app.navigation.AppNavigator
import javax.inject.Inject


interface AddProductScreenContract {

    sealed interface Intent {
        object Back:Intent
        data class AddProduct(val productName:String, val price:String, val description:String, val category:String): Intent
    }

    interface Direction {
        suspend fun back()
    }

    sealed interface UiState {
        object Loading : UiState
        data class Categories(val productData: ProductData): UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }
}

class AddProductDirection @Inject constructor(private val navigator: AppNavigator):AddProductScreenContract.Direction{
    override suspend fun back() {
        navigator.back()
    }

}