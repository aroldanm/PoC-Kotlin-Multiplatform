package com.example.kmm_shows_demo.android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainViewModel(
    private val businessLogic: ShowsBusinessLogic
): ViewModel() {
    // Observed Properties
    val model = MutableLiveData<MainModel>()

    // View Outputs
    fun onStart() {
        // TODO: Start loading + fetch data
    }
}