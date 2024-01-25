package com.example.ejercicios_tema9_pmd

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicios_tema9_pmd.databinding.ActivityEjercicio1y2Binding

class Ejercicio1y2 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1y2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1y2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        setupIntent()



    }

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

        binding.tvEnlace.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(binding.tvEnlace.text.toString())
            startActivity(intent) }

        binding.tvTelefono.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val movil = (it as TextView).text.toString()
            intent.data = Uri.parse("tel:" + binding.tvTelefono.text.toString())
            startActivity(intent)
        }
    }


}