package uz.gita.shop_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.shop_app.navigation.NavigationHandler
import uz.gita.shop_app.ui.screen.firsrscreen.FirstScreen
import uz.gita.shop_app.ui.screen.main.MainScreen
import uz.gita.shop_app.ui.theme.ShopAppTheme
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var navigationHandler: NavigationHandler
    @Inject
    lateinit var sharedPref:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShopAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val screen = if (sharedPref.hasToken)  MainScreen() else FirstScreen()
                    Navigator(screen = screen) { navigator ->
                        LaunchedEffect(navigator) {
                            navigationHandler.navigationStack
                                .onEach { it.invoke(navigator) }
                                .launchIn(lifecycleScope)
                        }
                        CurrentScreen()
                    }
                }
            }
        }
    }
}

