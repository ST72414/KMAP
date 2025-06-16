package com.example.kmapaplication.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kmapaplication.databinding.ItemResultBinding
import com.example.kmapaplication.model.GameResult
import java.text.SimpleDateFormat
import java.util.*
import androidx.core.content.ContextCompat
import com.example.kmapaplication.R



class GameAdapter(private val results: List<GameResult>) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textResult: TextView = itemView.findViewById(R.id.textResult)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_result, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = results.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = results[position]
        holder.textResult.text = "Tip: ${result.guess} – ${if (result.correct) "Správně" else "Špatně"}"

        val backgroundColor = if (result.correct) {
            ContextCompat.getColor(holder.itemView.context, android.R.color.holo_green_dark)
        } else {
            ContextCompat.getColor(holder.itemView.context, android.R.color.holo_red_dark)
        }
        holder.textResult.setBackgroundColor(backgroundColor)
    }
}

// TODO: commit RecyclerView adaptér
