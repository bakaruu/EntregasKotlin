package com.example.ejercicios_tema4

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicios_tema4.databinding.ActivityEjercicio1Binding


class Ejercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_ejercicio1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_send) {
            Toast.makeText(this, "Enviando...", Toast.LENGTH_SHORT).show()
        }

        if(item.itemId == R.id.action_edit){
            Toast.makeText(this, "Editando...", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}