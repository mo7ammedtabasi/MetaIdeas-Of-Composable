package com.mo7ammedtabasi.c_testdeclarartivui

sealed class Screen(val route:String){
    object FirstScreen : Screen("FirstScreen")
    object SecondScreen : Screen("SecondScreen")
    object ThirdScreen : Screen("ThirdScreen")
}
