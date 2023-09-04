package com.example.cursoandroid.presentation.di.module

import com.example.cursoandroid.BuildConfig
import com.example.cursoandroid.data.repository.datasource.MovieRemoteDataSource
import com.example.cursoandroid.data.repository.datasourceimpl.MovieRemoteDataSourceImpl
import com.example.cursoandroid.data.service.TMDBService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }
}