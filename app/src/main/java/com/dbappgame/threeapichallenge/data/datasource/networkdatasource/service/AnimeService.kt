package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.anime.AnimeDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeService {

    @GET("search")
    suspend fun getResponse(@Query("keyw") textToSearch: String): AnimeDTO

}



