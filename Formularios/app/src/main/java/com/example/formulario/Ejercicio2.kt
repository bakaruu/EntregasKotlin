package com.example.formulario

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Ejercicio2 : AppCompatActivity() {

    private lateinit var nombreLayout: TextInputLayout
    private lateinit var correoLayout: TextInputLayout
    private lateinit var contrasenaLayout: TextInputLayout
    private lateinit var nombreEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var contrasenaEditText: TextInputEditText
    private lateinit var botonEnvio: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        // Obtener referencias a los elementos de la interfaz de usuario
        nombreLayout = findViewById(R.id.nombreLayout)
        correoLayout = findViewById(R.id.correoLayout)
        contrasenaLayout = findViewById(R.id.contrasenaLayout)
        nombreEditText = findViewById(R.id.nombre)
        correoEditText = findViewById(R.id.correo)
        contrasenaEditText = findViewById(R.id.contrasena)
        botonEnvio = findViewById(R.id.botonEnvio)

        botonEnvio.setOnClickListener {
            validarFormulario()
        }
    }

    private fun validarFormulario() {
        val nombre = nombreEditText.text.toString().trim()
        val correo = correoEditText.text.toString().trim()
        val contrasena = contrasenaEditText.text.toString().trim()

        if (TextUtils.isEmpty(nombre)) {
            nombreLayout.error = "El nombre no puede estar vacío"
            return
        } else {
            nombreLayout.error = null
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
            correoLayout.error = "Correo electrónico no válido"
            return
        } else {
            correoLayout.error = null
        }

        if (contrasena.length < 6) {
            contrasenaLayout.error = "La contraseña debe tener al menos 6 caracteres"
            return
        } else {
            contrasenaLayout.error = null
        }

        // Si llegamos aquí, el formulario es válido
        enviarFormulario()
    }

    private fun enviarFormulario() {
        // Lógica para enviar el formulario
        Toast.makeText(this, "Formulario enviado", Toast.LENGTH_SHORT).show()
    }
}
