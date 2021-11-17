package com.example.kmm_shows_demo.Modules.Shows.Domain

import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowDto
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import com.example.kmm_shows_demo.Modules.Shows.ShowsRepository

class ShowsInteractor(
    private val repository: ShowsRepository
): ShowsBusinessLogic {
    override suspend fun fetchList(): List<ShowDto> {
        return repository.fetchList(null)
    }

    override suspend fun fetchDetail(id: String): ShowDto {
        return repository.fetchDetail(id)
    }
}