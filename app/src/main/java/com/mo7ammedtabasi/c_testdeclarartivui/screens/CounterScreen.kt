package com.mo7ammedtabasi.c_testdeclarartivui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.composable.SpacerHorizontal16
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.CounterViewModel

// State Hoisting
@Composable
fun CounterScreen(
    viewModel: CounterViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    CounterContent(
        counter = state.toString(),
        onClickMinus = viewModel::onDecreaseCounter,
        onClickPlus = viewModel::onIncreaseCounter
    )
}

@Composable
private fun CounterContent(
    counter: String,
    onClickPlus: () -> Unit,
    onClickMinus: () -> Unit,
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = counter.toString(),
                fontSize = 96.sp
            )
            Row {
                Button(onClick = onClickMinus) {
                    Text(text = "-", fontSize = 48.sp)
                }
                SpacerHorizontal16()
                Button(onClick = onClickPlus) {
                    Text(text = "+", fontSize = 48.sp)
                }
            }
        }
    }
}
