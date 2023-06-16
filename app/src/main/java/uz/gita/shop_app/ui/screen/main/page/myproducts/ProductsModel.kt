package uz.gita.shop_app.ui.screen.main.page.myproducts

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import uz.gita.shop_app.domain.repository.ShopRepository
import javax.inject.Inject

class ProductsModel @Inject constructor(
    private val repository: ShopRepository,
    private val direction: MyProductDirection
) : ScreenModel,
    MyProductContact.Model {

    private val modelScope = CoroutineScope(Dispatchers.Main + Job())


    override val container =
        coroutineScope.container<MyProductContact.UiState, MyProductContact.SideEffect>(
            MyProductContact.UiState.Loading
        )

    override fun onEventDispatcher(intent: MyProductContact.Intent) {
        when (intent) {
            MyProductContact.Intent.LoadData -> {
                repository.getOwnProducts().onEach {
                    it.onSuccess { categories ->
                        intent {
                            reduce {
                                MyProductContact.UiState.Products(categories)
                            }
                        }
                    }
                    it.onFailure {
                        intent {
                            postSideEffect(MyProductContact.SideEffect.HasError(it.message!!))
                        }
                    }
                }.launchIn(modelScope)
            }

            MyProductContact.Intent.OpenAddProduct -> {
                modelScope.launch {
                    direction.openAddProductScreen()
                }
            }
        }
    }

}