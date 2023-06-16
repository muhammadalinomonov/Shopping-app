package uz.gita.shop_app.ui.screen.firsrscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getScreenModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import uz.gita.shop_app.R
import uz.gita.shop_app.navigation.AppNavigator
import uz.gita.shop_app.navigation.AppScreen
import uz.gita.shop_app.ui.screen.onBoarding.OnBoardingScreen
import javax.inject.Inject

class FirstScreen : AppScreen() {

    @Composable
    override fun Content() {

        FirstScreenContent(getScreenModel<FirstScreenModel>())
    }

    @Composable
    fun FirstScreenContent(screenModel:FirstScreenModel) {

        Surface(modifier = Modifier.fillMaxSize()) {
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
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = null,
                    modifier = Modifier
                        .height(120.dp)
                        .width(120.dp)
                )


                Text(
                    text = "Lorem ipsum dolor sit, consectetur",
                    modifier = Modifier.padding(horizontal = 12.dp),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur  adipiscin adipiscing elit.",
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 12.dp),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )

                Button(
                    modifier = Modifier.padding(top = 24.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    onClick = {
                        screenModel.openOnBoarding()
                    }
                ) {
                    Text(text = "Start")
                }

                Spacer(
                    modifier = Modifier
                        .height(0.dp)
                        .weight(0.5f)
                )
            }

        }
    }
}

