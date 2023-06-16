package uz.gita.shop_app.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import uz.gita.shop_app.R
import uz.gita.shop_app.data.model.ProductData

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun MyProduct(productData: ProductData) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GlideImage(
                modifier = Modifier.clip(RoundedCornerShape(10.dp)).size(120.dp),
                model = productData.imageUrl,
                contentDescription = ""
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(text = productData.name)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = productData.description)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = productData.price)
            }

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "-")
            }

            Text(text = "1")

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "+")
            }
        }
    }
}