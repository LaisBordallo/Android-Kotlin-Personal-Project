package com.example.cursoandroid.data.service
import com.example.cursoandroid.data.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//Criar método de request para a API TMDB.
// Dica: getMovies (apiKey:String) : Response<MovieList>

interface TMDBService {
        @GET("movie/popular")
        suspend fun getPopularMovies(@Query("api_key") apiKey:String):Response<MovieList>
}