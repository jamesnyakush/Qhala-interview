package com.qhala.data.repository

import com.qhala.data.db.dao.MovieDao
import com.qhala.data.db.entity.Movie
import com.qhala.data.network.ApiClient
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiClient: ApiClient,
    private val dao: MovieDao
) : BaseRepository() {

    suspend fun getMovies(key: String) = safeApiCall {
        apiClient.getMovies(key)
    }

    suspend fun saveMovie(movies: List<Movie>) {
        dao.saveMovie(movies)
    }

    fun fetchMovies() {
        dao.getMovies()
    }
}