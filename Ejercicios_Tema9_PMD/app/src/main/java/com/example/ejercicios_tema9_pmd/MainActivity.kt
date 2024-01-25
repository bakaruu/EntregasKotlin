package com.example.ejercicios_tema9_pmd


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ejercicios_tema9_pmd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var ejercicio1: Button
    private lateinit var ejercicio2: Button
    private lateinit var ejercicio3: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ejercicio1 = binding.btnEjercicio1y2

        ejercicio1.setOnClickListener {
            val intent = Intent(this, Ejercicio1y2::class.java)
            startActivity(intent)
        }

        ejercicio2 = binding.btnEjercicio3

        ejercicio2.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }


    }
}