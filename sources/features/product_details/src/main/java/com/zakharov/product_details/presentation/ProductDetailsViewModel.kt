package com.zakharov.product_details.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zakharov.product_details.data.entities.ProductDetails
import com.zakharov.product_details.data.repository.ProductDetailRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductDetailsViewModel(
    private val productDetailRepository: ProductDetailRepository
) : ViewModel() {

    private val _product = MutableStateFlow<ProductDetails?>(null)
    val product = _product.asStateFlow()

    private var productId: Int? = null

    fun loadProduct(id: Int) {
        if (productId == null) {
            productId = id
            viewModelScope.launch {
                _product.value = productDetailRepository.getProductDetail(id)
            }
        }
    }
}