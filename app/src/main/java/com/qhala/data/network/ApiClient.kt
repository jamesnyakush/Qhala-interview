package com.qhala.data.network

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {

    @GET("movie/popular")
    suspend fun getMovies(
        @Query("api_key") api_key: String
    ): MovieResponse
}