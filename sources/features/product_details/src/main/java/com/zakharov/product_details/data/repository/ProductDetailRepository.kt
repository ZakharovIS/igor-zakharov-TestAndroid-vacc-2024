package com.zakharov.product_details.data.repository

import com.zakharov.product_details.data.api.ProductDetailsApi
import com.zakharov.product_details.data.entities.ProductDetails
import javax.inject.Inject

class ProductDetailRepository
    @Inject constructor(
    private val productDetailsApi: ProductDetailsApi
) {

        suspend fun getProductDetail(id: Int): ProductDetails {
            return productDetailsApi.getProductList(id).productDetailsList.first()
        }
}
