package com.example.moviemvvmrx.ui.single_movie_details

import androidx.lifecycle.LiveData
import com.example.moviemvvmrx.data.api.TheMovieDBInterface
import com.example.moviemvvmrx.data.repository.MovieDetailsNetworkDataSource
import com.example.moviemvvmrx.data.repository.NetworkState
import com.example.moviemvvmrx.data.vo.MovieDetails
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository (private val apiService: TheMovieDBInterface) {
    lateinit var movieDetailsNetworkDataSource: MovieDetailsNetworkDataSource

    fun  fetchSingleMovieDetails (compositeDisposable: CompositeDisposable, movieId:Int): LiveData<MovieDetails>{
        movieDetailsNetworkDataSource= MovieDetailsNetworkDataSource(apiService,compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(movieId)
        return movieDetailsNetworkDataSource.downloadedMovieResponse
    }

    fun  getMovieDetailsNetworkState(): LiveData<NetworkState>{
        return movieDetailsNetworkDataSource.networkState
    }



}