package com.example.kmapaplication.model

class GameRepository(private val dao: GameResultDao) {
    suspend fun insert(result: GameResult) = dao.insert(result)
    suspend fun getAll(): List<GameResult> = dao.getAll()
}
