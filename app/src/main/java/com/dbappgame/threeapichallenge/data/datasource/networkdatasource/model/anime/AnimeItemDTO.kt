package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.anime


import com.google.gson.annotations.SerializedName

data class AnimeItemDTO(
    @SerializedName("animeId")
    val animeId: String,
    @SerializedName("animeImg")
    val animeImg: String,
    @SerializedName("animeTitle")
    val animeTitle: String,
    @SerializedName("animeUrl")
    val animeUrl: String,
    @SerializedName("status")
    val status: String
)