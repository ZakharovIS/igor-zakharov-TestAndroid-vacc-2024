package com.zakharov.fooddelivery

import android.app.Application
import com.zakharov.core.App
import com.zakharov.core.NetworkProvider
import com.zakharov.fooddelivery.di.AppComponent


class MainApp: Application(), App {

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        getAppComponent().inject(this)
    }

    private fun getAppComponent(): AppComponent {
        if (appComponent == null) {
            appComponent = AppComponent.init(applicationContext)
        }
        return appComponent!!
    }

    override fun getNetworkProvider(): NetworkProvider {
        return getAppComponent()
    }

}
