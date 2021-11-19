package com.example.kmm_shows_demo.Modules.Shows

import com.example.kmm_shows_demo.Modules.Shows.Entities.Show

interface ShowsBusinessLogic {
    fun fetchList(onSuccess: (List<Show>) -> Unit, onFailure: (Throwable) -> Unit)
    fun fetchDetail(id: String, onSuccess: (Show) -> Unit, onFailure: (Throwable) -> Unit)
}

interface ShowsRepository {
    suspend fun fetchList(filter: String?): List<Show>
    suspend fun fetchDetail(id: String): Show
}

interface ShowsDataSource {
    suspend fun fetchList(filter: String?): List<Show>
    suspend fun fetchDetail(id: String): Show
}