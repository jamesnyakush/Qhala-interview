package com.qhala.util

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
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

@RequiresApi(Build.VERSION_CODES.O)
fun simpleFormatedDates(date: String): LocalDate {


    val formatter = DateTimeFormatter.ofPattern("EE, d MMM yyyy",Locale.getDefault())
    val date = LocalDate.parse(date, formatter)
    return date
}