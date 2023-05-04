package com.example.laboratorio07angel

import android.app.Application
import com.example.laboratorio07angel.data.movies
import com.example.laboratorio07angel.repository.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}