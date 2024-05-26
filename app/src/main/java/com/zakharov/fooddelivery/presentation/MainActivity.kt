package com.zakharov.fooddelivery.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.zakharov.fooddelivery.R
import com.zakharov.main_screen.presentation.MainScreenFragment
import com.zakharov.main_screen_api.MainScreenNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*DaggerMainActivityComponent.factory().create(
            (application as MainApp).getNavigatorsProvider()
        ).inject(this)*/

        supportFragmentManager.commit {
            replace(R.id.fragment_container, MainScreenFragment())
            setReorderingAllowed(true)
        }
    }
}