package com.example.ejercicios_tema3_di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicios_tema3_di.databinding.ActivityEjer1Binding

class Ejercicio1: AppCompatActivity() {

    private lateinit var binding: ActivityEjer1Binding
    private lateinit var Ejercicio1Adaptador: Ejercicio1Adaptador


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjer1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //lista de fotos para ir añadiendo automaticamente conforme vaya añadiendo al recycleView
        val fotos = listOf(
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5,
            R.drawable.avatar6,
            R.drawable.avatar7,
            R.drawable.avatar8
        )

        //lista de informacion de los contactos para ir añadiendo automaticamente conforme vaya añadiendo al recycleView
        val data = mutableListOf(
            Ejercicio1Contacto("Paco el justo", "paco@xmail.com", "111111111", R.drawable.avatar1),
            Ejercicio1Contacto("Maria", "maria@xmail.com", "222222222", R.drawable.avatar2),
            Ejercicio1Contacto("Pepe el nervios", "pepe@xmail.com", "333333333", R.drawable.avatar3),
            Ejercicio1Contacto("Manu", "raveroMaximo@xmail.com", "444444444", R.drawable.avatar4),
            Ejercicio1Contacto("Raul", "Raul@xmail.com", "555555555", R.drawable.avatar5),
            Ejercicio1Contacto("Pablo", "Pablo@xmail.com", "666666666", R.drawable.avatar6),
            Ejercicio1Contacto("Franco", "Franco@xmail.com", "777777777", R.drawable.avatar7),
            Ejercicio1Contacto("Hitler", "Hitler@xmail.com", "888888888", R.drawable.avatar8)

        )

        // pasamos al adaptador las listas de datos de los contactos y las fotos y el listener
        Ejercicio1Adaptador = Ejercicio1Adaptador(data, fotos, this)

        //aqui le decimos al recycleView que use el adaptador que hemos creado.
        binding.recycleView.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio1) // mostrar el recycleView como una lista
            adapter = Ejercicio1Adaptador
        }
    }
}