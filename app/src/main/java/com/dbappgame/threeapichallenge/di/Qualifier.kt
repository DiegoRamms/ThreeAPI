package com.dbappgame.threeapichallenge.di

import javax.inject.Qualifier



// RETROFIT

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NewsRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SimpsonsRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AnimeRetrofit

