package uz.gita.shop_app.ui.screen.main.page.myproducts

import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreen
import javax.inject.Inject

interface MyProductDirection {
    suspend fun openAddProductScreen()
}

class MyProductDirectionImpl @Inject constructor(private val navigator: AppNavigator) :
    MyProductDirection {
    override suspend fun openAddProductScreen() {
        navigator.navigateTo(AddProductScreen())
    }
}