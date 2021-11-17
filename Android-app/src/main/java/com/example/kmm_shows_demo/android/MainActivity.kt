package com.example.kmm_shows_demo.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel = MainResolver().resolve()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.model.observe(this, Observer {
            // TODO: Update UI
        })
    }

    override fun onStart() {
        super.onStart()
        viewModel.onStart()
    }
}