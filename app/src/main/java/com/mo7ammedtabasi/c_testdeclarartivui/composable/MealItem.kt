package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.CardBackgroundColor
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.Rubik
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.MealUiState

@Composable
fun MealItem(
    meal: MealUiState,
    onClick: (MealUiState) -> Unit,
    modifier: Modifier = Modifier
) {

    Card(modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp)) {
        Column(
            modifier = Modifier.clickable {
                onClick(meal)
            }
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = meal.imageUrl),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = meal.name,
                fontFamily = Rubik,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        CardBackgroundColor
                    )
                    .padding(16.dp)
            )
        }
    }
}
