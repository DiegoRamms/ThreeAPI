package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news


import com.google.gson.annotations.SerializedName

data class CategoryDTO(
    @SerializedName("name")
    val name: String
)