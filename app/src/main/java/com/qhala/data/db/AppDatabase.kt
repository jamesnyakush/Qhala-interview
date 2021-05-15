package com.qhala.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.qhala.data.db.dao.MovieDao
import com.qhala.data.db.entity.Movie

@Database(entities = [Movie::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
}