package com.qhala.data.db.entity

data class MovieModel(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)