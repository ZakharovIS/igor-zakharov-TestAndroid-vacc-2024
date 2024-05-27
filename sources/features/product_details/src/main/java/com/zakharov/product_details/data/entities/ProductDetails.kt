package com.zakharov.product_details.data.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductDetails(
    @Json(name = "idMeal") val id: Int,
    @Json(name = "strMeal") val name: String,
    @Json(name = "strMealThumb") val pictureURL: String,
    @Json(name = "strCategory") val strCategory: String?,
    @Json(name = "strTags") val strTags: String?,
    @Json(name = "strArea") val strArea: String?,
    @Json(name = "strIngredient1") val strIngredient1: String?,
    @Json(name = "strIngredient2") val strIngredient2: String?,
    @Json(name = "strIngredient3") val strIngredient3: String?,
    @Json(name = "strIngredient4") val strIngredient4: String?,
    @Json(name = "strIngredient5") val strIngredient5: String?,
    @Json(name = "strIngredient6") val strIngredient6: String?,
    @Json(name = "strIngredient7") val strIngredient7: String?,
    @Json(name = "strIngredient8") val strIngredient8: String?,
    @Json(name = "strIngredient9") val strIngredient9: String?,
    @Json(name = "strIngredient10") val strIngredient10: String?
)