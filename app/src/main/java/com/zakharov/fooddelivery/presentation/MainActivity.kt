package com.zakharov.fooddelivery.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.lifecycle.lifecycleScope
import com.zakharov.fooddelivery.R
import com.zakharov.main_screen.presentation.MainScreenFragment
import com.zakharov.main_screen_api.MainScreenNavigator
import com.zakharov.product_details.presentation.ProductDetailsFragment
import javax.inject.Inject

private const val KEY_PRODUCT_ID = "Key ID"
private const val KEY_MEAL = "KeyMeal"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.setFragmentResultListener("KeyMeal", this) { requestKey, bundle ->
            navigateToProductDetails(bundle.getInt(KEY_PRODUCT_ID))
        }

        supportFragmentManager.commit {
            replace(R.id.fragment_container, MainScreenFragment())
            setReorderingAllowed(true)
        }
    }

    fun navigateToProductDetails(id: Int) {
        val fragment = ProductDetailsFragment()
        val bundle = Bundle()
        bundle.putInt(KEY_PRODUCT_ID, id)
        fragment.arguments = bundle
        supportFragmentManager.commit {
            replace(R.id.fragment_container, fragment)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }
}