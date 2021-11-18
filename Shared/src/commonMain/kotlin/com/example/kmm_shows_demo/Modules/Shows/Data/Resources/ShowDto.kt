package com.example.kmm_shows_demo.Modules.Shows.Data.Resources

import kotlinx.serialization.Serializable

@Serializable
data class ShowDto(
    val id: Int?,
    val name: String?,
    val type: String?,
    val genres: List<String>?,
    val status: String?,
    val averageRuntime: Int?,
    val premiered: String?,
    val ended: String?,
    val officialSite: String?,
    val rating: Rating?,
    val network: Network?,
    val webChannel: WebChannel?,
    val image: Image?,
    val summary: String?
) {
    @Serializable
    data class Rating(
        val average: Double?
    )

    @Serializable
    data class Network(
        val id: Int?,
        val name: String?,
        val country: ChannelCountry?
    )

    @Serializable
    data class WebChannel(
        val id: Int?,
        val name: String?,
        val country: ChannelCountry?
    )

    @Serializable
    data class ChannelCountry(
        val name: String?,
        val code: String?,
        val timezone: String?
    )

    @Serializable
    data class Image(
        val medium: String?,
        val original: String?
    )
}