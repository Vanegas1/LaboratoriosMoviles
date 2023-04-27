package com.example.laboratorio5av

import android.app.Application
import com.example.laboratorio5av.data.movies
import com.example.laboratorio5av.repositories.MovieRepository

class MovieReviewApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}