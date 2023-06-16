package uz.gita.shop_app.ui.screen.firsrscreen

import cafe.adriel.voyager.core.model.ScreenModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class FirstScreenModel @Inject constructor(private val direction: FirstScreenDirection) :
    ScreenModel {
    private val modelScope = CoroutineScope(Dispatchers.Main + Job())
    fun openOnBoarding(){
        modelScope.launch {
            direction.openOnBoardingScreen()
        }
    }

}