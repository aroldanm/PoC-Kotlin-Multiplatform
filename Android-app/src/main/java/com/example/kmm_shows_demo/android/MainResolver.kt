package com.example.kmm_shows_demo.android

import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsDataRepository
import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsRemoteDataSource
import com.example.kmm_shows_demo.Modules.Shows.Domain.ShowsInteractor

class MainResolver {
    fun resolve(): MainViewModel {
        val dataSource = ShowsRemoteDataSource()
        val repository = ShowsDataRepository(dataSource)
        val interactor = ShowsInteractor(repository)
        return MainViewModel(interactor)
    }
}