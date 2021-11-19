package com.example.kmm_shows_demo.Utils

import com.example.kmm_shows_demo.Utils.Mapper.MapperInterface
import com.example.kmm_shows_demo.Utils.Resources.ApiConfiguration
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.http.*
import io.ktor.client.request.*

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

    suspend inline fun <reified MapperInput, MapperOutput> get(
        config: ApiConfiguration,
        mapper: MapperInterface<MapperInput, MapperOutput>
    ): MapperOutput {
        val response = client.get<MapperInput> {
            url {
                encodedPath = config.path
            }
        }
        return mapper.map(response)
    }
}