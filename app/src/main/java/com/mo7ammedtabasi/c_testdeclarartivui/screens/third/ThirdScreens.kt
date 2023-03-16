package com.mo7ammedtabasi.c_testdeclarartivui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mo7ammedtabasi.c_testdeclarartivui.Screen
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.ThirdViewModel

@Composable
fun ThirdScreens(
    navController: NavController,
    viewModel: ThirdViewModel = hiltViewModel()
) {

    ThirdContent(
        onClick = {navController.navigateUp()}
//        onClick = {navController.popBackStack(Screen.SecondScreen.route, inclusive = false)}
    )
}

@Composable
fun ThirdContent(
    onClick:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Third Screen", fontSize = 32.sp)
        Button(onClick = onClick) {
            Text(text = "Back")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreViewThirdScreen() {
    ThirdContent(
        onClick = {}
    )
}
