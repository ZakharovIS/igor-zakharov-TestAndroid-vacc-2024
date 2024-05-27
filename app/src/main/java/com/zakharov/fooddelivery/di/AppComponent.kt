package com.zakharov.fooddelivery.di

import android.content.Context
import com.zakharov.core.NetworkProvider
import com.zakharov.fooddelivery.MainApp
import com.zakharov.network.di.NetworkComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [NetworkProvider::class]
)
interface AppComponent : NetworkProvider{

    companion object {
        fun init(
            context: Context
        ): AppComponent {
            val networkProvider = NetworkComponent.init()
            return DaggerAppComponent.factory()
                .create(networkProvider)
        }
    }

    @Component.Factory
    interface Factory {

        fun create(
            networkProvider: NetworkProvider
            ): AppComponent
    }

    fun inject(app: MainApp)
}