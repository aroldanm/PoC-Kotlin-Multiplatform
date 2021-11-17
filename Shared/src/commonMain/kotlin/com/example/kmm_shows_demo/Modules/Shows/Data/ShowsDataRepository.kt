package com.example.kmm_shows_demo.Modules.Shows.Data

import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowDto
import com.example.kmm_shows_demo.Modules.Shows.ShowsDataSource
import com.example.kmm_shows_demo.Modules.Shows.ShowsRepository

class ShowsDataRepository(
    private val dataSource: ShowsDataSource
): ShowsRepository {
    override suspend fun fetchList(filter: String?): List<ShowDto> {
        return dataSource.fetchList(filter)
    }

    override suspend fun fetchDetail(id: String): ShowDto {
        return dataSource.fetchDetail(id)
    }
}