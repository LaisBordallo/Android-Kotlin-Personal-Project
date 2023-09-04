package com.example.cursoandroid.data.repository.datasourceimpl

import com.example.cursoandroid.data.model.MovieList
import com.example.cursoandroid.data.repository.datasource.MovieRemoteDataSource
import com.example.cursoandroid.data.service.TMDBService
import retrofit2.Response

class MovieRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey:String
    ) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}