package com.example.cursoandroid.presentation.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.cursoandroid.databinding.ActivityMainBinding
import com.example.cursoandroid.presentation.viewmodel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        testData()
    }
    private fun testData(){
        movieViewModel.getMovies().observe(this){
            binding.apply {
                val item = it[1]
                val posterUrl = "https://image.tmdb.org/t/p/w500".plus(item.posterPath)
                Glide.with(imageView.context)
                    .load(posterUrl)
                    .into(imageView)
                tvTitulo.text = item.title
                tvSinopse.text = item.overview
            }
        }
    }
}