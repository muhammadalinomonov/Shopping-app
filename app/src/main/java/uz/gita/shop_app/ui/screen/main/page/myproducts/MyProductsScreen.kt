package uz.gita.shop_app.ui.screen.main.page.myproducts

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getScreenModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shop_app.ui.component.MyProduct

class MyProductsScreen : AppScreen(), Tab {

    override val options: TabOptions
        @Composable
        get() {
            val title = "My Products"
            val icon = painterResource(id = R.drawable.basket)
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

        val model: MyProductContact.Model = getScreenModel<ProductsModel>()

        val uiState = model.collectAsState().value
        val context = LocalContext.current
        model.collectSideEffect {
            when (it) {
                is MyProductContact.SideEffect.HasError -> {
                    Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        MyProductContent(uiState, model::onEventDispatcher)

    }

    @Composable
    fun MyProductContent(uiState: MyProductContact.UiState, onEventDispatcher: (MyProductContact.Intent) -> Unit) {

        onEventDispatcher(MyProductContact.Intent.LoadData)
        Log.d("TTT", "MyProductContent")
        when(uiState){
            MyProductContact.UiState.Loading -> {

            }
            is MyProductContact.UiState.Products -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "My Product",
                                modifier = Modifier.align(Alignment.Center),
                                fontSize = 30.sp
                            )
                        }

                        LazyColumn {
                            items(uiState.list){
                                MyProduct(it)
                            }
                        }
                    }

                    Button(
                        onClick = { onEventDispatcher(MyProductContact.Intent.OpenAddProduct) },
                        Modifier
                            .align(Alignment.BottomCenter)
                            .padding(10.dp)
                    ) {
                        Text(text = "Add Product")
                    }
                }
            }
        }
    }
}
