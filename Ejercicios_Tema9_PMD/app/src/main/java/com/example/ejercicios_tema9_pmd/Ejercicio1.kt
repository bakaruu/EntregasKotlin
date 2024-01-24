package com.example.ejercicios_tema9_pmd

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicios_tema9_pmd.databinding.ActivityEjercicio1Binding

class Ejercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        fun setupIntent() {
            binding.btnAceptar.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)

                intent.putExtra(SearchManager.QUERY, binding.etNombre.text.toString())
                startActivity(intent)
            }

            binding.tvEmail.setOnClickListener {
                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("mailto:")
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(binding.tvEmail.text.toString()))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto")
                intent.putExtra(Intent.EXTRA_TEXT, "Texto del correo")

            }
        }



    }


}