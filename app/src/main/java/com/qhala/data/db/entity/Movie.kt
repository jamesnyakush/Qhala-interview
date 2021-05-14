package com.qhala.data.db.entity

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "movies")
data class Movie(
    val adult: Boolean,
    val backdrop_path: String,
    val id: Int,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double
) : Parcelable