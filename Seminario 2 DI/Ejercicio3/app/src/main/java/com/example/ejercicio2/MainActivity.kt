package com.example.ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val listaDatos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertarDato = findViewById<Button>(R.id.insertarDato)
        val pasarDatos = findViewById<Button>(R.id.pasarDatos)
        val text1 = findViewById<EditText>(R.id.text1)

        insertarDato.setOnClickListener {
            val dato = text1.text.toString()
            if (dato.isNotEmpty()) {
                listaDatos.add(dato)
                text1.text.clear()
            }
        }

        pasarDatos.setOnClickListener {
            val intent = Intent(this, Actividad2::class.java)
            intent.putStringArrayListExtra("listaDatos", ArrayList(listaDatos))
            startActivity(intent)
        }

    }
}