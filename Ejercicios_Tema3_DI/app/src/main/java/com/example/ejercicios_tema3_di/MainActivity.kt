package com.example.ejercicios_tema3_di

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ejercicios_tema3_di.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var btnEjer1: Button
    private lateinit var btnEjer2: Button
    private lateinit var btnEjer3: Button
    private lateinit var btnEjer4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        btnEjer1 = binding.btnEjercicio1
        btnEjer2 = binding.btnEjercicio2
        btnEjer3 = binding.btnEjercicio3
        btnEjer4 = binding.btnEjercicio4

        btnEjer1.setOnClickListener {
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }
        btnEjer2.setOnClickListener {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }
        btnEjer3.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }
        btnEjer4.setOnClickListener {
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }


    }
}