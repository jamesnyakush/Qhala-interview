package com.qhala.data.repository

import com.qhala.data.network.ApiClient
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiClient: ApiClient
) : BaseRepository() {

    suspend fun getMovies(key: String) = safeApiCall {
        apiClient.getMovies(key)
    }
}