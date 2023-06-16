package uz.gita.shop_app.ui.screen.main.addproduct

import android.util.Log
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.container
import uz.gita.shop_app.data.model.ProductData
import uz.gita.shop_app.domain.repository.ShopRepository
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

class AddProductModel @Inject constructor(
    private val repository: ShopRepository,
    private val sharedPref: SharedPref,
    private val direction: AddProductScreenContract.Direction
) : ScreenModel, AddProductScreenContract.ViewModel {
    private val modelScope = CoroutineScope(Dispatchers.Main + Job())


    override val container =
        coroutineScope.container<AddProductScreenContract.UiState, AddProductScreenContract.SideEffect>(
            AddProductScreenContract.UiState.Loading
        )

    override fun onEventDispatcher(intent: AddProductScreenContract.Intent) {

        when (intent) {
            is AddProductScreenContract.Intent.AddProduct -> {
                repository.addProduct(
                    ProductData(
                        8,
                        sharedPref.email,
                        intent.productName,
                        intent.price,
                        intent.description,
                        intent.category,
                        "data:image/jpeg;base64,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"
                    )
                ).onEach {
                    it.onSuccess {
                        modelScope.launch {
                            direction.back()
                        }
                    }
                    it.onFailure {
                        Log.d("AAA", it.message!!)
                    }
                }.launchIn(modelScope)
            }
        }
    }
}