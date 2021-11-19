package com.example.kmm_shows_demo.Modules.Shows

import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsDataRepository
import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsRemoteDataSource
import com.example.kmm_shows_demo.Modules.Shows.Domain.ShowsInteractor

class SharedModules {
    fun resolve(): ShowsBusinessLogic {
        val dataSource = ShowsRemoteDataSource()
        val repository = ShowsDataRepository(dataSource)
        return ShowsInteractor(repository)
    }
}