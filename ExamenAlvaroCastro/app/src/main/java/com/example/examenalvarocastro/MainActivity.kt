package com.example.examenalvarocastro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Spinner;

import android.widget.ArrayAdapter;
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.textfield.TextInputEditText



private lateinit var boton1: Button
private lateinit var boton2: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        boton1 = findViewById(R.id.añadirPokemon)
        boton2 = findViewById(R.id.verListaPokemon)

        boton1.setOnClickListener {

            startActivity(Intent(this, Pokemon::class.java))
        }

        boton2.setOnClickListener {

            startActivity(Intent(this, ListadoPokemon::class.java))
        }







    }







}