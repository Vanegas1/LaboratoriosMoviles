package com.Vanegas1.Laboratorio6aV.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.Vanegas1.Laboratorio6aV.MovieReviewerApplication
import com.Vanegas1.Laboratorio6aV.data.model.MovieModel
import com.Vanegas1.Laboratorio6aV.repositories.MovieRepository

class MovieViewModel(private val repository: MovieRepository) : ViewModel() {
    fun getMovies() = repository.getMovies()
    fun addMovies(movie: MovieModel) = repository.addMovies(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}