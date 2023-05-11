package com.example.laboratorio08av

import android.app.Application
import com.example.laboratorio08av.data.movies
import com.example.laboratorio08av.repository.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}