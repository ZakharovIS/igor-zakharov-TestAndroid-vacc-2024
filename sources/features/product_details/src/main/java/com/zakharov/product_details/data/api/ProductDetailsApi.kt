package com.zakharov.product_details.data.api

import com.zakharov.product_details.data.entities.ResponseProductDetails
import retrofit2.http.GET
import retrofit2.http.Query

private const val PRODUCT_DETAIL_REQUEST = "lookup.php?"

interface ProductDetailsApi {

    @GET(PRODUCT_DETAIL_REQUEST)
    suspend fun getProductList(
        @Query("i") id: Int
    ): ResponseProductDetails
}