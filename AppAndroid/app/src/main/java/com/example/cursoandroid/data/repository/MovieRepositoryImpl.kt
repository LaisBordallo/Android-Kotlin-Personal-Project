package com.example.cursoandroid.data.repository

import android.util.Log
import com.example.cursoandroid.data.model.Movie
import com.example.cursoandroid.data.repository.datasource.MovieRemoteDataSource
import com.example.cursoandroid.domain.repository.MovieRepository

//Implementa a interface MovieRepository, escreva a implementação do método getMovies()
//retornando List<Movie>, lembrar de injetar o remote data source no construtor

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null){
                movieList = body.movies
            }
        } catch (ex:Exception){
        Log.i("MyTag", "getMovies: ", ex)
        }
        return movieList

    }

}