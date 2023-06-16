package uz.gita.shop_app.ui.screen.main.page.shopscreen

import android.util.Log
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import uz.gita.shop_app.domain.repository.ShopRepository
import uz.gita.shop_app.utils.myLog
import javax.inject.Inject

class ShopModel @Inject constructor(private val repository: ShopRepository) : ScreenModel,
    ShopContract.Model {

    private val modelScope = CoroutineScope(Dispatchers.Main + Job())




    override val container =
        coroutineScope.container<ShopContract.UiState, ShopContract.SideEffect>(ShopContract.UiState.Loading)

    override fun onEventDispatcher(intent: ShopContract.Intent) {
        when (intent) {
            ShopContract.Intent.LoadData -> {
                repository.getAllProducts().onEach {
                    it.onSuccess { categories ->
                        intent {
                            reduce {
                                categories.forEach { category ->
                                    category.items.forEach { productData ->
                                        myLog(productData.toString())
                                    }
                                }
                                ShopContract.UiState.Categories(categories)
                            }
                        }
                    }
                    it.onFailure {
                        intent {
                            postSideEffect(ShopContract.SideEffect.HasError(it.message!!))
                        }
                    }
                }.launchIn(modelScope)


                repository.getOwnProducts().onEach {
                    it.onSuccess {
                            Log.d("III", it.toString())
                    }
                    it.onFailure {
                        Log.d("III", it.message!!)
                    }
                }.launchIn(modelScope)
            }
        }
    }

}