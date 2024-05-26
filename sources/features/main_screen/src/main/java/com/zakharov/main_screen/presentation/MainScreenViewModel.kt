package com.zakharov.main_screen.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zakharov.main_screen.data.entities.Meal
import com.zakharov.main_screen.data.repository.MainScreenRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainScreenViewModel(
    private val mainScreenRepository: MainScreenRepository
) : ViewModel() {

    private val _mealsList = MutableStateFlow<List<Meal>>(emptyList())
    val mealsList = _mealsList.asStateFlow()

    init {
        loadMealsList()
    }

    private fun loadMealsList() {
        viewModelScope.launch {
            _mealsList.value = mainScreenRepository.getMealsList()
        }
    }
}