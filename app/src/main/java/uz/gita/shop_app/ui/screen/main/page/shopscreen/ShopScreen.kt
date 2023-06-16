package uz.gita.shop_app.ui.screen.main.page.shopscreen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.hilt.getScreenModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shop_app.ui.component.CustomSearchView
import uz.gita.shop_app.ui.component.ShoppingItem

class ShopScreen : AppScreen(), Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Shop Screen"
            val icon = painterResource(id = R.drawable.catalog)
            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        val model: ShopContract.Model = getScreenModel<ShopModel>()

        val uiState = model.collectAsState().value
        val context = LocalContext.current
        model.collectSideEffect {
            when (it) {
                is ShopContract.SideEffect.HasError -> {
                    Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        HomePageContent(uiState, model::onEventDispatcher)
    }

    @Composable
    fun HomePageContent(
        uiState: ShopContract.UiState,
        onEventDispatcher: (ShopContract.Intent) -> Unit
    ) {

        onEventDispatcher(ShopContract.Intent.LoadData)

        var search by remember { mutableStateOf("") }

        when(uiState) {
            is ShopContract.UiState.Categories -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFFFFFFF))
                ) {
                    Column {

                        CustomSearchView(search = search, onValueChange = {
                            search = it
                        })

                        LazyColumn {
                            items(uiState.list) {
                                Log.d("RRR","${uiState.list}")
                                ShoppingItem(
                                    categoryName = it.name,
                                    menuIcon = R.drawable.ic_menu,
                                    shoppingList = it.items
                                )
                            }
                        }
                    }
                }
            }
            ShopContract.UiState.Loading -> {

            }
            ShopContract.UiState.PreparedData -> {

            }
        }
    }

}