package com.mo7ammedtabasi.c_testdeclarartivui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.composable.LazyColumnMeals
import com.mo7ammedtabasi.c_testdeclarartivui.composable.MealItem
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.CardBackgroundColor
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.FoodViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.FoodUiState
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.MealUiState

@Composable
fun FoodScreen(
    viewModel: FoodViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    FoodContent(state = state, onClickMeal = viewModel::onClickMeal)

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FoodContent(
    state: FoodUiState, onClickMeal: (MealUiState) -> Unit
) {
    LazyColumnMeals(state = state, onClickMeal = onClickMeal)


}

@Composable
fun LargeTextItem(text: String, color: Color) {
    Text(
        text = text,
        fontSize = 28.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = color)
            .clip(RoundedCornerShape(16.dp))
            .padding(24.dp)
    )
}

@Composable
fun MealsHeader(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .background(CardBackgroundColor)
            .padding(8.dp)
    )
}