package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news


import com.google.gson.annotations.SerializedName

data class ArticleDTO(
    @SerializedName("addDate")
    val addDate: String,
    @SerializedName("articleId")
    val articleId: String,
    @SerializedName("authorsByline")
    val authorsByline: String,
    @SerializedName("categories")
    val categories: List<CategoryDTO>,
    @SerializedName("claim")
    val claim: String,
    @SerializedName("clusterId")
    val clusterId: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("keywords")
    val keywords: List<KeywordDTO>,
    @SerializedName("labels")
    val labels: List<LabelDTO>,
    @SerializedName("language")
    val language: String,
    @SerializedName("links")
    val links: List<String>,
    @SerializedName("locations")
    val locations: List<Any>,
    @SerializedName("matchedAuthors")
    val matchedAuthors: List<Any>,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("places")
    val places: List<Any>,
    @SerializedName("pubDate")
    val pubDate: String,
    @SerializedName("refreshDate")
    val refreshDate: String,
    @SerializedName("reprint")
    val reprint: Boolean,
    @SerializedName("reprintGroupId")
    val reprintGroupId: String,
    @SerializedName("sentiment")
    val sentiment: SentimentDTO,
    @SerializedName("source")
    val source: SourceDTO,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("topics")
    val topics: List<TopicDTO>,
    @SerializedName("translation")
    val translation: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("verdict")
    val verdict: String
)