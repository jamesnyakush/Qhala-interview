package com.qhala.util

val IMAGE_PREFIX = "https://image.tmdb.org/t/p/"

fun loadImage(imageUrl: String?) = "$IMAGE_PREFIX/original/$imageUrl"