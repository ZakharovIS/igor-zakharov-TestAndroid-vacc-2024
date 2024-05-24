package com.zakharov.fooddelivery.di

import android.content.Context
import com.zakharov.fooddelivery.MainApp
import com.zakharov.network.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NetworkModule::class]
)
interface BaseComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): BaseComponent
    }

    val networkProvider: Retrofit

    fun inject(app: MainApp)
}