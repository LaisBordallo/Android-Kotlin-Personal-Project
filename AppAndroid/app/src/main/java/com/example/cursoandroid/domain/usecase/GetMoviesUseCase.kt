package com.example.cursoandroid.domain.usecase

import com.example.cursoandroid.data.model.Movie
import com.example.cursoandroid.domain.repository.MovieRepository

//Injetar o repository no construtor, criar a função execute() que retorna List<Movie>

class GetMoviesUseCase (
    private val movieRepository: MovieRepository
        ) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}