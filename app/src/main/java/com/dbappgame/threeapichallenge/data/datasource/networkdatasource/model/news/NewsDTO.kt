package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news


import com.google.gson.annotations.SerializedName

data class NewsDTO(
    @SerializedName("articles")
    val articles: List<ArticleDTO>,
    @SerializedName("numResults")
    val numResults: Int,
    @SerializedName("status")
    val status: Int
)