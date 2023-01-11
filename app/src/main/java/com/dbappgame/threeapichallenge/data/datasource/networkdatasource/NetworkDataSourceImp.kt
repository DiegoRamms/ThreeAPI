package com.dbappgame.threeapichallenge.data.datasource.networkdatasource

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.AnimeService
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.NewsService
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.SimpsonsService
import com.dbappgame.threeapichallenge.data.mapper.toDomain
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import com.dbappgame.threeapichallenge.domain.model.Item
import javax.inject.Inject

class NetworkDataSourceImp @Inject constructor(
    private val newsService: NewsService,
    private val simpsonsService: SimpsonsService,
    private val animeService: AnimeService
) : NetworkDataSource {
    override suspend fun getResponse(
        networkType: DataType,
        textToSearch: String,
        itemsNumber: Int?
    ): List<Item> {
        return when (networkType) {
            is DataType.News -> {
                newsService.getResponse(textToSearch, false).toDomain()
            }
            is DataType.Simpsons -> {
                simpsonsService.getResponse(itemsNumber ?: 0).toDomain()
            }
            is DataType.Anime -> {
                animeService.getResponse(textToSearch).toDomain()
            }
        }
    }

}