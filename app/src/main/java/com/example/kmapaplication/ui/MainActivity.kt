package com.example.kmapaplication.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kmapaplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerResults.layoutManager = LinearLayoutManager(this)

        viewModel.results.observe(this) { resultList ->
            binding.recyclerResults.adapter = GameAdapter(resultList.reversed())
        }

        viewModel.currentHint.observe(this) { hint ->
            binding.textHint.text = hint.text
        }

        binding.btnGuess.setOnClickListener {
            val guess = binding.editGuess.text.toString().toIntOrNull()
            if (guess == null) {
                Toast.makeText(this, "Zadej celé číslo!", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.guessNumber(guess)
                binding.editGuess.text.clear()
            }
        }
    }
}

// TODO: změna pro nový commit
// TODO: připojení RecyclerView
