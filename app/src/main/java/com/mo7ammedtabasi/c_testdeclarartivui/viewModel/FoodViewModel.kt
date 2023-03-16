package com.mo7ammedtabasi.c_testdeclarartivui.viewModel

import androidx.lifecycle.ViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.FoodUiState
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.MealUiState
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.RestaurantUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.selects.select
import javax.inject.Inject

@HiltViewModel
class FoodViewModel @Inject constructor(): ViewModel() {
    private val _state = MutableStateFlow(FoodUiState())
    val state = _state.asStateFlow()


    init {
        getFoods()
        getRestaurant()
    }

    private fun getFoods() {
        _state.update {
            it.copy(
                easternMeals = listOf(
                    MealUiState(
                        "Burger",
                        "https://www.aspicyperspective.com/wp-content/uploads/2020/07/best-hamburger-patties-1-500x375.jpg"
                    ),
                    MealUiState(
                        "Pizza",
                        "https://www.saporinostri.it/wp-content/uploads/2020/10/le-origini-della-pizza-napoletana-e1601990439881.jpg"
                    ),
                    MealUiState(
                        "Chicken",
                        "https://insanelygoodrecipes.com/wp-content/uploads/2022/01/Creamy-Stewed-Chicken-with-Mushrooms-and-Herbs.jpg"
                    ),
                    MealUiState(
                        "Fries",
                        "https://img.taste.com.au/ol2Jq8ZQ/taste/2016/11/rachel-87711-2.jpeg"
                    ),
                    MealUiState(
                        "Salmon",
                        "https://www.skinnytaste.com/wp-content/uploads/2018/12/Baked-Salmon-1.jpg"
                    ),
                    MealUiState(
                        "HotDog",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Germanvegetariansausage.jpg/1200px-Germanvegetariansausage.jpg"
                    ),
                    MealUiState(
                        "lazania",
                        "https://bi.im-g.pl/im/34/7b/18/z25672244IER,Lazania-miesno-warzywna.jpg"
                    ),

                ),
                westernMeals = listOf(
                    MealUiState(
                        "Kabab",
                        "https://www.ndtv.com/cooks/images/seekh-kebab-620.jpg"),
                    MealUiState(
                        "Felafal",
                        "https://downshiftology.com/wp-content/uploads/2019/07/Falafel-7-500x500.jpg"
                    ),
                    MealUiState(
                        "Dolma",
                        "https://img.sndimg.com/food/image/upload/q_92,fl_progressive,w_1200,c_scale/v1/img/recipes/22/56/13/pice1bbtY.jpg"
                    ),
                    MealUiState(
                        "Sushi",
                        "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/spicy-crab-rolls4-1654808938.jpg"),
                    MealUiState(
                        "Mendi",
                        "https://cdn.saudigates.net/wp-content/uploads/2022/03/images-2022-03-23T234209.202.jpeg"
                    ),
                    MealUiState(
                        "Fusinjoon",
                        "https://veggiedesserts.com/wp-content/uploads/2020/02/fesenjan-fesenjoon-2-500x375.jpg"
                    ),
                    MealUiState(
                        "Masala",
                        "https://www.seriouseats.com/thmb/DbQHUK2yNCALBnZE-H1M2AKLkok=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/chicken-tikka-masala-for-the-grill-recipe-hero-2_1-cb493f49e30140efbffec162d5f2d1d7.JPG"
                    ),
                )
            )
        }
    }


    private fun getRestaurant(){
        _state.update { it.copy(
            restaurants = listOf(
                RestaurantUiState("Hardess","https://play-lh.googleusercontent.com/qS08Meln-CfQfIl-iThcLSbUJRi3pgQTq6IdOdJo-NwAY-VsS3AUkld91HRH-iSzKK5c"),
                RestaurantUiState("Burger King","https://play-lh.googleusercontent.com/uBCQPdCCHbFJCk3dDidGQ1paIeHaLRi-tJn83t2MkRoYiUX0X3K9CP3uV7dusjfRsqV5"),
                RestaurantUiState("Papa Jhon's","https://play-lh.googleusercontent.com/U6ZOeopAri3guNvfjNxfbaXKvtZlTNXYeiZbMqAshiEG79frEUZXG7tEkRmvHJqzSA"),
                RestaurantUiState("Pizza Hut","https://play-lh.googleusercontent.com/2ltNkuoIjYwXUGT-9w26Wt3BjM4ow2zqyis0DJuzaPTj5jY9v3H2W1Uuw6b3PglMak7Y"),
                RestaurantUiState("Mc Donalds","https://play-lh.googleusercontent.com/hSRuCp9qVkxNYLYibPYyra4bQLYDyHg40TA1Cu6i9Z3HsWEgS1q076VfjacAdQquHw"),
            )
        ) }
    }
    fun onClickMeal(selectMeal: MealUiState) {
        _state.update {
            it.copy(
                easternMeals = it.easternMeals.filterNot {meal->
                    meal.name == selectMeal.name
                }
            )
        }
    }
}