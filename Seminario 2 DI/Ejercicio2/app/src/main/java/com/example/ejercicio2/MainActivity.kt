package com.example.ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTexto = findViewById<EditText>(R.id.editTexto)
        val editNumero = findViewById<EditText>(R.id.editNumero)
        val botonSiguiente = findViewById<Button>(R.id.botonSiguiente)

        botonSiguiente.setOnClickListener {
            val textoIngresado = editTexto.text.toString()
            val numeroIngresado = editNumero.text.toString()

            // Crear un Intent para iniciar la segunda actividad
            val intent = Intent(this, Actividad2::class.java)

            // Poner el número y el texto como extras en el Intent
            intent.putExtra("numero", numeroIngresado)
            intent.putExtra("texto", textoIngresado)

            // Iniciar la segunda actividad
            startActivity(intent)
        }
    }
}