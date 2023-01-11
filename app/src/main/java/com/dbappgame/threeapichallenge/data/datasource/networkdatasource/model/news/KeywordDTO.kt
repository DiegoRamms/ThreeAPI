package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news


import com.google.gson.annotations.SerializedName

data class KeywordDTO(
    @SerializedName("name")
    val name: String,
    @SerializedName("weight")
    val weight: Double
)