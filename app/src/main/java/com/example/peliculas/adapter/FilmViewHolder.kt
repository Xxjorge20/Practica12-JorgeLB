package com.example.peliculas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.peliculas.Film
import com.example.peliculas.databinding.ItemFilmBinding


class FilmViewHolder(view:View) : RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filmModel: Film) {
        binding.NombrePelicula.text = filmModel.film
        binding.NombreDirector.text = filmModel.director
        binding.AOPelicula.text = filmModel.year.toString()
        Glide.with(binding.ImagenFoto.context)
            .load(filmModel.photo)
            .into(binding.ImagenFoto)

        binding.ImagenFoto.setOnClickListener{ Toast.makeText(binding.ImagenFoto.context, filmModel.film, Toast.LENGTH_SHORT).show()}
        itemView.setOnClickListener{ Toast.makeText(binding.ImagenFoto.context, filmModel.director, Toast.LENGTH_SHORT).show()}

    }
}