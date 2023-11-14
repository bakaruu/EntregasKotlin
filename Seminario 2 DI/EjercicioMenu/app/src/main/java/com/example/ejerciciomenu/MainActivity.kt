package com.example.ejerciciomenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //crear la referencia del boton que queremos
        val actividad1 = findViewById<Button>(R.id.button1)

        actividad1.setOnClickListener {
            Log.d("MainActivity", "Botón presionado")

            val intent = Intent(this, Actividad1::class.java)
            startActivity(intent)

        }
    }
}