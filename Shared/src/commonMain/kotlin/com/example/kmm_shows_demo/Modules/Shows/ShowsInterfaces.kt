package com.example.kmm_shows_demo.Modules.Shows

import com.example.kmm_shows_demo.Modules.Shows.Entities.Show

interface ShowsBusinessLogic {
    suspend fun fetchList(): List<Show>
    suspend fun fetchDetail(id: String): Show
}

interface ShowsRepository {
    suspend fun fetchList(filter: String?): List<Show>
    suspend fun fetchDetail(id: String): Show
}

interface ShowsDataSource {
    suspend fun fetchList(filter: String?): List<Show>
    suspend fun fetchDetail(id: String): Show
}