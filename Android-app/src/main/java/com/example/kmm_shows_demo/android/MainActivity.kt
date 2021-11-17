package com.example.kmm_shows_demo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsDataRepository
import com.example.kmm_shows_demo.Modules.Shows.Data.ShowsRemoteDataSource
import com.example.kmm_shows_demo.Modules.Shows.Domain.ShowsInteractor
import com.example.kmm_shows_demo.Modules.Shows.ShowsBusinessLogic
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private val mainScope = MainScope()
    private val model = MainResolver().model()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Loading..."

        mainScope.launch {
            kotlin.runCatching {
                model.fetchDetail("250")
            }.onSuccess {
                tv.text = it.name
            }.onFailure {
                tv.text = "$it"
            }
        }
    }
}

class MainResolver {
    fun model(): ShowsBusinessLogic {
        val dataSource = ShowsRemoteDataSource()
        val repository = ShowsDataRepository(dataSource)
        return ShowsInteractor(repository)
    }
}