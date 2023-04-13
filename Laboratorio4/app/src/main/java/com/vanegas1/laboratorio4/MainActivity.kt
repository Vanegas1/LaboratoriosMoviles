package com.vanegas1.laboratorio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var emailEditText: TextInputEditText
    private lateinit var telEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.valueNAme)
        emailEditText = findViewById(R.id.valueCorreo)
        telEditText = findViewById(R.id.valueTelefono)
        actionNext = findViewById(R.id.button_guardar)

        actionNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("email", emailEditText.text.toString())
            intent.putExtra("tel", telEditText.text.toString())
            startActivity(intent)
        }
    }
}