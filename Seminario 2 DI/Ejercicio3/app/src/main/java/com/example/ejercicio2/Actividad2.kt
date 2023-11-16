package com.example.ejercicio2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)


        val textViewDatos= findViewById<TextView>(R.id.textViewDatos)
        val listaDatos = intent.getStringArrayListExtra("listaDatos") ?: ArrayList()

        // Mostrar la lista de datos en TextView
        textViewDatos.text = listaDatos.joinToString("\n")

    }
}
