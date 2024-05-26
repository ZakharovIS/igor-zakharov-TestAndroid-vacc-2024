package com.zakharov.main_screen.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zakharov.main_screen.data.repository.MainScreenRepository
import javax.inject.Inject

class MainScreenViewModelFactory @Inject constructor(
    private val mainScreenRepository: MainScreenRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainScreenViewModel(
            mainScreenRepository
        ) as T
    }
}