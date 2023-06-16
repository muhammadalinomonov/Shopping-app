package uz.gita.shop_app.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import uz.gita.shop_app.data.model.ProductData

@Composable
fun ShoppingItem(
    categoryName: String,
    menuIcon: Int,
    shoppingList:  List<ProductData>
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(modifier = Modifier.padding(5.dp)) {
            Text(text = categoryName, modifier = Modifier.weight(1f))
            Image(painter = painterResource(id = menuIcon), contentDescription = "")
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow {
            items(shoppingList) {
                InnerItem(image = it.imageUrl, price = it.price, name = it.name)
            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun InnerItem(
    image: String,
    price: String,
    name: String
) {
    Card(modifier = Modifier.background(Color.White).padding(horizontal = 8.dp)) {
        Column(Modifier.padding(5.dp)) {

            GlideImage(modifier = Modifier.size(150.dp),model = image, contentDescription = "")

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = price)

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = name)
        }
    }
}

data class ShoppingListData(
    val image: Int,
    val price: String,
    val name: String
)