package com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state

data class FoodUiState(
    val easternMeals: List<MealUiState> = emptyList(),
    val westernMeals: List<MealUiState> = emptyList(),
    val restaurants : List<RestaurantUiState> = emptyList()
)

data class MealUiState(
    val name:String,
    val imageUrl:String
)

data class RestaurantUiState(
    val name:String,
    val imageUrl:String
)
