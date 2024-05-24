package com.zakharov.fooddelivery.di

import android.content.Context
import com.zakharov.fooddelivery.MainApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface BaseComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): BaseComponent
    }

    fun inject(app: MainApp)
}