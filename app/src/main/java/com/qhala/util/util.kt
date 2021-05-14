package com.qhala.util

import java.text.SimpleDateFormat
import java.util.*

val IMAGE_PREFIX = "https://image.tmdb.org/t/p/"

fun loadImage(imageUrl: String?) = "$IMAGE_PREFIX/original/$imageUrl"

fun simpleFormatedDate(date: Date): String {
    val target = SimpleDateFormat(
        "EE, d MMM yyyy",
        Locale.getDefault()
    )
    return target.format(date)
}

const val PREFS_NAME = "movies_preferences"

const val STORE_NAME = "movie_data_store"