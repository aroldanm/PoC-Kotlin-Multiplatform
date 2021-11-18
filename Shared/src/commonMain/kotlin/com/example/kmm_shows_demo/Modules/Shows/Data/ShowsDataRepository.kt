package com.example.kmm_shows_demo.Modules.Shows.Data

import com.example.kmm_shows_demo.Modules.Shows.Entities.Show
import com.example.kmm_shows_demo.Modules.Shows.ShowsDataSource
import com.example.kmm_shows_demo.Modules.Shows.ShowsRepository

class ShowsDataRepository(
    private val dataSource: ShowsDataSource
): ShowsRepository {
    override suspend fun fetchList(filter: String?): List<Show> {
        return dataSource.fetchList(filter)
    }

    override suspend fun fetchDetail(id: String): Show {
        return dataSource.fetchDetail(id)
    }
}