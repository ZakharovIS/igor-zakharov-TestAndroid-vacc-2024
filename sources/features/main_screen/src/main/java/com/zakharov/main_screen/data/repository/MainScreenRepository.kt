package com.zakharov.main_screen.data.repository

import com.zakharov.main_screen.data.api.MealsListApi
import com.zakharov.main_screen.data.entities.Meal
import javax.inject.Inject

class MainScreenRepository
    @Inject constructor(
    private val mealsListApi: MealsListApi
) {

        suspend fun getMealsList(): List<Meal> {
            return  mealsListApi.getMealsList().meals
        }
}
