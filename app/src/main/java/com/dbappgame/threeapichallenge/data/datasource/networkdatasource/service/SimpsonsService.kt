package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons.SimpsonsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpsonsService {

    @GET("quotes")
    suspend fun getResponse(@Query("count") count: Int): SimpsonsDTO

}