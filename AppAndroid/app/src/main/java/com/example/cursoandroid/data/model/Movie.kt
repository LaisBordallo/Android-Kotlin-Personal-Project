package com.example.cursoandroid.data.model

import com.google.gson.annotations.SerializedName


//Criar os atributos para o objeto Movie


data class Movie(

    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String?,
    @SerializedName("overview") val overview: String?,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("releaseDate") val releaseDate: String?,
    @SerializedName("voteAverage") val voteAverage: Double
)

