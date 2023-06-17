package uz.gita.shop_app.ui.screen.main.addproduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Add
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
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import cafe.adriel.voyager.hilt.getScreenModel
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

class AddProductScreen : AppScreen() {

    @Composable
    override fun Content() {
        val screenModel = getScreenModel<AddProductModel>()
        val uiState = screenModel.collectAsState()
        AddScreenContent(uiState, screenModel::onEventDispatcher)
    }

    @Inject
    lateinit var sharedPref: SharedPref



    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AddScreenContent(
        uiState: State<AddProductScreenContract.UiState>,
        onEventDispatcher: (AddProductScreenContract.Intent) -> Unit
    ) {

        onEventDispatcher(AddProductScreenContract.Intent.LoadCategories)

        when(uiState.value){
            is AddProductScreenContract.UiState.Categories -> {

                var productName by remember { mutableStateOf("") }
                var price by remember { mutableStateOf("") }
                var description by remember { mutableStateOf("") }
                var category by remember { mutableStateOf("") }
                var categoryByDialog by remember { mutableStateOf("") }
                var categoryState by remember { mutableStateOf(category.isNotEmpty()) }
                var stateDialog by remember { mutableStateOf(false) }
                var list by remember { mutableStateOf((uiState.value as AddProductScreenContract.UiState.Categories).list) }
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
                            IconButton(onClick = { onEventDispatcher(AddProductScreenContract.Intent.Back) }) {
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

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Category",
                                modifier = Modifier.padding(top = 28.dp, start = 8.dp),
                                fontWeight = FontWeight.Bold
                            )
                            IconButton(onClick = {
                                stateDialog = true
                            }) {
                                Icon(imageVector = Icons.Default.Add, contentDescription = null)
                            }
                        }



                        LazyRow {

                            items(list) {
                                Button(
                                    onClick = {
                                        categoryState = true
                                        category = it
                                    },
                                    modifier = Modifier.padding(horizontal = 4.dp), enabled = category != it
                                ) {
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
                                onEventDispatcher(
                                    AddProductScreenContract.Intent.AddProduct(
                                        productName,
                                        price,
                                        description,
                                        category
                                    )
                                )
                            }, modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(bottom = 12.dp),
                            enabled = categoryState
                        ) {
                            Text(text = "Add to bag")
                        }
                        if (stateDialog) {
                            Dialog(onDismissRequest = { stateDialog = false }) {
                                Column (modifier = Modifier
                                    .background(Color.White)
                                    .padding(8.dp)){
                                    TextField(value = categoryByDialog, onValueChange = {
                                        categoryByDialog = it
                                    })
                                    Spacer(modifier = Modifier.height(24.dp))
                                    Button(onClick = {
                                        categoryState = true
                                        if (!(uiState.value as AddProductScreenContract.UiState.Categories).list.contains(categoryByDialog)){
                                            category = categoryByDialog
                                            onEventDispatcher(AddProductScreenContract.Intent.AddCategory(categoryByDialog))
                                        }
                                        stateDialog = false
                                    }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                                        Text(text = "Add category")
                                    }
                                }
                            }
                        }
                    }


                }
            }
            AddProductScreenContract.UiState.Loading -> {

            }
        }



    }


}

