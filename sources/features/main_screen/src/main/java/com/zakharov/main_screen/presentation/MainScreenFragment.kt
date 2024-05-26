package com.zakharov.main_screen.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.zakharov.core.App
import com.zakharov.main_screen.data.entities.Meal
import com.zakharov.main_screen.databinding.FragmentMainScreenBinding
import com.zakharov.main_screen.di.DaggerMainScreenComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainScreenFragment : Fragment() {

    @Inject
    lateinit var vmFactory: MainScreenViewModelFactory

    private lateinit var viewModel: MainScreenViewModel

    private lateinit var binding: FragmentMainScreenBinding

    private val adapter = RVAdapterMealsList(
        onClick = { meal -> onItemClick(meal) }
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        DaggerMainScreenComponent.factory().create((requireActivity().application as App).getNetworkProvider()).inject(this)


        viewModel = ViewModelProvider(this, vmFactory)[MainScreenViewModel::class]

        binding = FragmentMainScreenBinding.inflate(inflater, container, false)

        bindAdapterToSource()
        setRecyclerView()

        return binding.root
    }


    private fun bindAdapterToSource() {
        viewLifecycleOwner.lifecycleScope
            .launch {
                viewModel.mealsList
                    .collect {
                        adapter.addItems(it)
                        adapter.notifyDataSetChanged()
                    }
            }
    }

    private fun setRecyclerView() {
        binding.rvMeals.adapter = adapter
    }

    private fun onItemClick(item: Meal) {
        TODO()
    }
}