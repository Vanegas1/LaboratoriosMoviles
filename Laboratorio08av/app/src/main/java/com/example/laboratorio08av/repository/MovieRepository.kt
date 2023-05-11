package com.example.laboratorio08av.repository

import com.example.laboratorio08av.data.ViewModels.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {
    fun getMovies() = movies
    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)
}