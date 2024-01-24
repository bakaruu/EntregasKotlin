package com.example.ejercicios_tema3_di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicios_tema3_di.databinding.ActivityEjer2Binding

class Ejercicio2: AppCompatActivity() {

    private lateinit var binding: ActivityEjer2Binding
    private lateinit var Ejercicio2Adaptador: Ejercicio2Adaptador
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityEjer2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        val fotos = listOf(
            R.drawable.alfil,
            R.drawable.peon,
            R.drawable.caballo,
            R.drawable.torre,
            R.drawable.reina,
            R.drawable.rey
        )

        val data = mutableListOf(
            Ejercicio2Ficha("Peon", R.drawable.peon),
            Ejercicio2Ficha("Caballo", R.drawable.caballo),
            Ejercicio2Ficha("Alfil", R.drawable.alfil),
            Ejercicio2Ficha("Torre", R.drawable.torre),
            Ejercicio2Ficha("Reina", R.drawable.reina),
            Ejercicio2Ficha("Rey", R.drawable.rey)

        )

        // pasamos al adaptador las listas de datos de los contactos y las fotos y el listener
        Ejercicio2Adaptador = Ejercicio2Adaptador(data, this)


        //aqui le decimos al recycleView que use el adaptador que hemos creado.
        binding.recycleView.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio2, LinearLayoutManager.HORIZONTAL, false) // mostrar el recycleView como una lista
            adapter = Ejercicio2Adaptador
        }
    }
}