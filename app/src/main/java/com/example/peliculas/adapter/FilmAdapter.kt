package com.example.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.Film
import com.example.peliculas.FilmProvider.Companion.film
import com.example.peliculas.R

class FilmAdapter(private var FilmList:List<Film>): RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_film, parent, false)
        return FilmViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = film[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return film.size
    }

}
