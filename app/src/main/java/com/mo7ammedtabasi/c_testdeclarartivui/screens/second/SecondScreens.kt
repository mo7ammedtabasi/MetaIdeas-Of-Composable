package com.mo7ammedtabasi.c_testdeclarartivui.screens.second

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mo7ammedtabasi.c_testdeclarartivui.Screen
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.SecondViewModel

@Composable
fun SecondScreens(
    navController: NavController,
    viewModel: SecondViewModel = hiltViewModel()
) {

    val state by viewModel.state.collectAsState()
    SecondContent(
        state = state,
        onClick = { navController.navigate(Screen.ThirdScreen.route) }
    )
}

@Composable
fun SecondContent(
    state:String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Second Screen", fontSize = 32.sp)
        Text(text = state, fontSize = 32.sp)
        Button(onClick = onClick) {
            Text(text = "Next")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreViewSecondScreen() {
    SecondContent(state = "", onClick = {})
}
