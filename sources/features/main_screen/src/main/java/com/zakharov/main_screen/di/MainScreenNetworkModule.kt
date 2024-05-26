package com.zakharov.main_screen.di

import com.zakharov.main_screen.data.api.MealsListApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainScreenNetworkModule {

    @Provides
    fun provideMealsListApi(
        retrofit: Retrofit
    ): MealsListApi {
        return retrofit.create(MealsListApi::class.java)
    }
}