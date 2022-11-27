package com.example.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.peliculas.Practica12.ActivityWhitMenus
import com.example.peliculas.adapter.FilmAdapter
import com.example.peliculas.databinding.ActivityMainBinding

class MainActivity : ActivityWhitMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



       // val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        val manager = LinearLayoutManager(this)

        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = FilmAdapter(FilmProvider.film)
       // binding.recyclerView.addItemDecoration(decoration)

    }
}