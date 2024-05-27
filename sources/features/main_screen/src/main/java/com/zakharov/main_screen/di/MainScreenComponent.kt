package com.zakharov.main_screen.di

import com.zakharov.core.NetworkProvider
import com.zakharov.main_screen.presentation.MainScreenFragment
import dagger.Component

@Component(
    dependencies = [NetworkProvider::class],
    modules = [
        MainScreenNetworkModule::class
    ]
)
interface MainScreenComponent {

    @Component.Factory
    interface Factory {
        fun create(
            networkProvider: NetworkProvider
        ): MainScreenComponent
    }

    fun inject(mainScreenFragment: MainScreenFragment)
}