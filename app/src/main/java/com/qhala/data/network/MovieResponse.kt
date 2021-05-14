package com.qhala.data.network

import com.qhala.data.db.entity.Movie

data class MovieResponse(
    val results: List<Movie>
)