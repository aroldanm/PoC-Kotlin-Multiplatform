package com.example.kmm_shows_demo.Modules.Shows

import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowDto

interface ShowsBusinessLogic {
    suspend fun fetchList(): List<ShowDto>
    suspend fun fetchDetail(id: String): ShowDto
}

interface ShowsRepository {
    suspend fun fetchList(filter: String?): List<ShowDto>
    suspend fun fetchDetail(id: String): ShowDto
}

interface ShowsDataSource {
    suspend fun fetchList(filter: String?): List<ShowDto>
    suspend fun fetchDetail(id: String): ShowDto
}