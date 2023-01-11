package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons


import com.google.gson.annotations.SerializedName

data class SimpsonsItemDTO(
    @SerializedName("character")
    val character: String,
    @SerializedName("characterDirection")
    val characterDirection: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("quote")
    val quote: String
)