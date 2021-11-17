package com.example.kmm_shows_demo.Modules.Shows.Data

import com.example.kmm_shows_demo.Commons.ApiService
import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowDto
import com.example.kmm_shows_demo.Modules.Shows.ShowsDataSource
import io.ktor.client.request.*

class ShowsRemoteDataSource: ShowsDataSource {
    override suspend fun fetchList(filter: String?): List<ShowDto> {
        return ApiService().client.get<List<ShowDto>> {
            url {
                encodedPath = "shows"
            }
        }
    }

    override suspend fun fetchDetail(id: String): ShowDto {
        return ApiService().client.get<ShowDto> {
            url {
                encodedPath = "shows/$id"
            }
        }
    }
}