package com.mo7ammedtabasi.c_testdeclarartivui.screens.first

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
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
import com.mo7ammedtabasi.c_testdeclarartivui.screens.second.navigateToSecond
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.FirstViewModel

@Composable
fun FirstScreens(
    navController: NavController,
    viewModel: FirstViewModel = hiltViewModel()
) {

    val state by  viewModel.state.collectAsState()
    FirstContent(
        state = state,
        onClickNext = { name ->
            navController.navigateToSecond(name) },
        onChangeName = viewModel::onChangeName
    )
}

@Composable
fun FirstContent(
    state : String,
    onClickNext: (String) -> Unit,
    onChangeName: (String)->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "First Screen", fontSize = 32.sp)
        TextField(value = state, onValueChange = onChangeName)
        Button(onClick = {onClickNext(state)}) {
            Text(text = "Next")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreViewFirstScreen() {
    FirstContent(state = "", onClickNext = {}, onChangeName = {} )
}
