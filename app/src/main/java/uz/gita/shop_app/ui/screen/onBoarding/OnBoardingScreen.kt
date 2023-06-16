package uz.gita.shop_app.ui.screen.onBoarding

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getScreenModel
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shop_app.utils.myLog

class OnBoardingScreen : AppScreen() {
    @Composable
    override fun Content() {
        val onBoardingModel: OnBoardingContract.Model = getScreenModel<OnBoardingModel>()

        onBoardingModel.collectSideEffect {
            when (it) {
                is OnBoardingContract.SideEffect.HasError -> {
                    myLog(it.message)
                }
            }
        }
        OnBoardingScreenContent(onBoardingModel::onEventDispatcher)
    }

    @Composable
    fun OnBoardingScreenContent(eventDispatcher: (OnBoardingContract.Intent) -> Unit) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { eventDispatcher(OnBoardingContract.Intent.Back) }) {
                        Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                    Text(
                        text = "Profile", modifier = Modifier
                            .padding(end = 8.dp)
                            .align(Alignment.CenterVertically), fontWeight = FontWeight.Bold
                    )
                }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(
                        modifier = Modifier
                            .height(0.dp)
                            .weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = null,
                        modifier = Modifier.size(120.dp)
                    )
                    Button(
                        modifier = Modifier.padding(top = 24.dp),
                        onClick = { eventDispatcher(OnBoardingContract.Intent.OpenLogin) }
                    ) {
                        Text(text = "Sign In")
                    }

                    TextButton(onClick = { eventDispatcher(OnBoardingContract.Intent.OpenSignUp) }) {
                        Text(text = "Create new account")
                    }
                    Spacer(
                        modifier = Modifier
                            .height(0.dp)
                            .weight(0.7f)
                    )
                }
            }
        }
    }

}