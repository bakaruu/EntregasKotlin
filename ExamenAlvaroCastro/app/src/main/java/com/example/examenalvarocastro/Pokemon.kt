package com.example.examenalvarocastro

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.DatePicker
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.examenalvarocastro.databinding.ActivityPokemonBinding
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

private lateinit var nombreEditText: TextInputEditText
private lateinit var entrenadorEditText: TextInputEditText
private lateinit var estaturaEditText: TextInputEditText
private lateinit var añadirPokemon: Button


private lateinit var fechaAtrapadoLayout: TextInputLayout
private lateinit var fechaAtrapadoEditText: TextInputEditText

private lateinit var bind: ActivityPokemonBinding

class Pokemon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_pokemon)


        nombreEditText = findViewById(R.id.nombreInput)
        entrenadorEditText = findViewById(R.id.entrenadorInput)
        estaturaEditText = findViewById(R.id.estaturaInput)

        añadirPokemon = findViewById(R.id.añadirPokemon)


        valido()

        // Obtén el Spinner desde el diseño
        val spinnerTipos: Spinner = findViewById(R.id.spinnerTipos)

        // Obtén la lista de tipos desde resources
        val tiposArray = resources.getStringArray(R.array.tipos_pokemon)

        // Crea un ArrayAdapter utilizando la lista de tipos
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, tiposArray)

        // Especifica el diseño del drop-down
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Establece el adaptador en el Spinner
        spinnerTipos.adapter = adapter


    }


    private fun validarForm(): Triple<Boolean, String, List<String>> {
        var isValid = true
        val nombre = nombreEditText.text.toString().trim()
        val entrenador = entrenadorEditText.text.toString().trim()
        val estatura = estaturaEditText.text.toString().trim()


        val datosPokemon = mutableListOf<String>()


        //Validar nombre
        if (nombre.isEmpty() || nombre[0].isLowerCase() || nombre.length > 3) {
            isValid = false
        }

        //validar Entrenador

        val regexVocal = Regex("[aeiouAEIOU]")
        if (entrenador.length > 25 && !regexVocal.containsMatchIn(entrenador)) {
            isValid = false

        }

        //validar Estatura
        if (estatura.length > 5) {
            isValid = false

        }




        return Triple(isValid, "Datos", datosPokemon)
    }


    private fun valido() {
        añadirPokemon.setOnClickListener {
            val (isValid, errorTitle, datosPokemon) = validarForm()

            val intent = Intent(this, ListadoPokemon::class.java)
            intent.putExtra("errorTitle", errorTitle)
            intent.putStringArrayListExtra("errores", ArrayList(datosPokemon))
            startActivity(intent)
        }
    }
}











}