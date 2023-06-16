package uz.gita.shop_app.ui.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getScreenModel
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shop_app.utils.myLog
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

class LoginScreen : AppScreen() {

    @Composable
    override fun Content() {
        val screenModel: LoginContract.Model = getScreenModel<LoginModel>()


        screenModel.collectSideEffect {
            when (it) {
                is LoginContract.SideEffect.HasError -> {
                    myLog(it.message)
                }
            }
        }
        LoginContent(screenModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginContent(eventDispatcher: (LoginContract.Intent) -> Unit) {
        var emailInput by remember { mutableStateOf("") }
        var passwordInput by remember { mutableStateOf("") }
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { eventDispatcher(LoginContract.Intent.Back) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        modifier = Modifier.size(44.dp),
                        contentDescription = null
                    )
                }
                Text(text = "Login", style = MaterialTheme.typography.displayMedium)
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = "Email",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, bottom = 4.dp)
                )
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = emailInput,
                    onValueChange = {
                        emailInput = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "examle.user@gmail.com", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = null)
                    }
                )

                Spacer(modifier = Modifier.padding(8.dp))


                Text(
                    text = "Password",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, bottom = 4.dp)
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = passwordInput,
                    onValueChange = {
                        passwordInput = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "your password here", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                    }
                )
                Spacer(modifier = Modifier
                    .height(0.dp)
                    .weight(1f))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 56.dp)
                        .padding(bottom = 12.dp),
                    onClick = {
                        eventDispatcher(LoginContract.Intent.LoginUser(emailInput, passwordInput))
                    }) {
                    Text(text = "Sign in")
                }
            }
        }
    }
}