package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.RestaurantUiState

@Composable
fun RestaurantItem(state:RestaurantUiState){
    Image(painter = rememberAsyncImagePainter(model = state.imageUrl), contentDescription = "Restaurant Logo", modifier = Modifier.size(96.dp).clip(
        CircleShape).background(color = Color(0xFFF8F8D8)))
}