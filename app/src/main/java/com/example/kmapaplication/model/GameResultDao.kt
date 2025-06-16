package com.example.kmapaplication.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GameResultDao {
    @Insert
    suspend fun insert(result: GameResult)

    @Query("SELECT * FROM GameResult")
    suspend fun getAll(): List<GameResult>
}
