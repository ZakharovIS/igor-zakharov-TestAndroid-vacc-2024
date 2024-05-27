package com.zakharov.product_details.di

import com.zakharov.core.NetworkProvider
import com.zakharov.product_details.presentation.ProductDetailsFragment
import dagger.Component

@Component(
    dependencies = [NetworkProvider::class],
    modules = [
        ProductDetailsNetworkModule::class
    ]
)
interface ProductDetailsComponent {

    @Component.Factory
    interface Factory {
        fun create(
            networkProvider: NetworkProvider
        ): ProductDetailsComponent
    }

    fun inject(productDetailsFragment: ProductDetailsFragment)
}