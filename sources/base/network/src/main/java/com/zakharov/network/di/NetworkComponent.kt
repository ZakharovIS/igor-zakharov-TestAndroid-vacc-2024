package com.zakharov.network.di

import com.zakharov.core.NetworkProvider
import dagger.Component

@Component(
    modules = [NetworkModule::class]
)
interface NetworkComponent: NetworkProvider {

    companion object{

        fun init(): NetworkProvider {
            return DaggerNetworkComponent.factory()
                .create()
        }
    }

    @Component.Factory
    interface Factory {

        fun create(): NetworkProvider
    }
}