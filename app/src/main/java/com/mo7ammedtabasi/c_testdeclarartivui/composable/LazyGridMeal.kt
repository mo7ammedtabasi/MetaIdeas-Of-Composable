package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.FoodUiState
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.MealUiState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyVerticalMeal(
    state: FoodUiState, onClickMeal: (MealUiState) -> Unit
){
    LazyVerticalGrid(
//        columns = GridCells.Fixed(3),
        columns = GridCells.Adaptive(128.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Merging Grid cells in Compose
        item(span = {
            GridItemSpan(2)
        }) {
            Text(text = "Menu")
        }



        items(
            items = state.easternMeals,
            key = { currentMeal ->
                currentMeal.name
            }) { meal ->
            MealItem(
                meal = meal,
                onClick = onClickMeal,
                modifier = Modifier
                    .animateItemPlacement()
            )
        }

        items(
            items = state.westernMeals,
            key = { currentMeal ->
                currentMeal.name
            }) { meal ->
            MealItem(
                meal = meal,
                onClick = onClickMeal,
                modifier = Modifier
                    .animateItemPlacement()
            )
        }

    }
}