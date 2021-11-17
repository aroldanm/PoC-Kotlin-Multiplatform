package com.example.kmm_shows_demo.Commons

import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.http.*

class ApiService {
    val client = HttpClient {
        defaultRequest {
            val endpointBuilder = URLBuilder("https://api.tvmaze.com")
            url {
                protocol = endpointBuilder.protocol
                host = endpointBuilder.host
            }
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }
}