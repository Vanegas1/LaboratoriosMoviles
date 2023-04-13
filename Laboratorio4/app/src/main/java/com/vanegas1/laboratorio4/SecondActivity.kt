package com.vanegas1.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.telephony.SmsManager
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var telTextView: TextView
    private lateinit var actionShareImplicit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second )

        nameTextView = findViewById(R.id.view_name)
        emailTextView = findViewById(R.id.view_corre)
        telTextView = findViewById(R.id.view_telefono)
        actionShareImplicit = findViewById(R.id.buttonSecond)

        var nameShared = intent.getStringExtra("name").toString()
        var emailShared = intent.getStringExtra("email").toString()
        var telShared = intent.getStringExtra("tel").toString()

        nameTextView.text = "Nombre: ${nameShared}"
        emailTextView.text = "Correo: ${emailShared}"
        telTextView.text = "Teléfono: ${telShared}"

        actionShareImplicit.setOnClickListener{
            val message = "Nombre ${nameShared}" +
                    "Correo ${emailShared}" +
                    "Teléfono ${telShared}"

            try {
                val smsManager:SmsManager
                smsManager = this.getSystemService(SmsManager::class.java)
                smsManager.sendTextMessage("88887777", null, message, null, null)
                Toast.makeText(applicationContext, "Message Sent", Toast.LENGTH_LONG).show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "Please enter all the data.."+e.message.toString(), Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}