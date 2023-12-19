package com.example.practica1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inicioMemoryTron: Button = findViewById(R.id.Ejercicio1)
        inicioMemoryTron.setOnClickListener {
            iniciarMemoryTron()

        }

        val inicioCalculaTron: Button = findViewById(R.id.Ejercicio2)
        inicioCalculaTron.setOnClickListener {
            iniciarCalculatron()
        }


    }

    fun iniciarMemoryTron() {
        val intent = Intent(this, MemoryTron::class.java)
        startActivity(intent)
    }

    fun iniciarCalculatron() {
        val intent2 = Intent(this, CalculaTron::class.java)
        startActivity(intent2)
    }

}
