package com.example.cursoandroid.presentation.di.module

import com.example.cursoandroid.data.repository.MovieRepositoryImpl
import com.example.cursoandroid.data.repository.datasource.MovieRemoteDataSource
import com.example.cursoandroid.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource
    ) : MovieRepository{
        return MovieRepositoryImpl(movieRemoteDataSource)
    }
}