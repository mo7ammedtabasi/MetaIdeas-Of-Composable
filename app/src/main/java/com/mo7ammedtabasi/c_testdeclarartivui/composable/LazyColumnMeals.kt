package com.mo7ammedtabasi.c_testdeclarartivui.composable

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mo7ammedtabasi.c_testdeclarartivui.screens.MealsHeader
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.FoodUiState
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.MealUiState
import kotlinx.coroutines.flow.collect

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyColumnMeals(
    state: FoodUiState, onClickMeal: (MealUiState) -> Unit
){
    val listState = rememberLazyListState()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        state = listState
    ) {
        item {
//            Text(text = "Menu", color = Color.White, fontSize = 32.sp)

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(state.restaurants) {
                    RestaurantItem(state = it)
                }
            }
        }

        stickyHeader {
            MealsHeader(title = "Western Meals")
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
                    .padding(horizontal = 16.dp)
                    .animateItemPlacement()
            )
        }

        stickyHeader {
            MealsHeader(title = "Eastern Meals")
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
                    .padding(horizontal = 16.dp)
                    .animateItemPlacement()
            )
        }
//        item {
//            Text(text = "Copyright 2023", color = Color.White, fontSize = 32.sp)
//        }
//
//        itemsIndexed(state.meals){ index, item ->
//            val backgroundColor = if (index % 2  == 0) Color.Cyan else Color.LightGray
//            LargeTextItem(text = item.name, color = backgroundColor)
//
//        }
    }

    LaunchedEffect(key1 = true){
//        listState.animateScrollToItem(10)
        snapshotFlow {
            listState.isScrollInProgress
        }.collect{
            Log.i("LazyColumnMealsTAG", "LazyColumnMeals: $it")
        }
    }
}