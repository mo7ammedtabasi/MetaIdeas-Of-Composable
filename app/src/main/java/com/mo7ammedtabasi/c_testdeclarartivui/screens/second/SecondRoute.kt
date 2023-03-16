package com.mo7ammedtabasi.c_testdeclarartivui.screens.second

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

private const val ROUTE = "SecondScreen"

fun NavController.navigateToSecond(name:String){
    navigate("$ROUTE/$name")
}
fun NavGraphBuilder.secondRoute(navController: NavController){

    composable(
        "$ROUTE/{${SecondArgs.NAME_ARG}}",
        arguments = listOf(
//                        navArgument("id") { NavType.IntType },
            navArgument(SecondArgs.NAME_ARG) { NavType.StringType },
        )
    ) { SecondScreens(navController) }

}

class SecondArgs(savedStateHandle: SavedStateHandle){
    val name : String = checkNotNull(savedStateHandle[NAME_ARG])

    companion object{
        const val NAME_ARG = "name"
    }
}