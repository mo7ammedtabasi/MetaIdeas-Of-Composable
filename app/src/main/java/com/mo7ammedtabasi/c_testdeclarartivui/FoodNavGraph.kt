package com.mo7ammedtabasi.c_testdeclarartivui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mo7ammedtabasi.c_testdeclarartivui.screens.first.FirstScreens
import com.mo7ammedtabasi.c_testdeclarartivui.screens.ThirdScreens
import com.mo7ammedtabasi.c_testdeclarartivui.screens.second.secondRoute


@Composable
fun FoodNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "FirstScreen") {
        composable(Screen.FirstScreen.route) { FirstScreens(navController) }
        secondRoute(navController)
        composable(Screen.ThirdScreen.route) { ThirdScreens(navController) }
    }
}