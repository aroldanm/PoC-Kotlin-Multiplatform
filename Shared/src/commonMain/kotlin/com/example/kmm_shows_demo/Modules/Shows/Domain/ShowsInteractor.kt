package com.example.kmm_shows_demo.Modules.Shows.Domain

import com.example.kmm_shows_demo.Modules.Shows.Entities.Show
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import com.example.kmm_shows_demo.Modules.Shows.ShowsRepository

class ShowsInteractor(
    private val repository: ShowsRepository
): ShowsBusinessLogic {
    override suspend fun fetchList(): List<Show> {
        return repository.fetchList(null)
    }

    override suspend fun fetchDetail(id: String): Show {
        return repository.fetchDetail(id)
    }
}