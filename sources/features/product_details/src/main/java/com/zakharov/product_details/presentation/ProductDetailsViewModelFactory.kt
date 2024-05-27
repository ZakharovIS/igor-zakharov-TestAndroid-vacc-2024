package com.zakharov.product_details.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zakharov.product_details.data.repository.ProductDetailRepository
import javax.inject.Inject

class ProductDetailsViewModelFactory @Inject constructor(
    private val productDetailRepository: ProductDetailRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductDetailsViewModel(
            productDetailRepository
        ) as T
    }
}