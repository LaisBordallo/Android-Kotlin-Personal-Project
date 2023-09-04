package com.example.cursoandroid.domain.repository

import com.example.cursoandroid.data.model.Movie
import retrofit2.Retrofit

//Criar método getMovies(), retornando List<Movie>

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
}