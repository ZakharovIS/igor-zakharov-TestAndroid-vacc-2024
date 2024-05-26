package com.zakharov.fooddelivery.di

import com.zakharov.fooddelivery.presentation.MainActivity
import dagger.Component

@Component
interface MainActivityComponent {

    @Component.Factory
    interface Factory {
        fun create(
        ): MainActivityComponent
    }

    fun inject(mainActivity: MainActivity)
}