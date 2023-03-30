package com.Vanegas1.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCentImageView : ImageView
    private lateinit var tenCentImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private  lateinit var oneDollarImageView: ImageView
    private lateinit var cashTextView: TextView
    private var coins = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentImageView = findViewById(R.id.five_cent_imageView)
        tenCentImageView = findViewById(R.id.ten_cent_imageView)
        quarterImageView = findViewById(R.id.quarter_cent_imageView)
        oneDollarImageView = findViewById(R.id.dollar_imageView)
        cashTextView = findViewById(R.id.cash_textView)

        fiveCentImageView.setOnClickListener{
            coins += 0.05
            coins = String.format("%.2f", coins).toDouble()
            cashTextView.text = "$${coins}"
        }

        tenCentImageView.setOnClickListener{
            coins += 0.10
            coins = String.format("%.2f", coins).toDouble()
            cashTextView.text = "$${coins}"
        }

        quarterImageView.setOnClickListener{
            coins += 0.25
            coins = String.format("%.2f", coins).toDouble()
            cashTextView.text = "$${coins}"
        }

        oneDollarImageView.setOnClickListener{
            coins += 1.00
            coins = String.format("%.2f", coins).toDouble()
            cashTextView.text = "$${coins}"
        }
    }
}