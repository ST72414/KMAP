package com.example.kmapaplication.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kmapaplication.model.GameResult
import com.example.kmapaplication.model.Hint

class GameViewModel : ViewModel() {

    private val hints = listOf(
        Hint("Počet noh u pavouka", 8),
        Hint("Počet měsíců v roce", 12),
        Hint("Počet prstů na jedné ruce", 5),
        Hint("Počet kol u auta", 4),
        Hint("Počet nohou u člověka", 2),
        Hint("Počet noh u kočky", 4),
        Hint("Počet kol u kola", 2),
        Hint("Počet hodin na ciferníku", 12),
        Hint("Počet smyslů člověka", 5),
        Hint("Počet kontinentů", 7)
    )

    private val _currentHint = MutableLiveData<Hint>()
    val currentHint: LiveData<Hint> = _currentHint

    private val _results = MutableLiveData<List<GameResult>>(emptyList())
    val results: LiveData<List<GameResult>> = _results

    private var attemptCount = 0

    init {
        generateNewHint()
    }

    fun guessNumber(guess: Int) {
        if (attemptCount >= 10) {
            // Hráč už vyčerpal pokusy
            return
        }
        val correct = guess == _currentHint.value?.answer
        val result = GameResult(guess, correct)
        _results.value = _results.value!! + result
        attemptCount++
        generateNewHint()
    }

    private fun generateNewHint() {
        _currentHint.value = hints.random()
    }
}

// TODO: commit MVVM struktura

