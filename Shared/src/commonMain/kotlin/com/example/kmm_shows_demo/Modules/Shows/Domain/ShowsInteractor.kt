package com.example.kmm_shows_demo.Modules.Shows.Domain

import com.example.kmm_shows_demo.Modules.Shows.Entities.Show
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import com.example.kmm_shows_demo.Modules.Shows.ShowsRepository
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class ShowsInteractor(
    private val repository: ShowsRepository
): ShowsBusinessLogic {
    private val mainScope = MainScope()

    override fun fetchList(onSuccess: (List<Show>) -> Unit, onFailure: (Throwable) -> Unit) {
        mainScope.launch {
            kotlin.runCatching {
                repository.fetchList(null)
            }.onSuccess {
                onSuccess(it)
            }.onFailure {
                onFailure(it)
            }
        }
    }

    override fun fetchDetail(id: String, onSuccess: (Show) -> Unit, onFailure: (Throwable) -> Unit) {
        mainScope.launch {
            kotlin.runCatching {
                repository.fetchDetail(id)
            }.onSuccess {
                onSuccess(it)
            }.onFailure {
                onFailure(it)
            }
        }
    }
}