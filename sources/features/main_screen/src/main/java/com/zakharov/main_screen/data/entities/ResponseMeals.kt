package com.zakharov.main_screen.data.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseMeals(
    @Json(name = "meals") val meals: List<Meal>
)

