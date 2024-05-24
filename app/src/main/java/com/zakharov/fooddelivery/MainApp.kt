package com.zakharov.fooddelivery

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.zakharov.fooddelivery.di.BaseComponent
import com.zakharov.fooddelivery.di.DaggerBaseComponent


class MainApp: Application() {

    val baseComponent: BaseComponent by lazy {
        DaggerBaseComponent.factory().create(this)
    }

    companion object {
        @JvmStatic
        fun baseComponent(context: Context) =
            (context.applicationContext as MainApp).baseComponent
    }
}

fun Activity.baseComponent() = MainApp.baseComponent(this)
fun Fragment.baseComponent() = MainApp.baseComponent(requireContext())