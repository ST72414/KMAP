package com.example.kmapaplication.model

data class GameResult(
    val guess: Int,
    val correct: Boolean,
    val timestamp: Long = System.currentTimeMillis()
)