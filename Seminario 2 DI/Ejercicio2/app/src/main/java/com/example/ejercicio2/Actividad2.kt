package com.example.ejercicio2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)

        val textViewNumero = findViewById<TextView>(R.id.textViewNumero)
        val textViewTexto = findViewById<TextView>(R.id.textViewTexto)

        // Obtener extras del Intent
        val numero = intent.getStringExtra("numero")
        val texto = intent.getStringExtra("texto")

        // Mostrar el número y el texto en los TextView
        textViewNumero.text = "Número: $numero"
        textViewTexto.text = "Texto: $texto"
    }
}
