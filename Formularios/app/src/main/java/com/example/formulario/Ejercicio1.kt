package com.example.formulario

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Ejercicio1 : AppCompatActivity() {

    private lateinit var nombreLayout: TextInputLayout
    private lateinit var edadLayout: TextInputLayout
    private lateinit var nombreEditText: TextInputEditText
    private lateinit var edadEditText: TextInputEditText
    private lateinit var insertarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        insertarButton = findViewById(R.id.insertar)

        insertarButton.setOnClickListener {
            validarFormulario()
        }
    }

    private fun validarFormulario() {
        val nombre = nombreEditText.text.toString().trim()
        val edadString = edadEditText.text.toString().trim()

        if (TextUtils.isEmpty(nombre) || nombre.length < 2) {
            nombreLayout.error = "Nombre es requerido y debe tener al menos 2 caracteres"
            return
        } else {
            nombreLayout.error = null
        }



        if (!TextUtils.isEmpty(edadString)) {
            val edad = edadString.toInt()
            if (edad < 18) {
                edadLayout.error = "Debe ser mayor de edad"
                return
            } else {
                edadLayout.error = null
            }
        }


        Toast.makeText(this, "Formulario válido", Toast.LENGTH_SHORT).show()
    }
}
