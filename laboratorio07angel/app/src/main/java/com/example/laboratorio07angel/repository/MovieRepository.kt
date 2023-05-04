package com.example.laboratorio07angel.repository

import com.example.laboratorio07angel.data.ViewModels.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {
    fun getMovies() = movies
    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)
}