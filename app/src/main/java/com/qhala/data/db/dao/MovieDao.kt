package com.qhala.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.qhala.data.db.entity.Movie


@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovie(movies: List<Movie>)


    @Query("SELECT * FROM movies")
    fun getMovies(): LiveData<List<Movie>>
}