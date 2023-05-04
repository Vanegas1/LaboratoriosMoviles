package com.example.laboratorio07angel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratorio07angel.R
import com.example.laboratorio07angel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}