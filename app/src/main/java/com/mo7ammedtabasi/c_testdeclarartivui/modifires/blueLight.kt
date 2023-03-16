package com.mo7ammedtabasi.c_testdeclarartivui.modifires

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Stable
fun Modifier.blueLight() = then(Modifier.shadow(24.dp, spotColor = Color.Blue))