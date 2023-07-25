package com.app.fittracker.framework.datasource.cache


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.app.fittracker.framework.datasource.cache.model.Run

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDao
}
 