package com.example.kmm_shows_demo.Modules.Shows.Data

import com.example.kmm_shows_demo.Commons.ApiService
import com.example.kmm_shows_demo.Commons.Resources.ApiConfiguration
import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowMapper
import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowListMapper
import com.example.kmm_shows_demo.Modules.Shows.Entities.Show
import com.example.kmm_shows_demo.Modules.Shows.ShowsDataSource

class ShowsRemoteDataSource: ShowsDataSource {
    override suspend fun fetchList(filter: String?): List<Show> {
        val configuration = ApiConfiguration("shows")
        return ApiService().get(configuration, ShowListMapper())
    }

    override suspend fun fetchDetail(id: String): Show {
        val configuration = ApiConfiguration("shows/$id")
        return  ApiService().get(configuration, ShowMapper())
    }
}