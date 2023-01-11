package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news.NewsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("all")
    suspend fun getResponse(
        @Query("title") title: String,
        @Query("showReprints") showReprints: Boolean = false
    ): NewsDTO

}