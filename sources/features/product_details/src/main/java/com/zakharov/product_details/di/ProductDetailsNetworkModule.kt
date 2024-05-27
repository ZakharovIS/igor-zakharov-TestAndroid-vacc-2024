package com.zakharov.product_details.di

import com.zakharov.product_details.data.api.ProductDetailsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ProductDetailsNetworkModule {

    @Provides
    fun provideProductDetailsApi(
        retrofit: Retrofit
    ): ProductDetailsApi {
        return retrofit.create(ProductDetailsApi::class.java)
    }
}