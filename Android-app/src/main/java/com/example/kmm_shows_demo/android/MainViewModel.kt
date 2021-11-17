package com.example.kmm_shows_demo.android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainViewModel(
    private val businessLogic: ShowsBusinessLogic
): ViewModel() {
    private val mainScope = MainScope()

    // Observed Properties
    val model = MutableLiveData<MainModel>()

    // View Outputs
    fun onStart() {
        // TODO: Start loading
        mainScope.launch {
            kotlin.runCatching {
                businessLogic.fetchList()
            }.onSuccess {
                // TODO: Update UI
                // TODO: Stop loading
            }.onFailure {
                // TODO: Show error
                // TODO: Stop loading
            }
        }
    }
}