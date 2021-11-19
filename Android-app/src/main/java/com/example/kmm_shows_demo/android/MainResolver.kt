package com.example.kmm_shows_demo.android

import com.example.kmm_shows_demo.Modules.Shows.SharedModules
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic

class MainResolver {
    fun resolve(): MainViewModel {
        val interactor: ShowsBusinessLogic = SharedModules().resolve()
        return MainViewModel(interactor)
    }
}