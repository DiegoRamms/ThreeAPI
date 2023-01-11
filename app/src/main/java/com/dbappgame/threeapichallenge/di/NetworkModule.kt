package com.dbappgame.threeapichallenge.di


import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.AnimeService
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.NewsService
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.SimpsonsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {




    @Provides
    @Singleton
    fun provideOkHttpClient(

    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .addInterceptor { chain -> val request = chain.request()
                val newRequest =
                    request
                        .newBuilder()
                        .addHeader("x-api-key", "42bc54f9-b100-4dd2-9927-7d883e7b413e")
                        .build()

                 chain.proceed(newRequest) }
            .build()

    @Provides
    @Singleton
    @NewsRetrofit
    fun provideNewsRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://api.goperigon.com/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    @SimpsonsRetrofit
    fun provideSimpsonsRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://thesimpsonsquoteapi.glitch.me/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    @AnimeRetrofit
    fun provideAnimeRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://gogoanime.consumet.org/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    fun provideNewsService(@NewsRetrofit retrofit: Retrofit): NewsService =
        retrofit.create(NewsService::class.java)

    @Provides
    @Singleton
    fun provideSimpsonsService(@SimpsonsRetrofit retrofit: Retrofit): SimpsonsService =
        retrofit.create(SimpsonsService::class.java)

    @Provides
    @Singleton
    fun provideAnimeService(@AnimeRetrofit retrofit: Retrofit): AnimeService =
        retrofit.create(AnimeService::class.java)


}