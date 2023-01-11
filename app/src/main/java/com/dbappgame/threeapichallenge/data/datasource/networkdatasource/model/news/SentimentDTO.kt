package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news


import com.google.gson.annotations.SerializedName

data class SentimentDTO(
    @SerializedName("negative")
    val negative: Double,
    @SerializedName("neutral")
    val neutral: Double,
    @SerializedName("positive")
    val positive: Double
)