package com.example.cursoandroid.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cursoandroid.domain.usecase.GetMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel

class MovieViewModel @Inject constructor(
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel() {

    fun getMovies() = liveData {
        val response = getMoviesUseCase.execute()
        if (response != null) {
            emit(response)
        }
    }
}
