package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun HelloView(name : String){
    Text(text = "Hello $name")
}