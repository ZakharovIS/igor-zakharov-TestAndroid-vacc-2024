package com.zakharov.main_screen.data.api

import com.zakharov.main_screen.data.entities.ResponseMeals
import retrofit2.http.GET

private const val MEALS_LIST_REQUEST = "filter.php?c=Seafood"

interface MealsListApi {

    @GET(MEALS_LIST_REQUEST)
    suspend fun getMealsList(): ResponseMeals
}