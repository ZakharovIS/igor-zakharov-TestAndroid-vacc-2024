package com.zakharov.product_details.data.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseProductDetails(
    @Json(name = "meals") val productDetailsList: List<ProductDetails>
)

