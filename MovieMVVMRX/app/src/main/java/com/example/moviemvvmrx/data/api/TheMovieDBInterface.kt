package com.example.moviemvvmrx.data.api

import com.example.moviemvvmrx.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {
    // https://api.themoviedb.org/3/movie/popular?api_key=5a209871c6aa3d5c1fadd206bbef9b1d&page=1
    // https://api.themoviedb.org/3/movie/299534?api_key=5a209871c6aa3d5c1fadd206bbef9b1d
    // https://api.themoviedb.org/3/

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails> //single obeseverble
}