package com.mo7ammedtabasi.c_testdeclarartivui

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.mo7ammedtabasi.c_testdeclarartivui.composable.LazyColumnMeals
import com.mo7ammedtabasi.c_testdeclarartivui.screens.CounterScreen
import com.mo7ammedtabasi.c_testdeclarartivui.screens.FoodScreen
import com.mo7ammedtabasi.c_testdeclarartivui.screens.HomeScreen
import com.mo7ammedtabasi.c_testdeclarartivui.screens.ProfileScreen
import com.mo7ammedtabasi.c_testdeclarartivui.screens.TestScreen
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.C_TestDeclarartivUiTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun FoodApp() {
    C_TestDeclarartivUiTheme {
        Scaffold {
//            val navController = rememberNavController()
//            FoodNavGraph(navController = navController)

            FoodScreen()
        }
    }
}