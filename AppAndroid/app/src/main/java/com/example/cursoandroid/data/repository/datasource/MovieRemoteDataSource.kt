package com.example.cursoandroid.data.repository.datasource

import com.example.cursoandroid.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}