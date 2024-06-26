package com.zakharov.main_screen.data.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Meal(
    @Json(name = "idMeal") val id: Int,
    @Json(name = "strMeal") val name: String,
    @Json(name = "strMealThumb") val pictureURL: String
)