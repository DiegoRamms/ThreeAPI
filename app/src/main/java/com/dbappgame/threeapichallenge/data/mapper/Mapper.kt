package com.dbappgame.threeapichallenge.data.mapper

import com.dbappgame.threeapichallenge.data.datasource.localdatasource.model.ItemEntity
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.anime.AnimeDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.anime.AnimeItemDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news.ArticleDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news.NewsDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons.SimpsonsDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons.SimpsonsItemDTO
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.domain.model.Item


fun NewsDTO.toDomain(): List<Item> =
    articles.map { it.toDomain() }

fun ArticleDTO.toDomain(): Item =
    Item(description, imageUrl)

fun AnimeDTO.toDomain(): List<Item> =
    map { it.toDomain() }

fun AnimeItemDTO.toDomain(): Item =
    Item(animeTitle, animeImg)

fun SimpsonsDTO.toDomain(): List<Item> =
    map { it.toDomain() }

fun SimpsonsItemDTO.toDomain(): Item =
    Item(quote, image)


fun Item.toEntity(dataType: DataType): ItemEntity =
    ItemEntity(title = title, imageUrl = imageUrl, type = dataType.value)

fun ItemEntity.toDomain(): Item =
    Item(title, imageUrl)