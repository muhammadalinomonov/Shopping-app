package uz.gita.shop_app.ui.screen.main.addproduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getScreenModel
import uz.gita.shop_app.R
import uz.gita.shop_app.data.model.ProductData
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

class AddProductScreen : AppScreen() {
    @Composable
    override fun Content() {
        val screenModel = getScreenModel<AddProductModel>()
        AddScreenContent(screenModel)
    }

    @Inject
    lateinit var sharedPref: SharedPref
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AddScreenContent(screenModel: AddProductModel) {

        var productName by remember { mutableStateOf("") }
        var price by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }
        var category by remember { mutableStateOf("") }

        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                    Text(text = "Add product")
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                }

                Text(text = "Name", modifier = Modifier.padding(top = 12.dp, start = 8.dp))
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = productName,
                    onValueChange = {
                        productName = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "e.g.  Converse", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                )

                Text(text = "Price", modifier = Modifier.padding(top = 18.dp, start = 8.dp))
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = price,
                    onValueChange = {
                        price = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "e.g.  Converse", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                )

                Text(text = "Description", modifier = Modifier.padding(top = 18.dp, start = 8.dp))
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(top = 8.dp),
                    value = description,
                    onValueChange = {
                        description = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "e.g.  Converse", color = Color.Gray) },
                    shape = RoundedCornerShape(16.dp),
                )

                Text(
                    text = "Category",
                    modifier = Modifier.padding(top = 28.dp, start = 8.dp),
                    fontWeight = FontWeight.Bold
                )

                LazyRow {
                   items(categoryList()) {
                        Button(onClick = { category = it}, modifier = Modifier.padding(horizontal = 4.dp)) {
                            Text(text = it)
                        }
                    }
                }

                Spacer(
                    modifier = Modifier
                        .height(0.dp)
                        .weight(1f)
                )
                Button(
                    onClick = {
                        screenModel.onEventDispatcher(
                            AddProductScreenContract.Intent.AddProduct(productName, price, description, category))
                    }, modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 12.dp)
                ) {
                    Text(text = "Add to bag")
                }
            }
        }
    }

    @Preview
    @Composable
    fun TTTT() {

    }
}
private fun categoryList(): List<String> {
    val list = arrayListOf<String>()
    list.add("Airmax")
    list.add("Maxi BOX")
    return list
}