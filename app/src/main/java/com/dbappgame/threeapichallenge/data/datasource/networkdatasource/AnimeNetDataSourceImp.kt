package com.dbappgame.threeapichallenge.data.datasource.networkdatasource

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.anime.AnimeDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.AnimeService
import com.dbappgame.threeapichallenge.data.mapper.toDomain
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import com.dbappgame.threeapichallenge.domain.model.Item
import javax.inject.Inject

/*
class AnimeNetDataSourceImp @Inject constructor(
    private val service: AnimeService
): NetworkDataSource<List<Item>> {
    override suspend fun getResponse(textToSearch: String, itemsNumber: Int?): List<Item> {
        return  service.getResponse(textToSearch).map { it.toDomain() }
    }
}*/