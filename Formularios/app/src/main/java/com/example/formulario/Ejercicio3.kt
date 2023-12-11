package com.example.formulario

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Ejercicio3 : AppCompatActivity() {

    private lateinit var nombreEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var passEditText: TextInputEditText
    private lateinit var cpEditText: TextInputEditText
    private lateinit var edadEditText: TextInputEditText
    private lateinit var insertarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreEditText = findViewById(R.id.Nombre)
        correoEditText = findViewById(R.id.correo)
        passEditText = findViewById(R.id.Pass)
        cpEditText = findViewById(R.id.Datos)
        edadEditText = findViewById(R.id.Fecha)
        insertarButton = findViewById(R.id.insertar)

        insertarButton.setOnClickListener {
            validarFormulario()
        }
    }

    private fun validarFormulario() {
        val correo = correoEditText.text.toString().trim()
        val nombre = nombreEditText.text.toString().trim()
        val pass = passEditText.text.toString().trim()
        val cp = cpEditText.text.toString().trim()
        val edadString = edadEditText.text.toString().trim()

        if (TextUtils.isEmpty(correo) || !Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
            correoEditText.error = "Correo requerido y debe ser válido"
            return
        } else {
            correoEditText.error = null
        }

        if (TextUtils.isEmpty(nombre) || nombre.length < 2) {
            nombreEditText.error = "Nombre es requerido y debe tener al menos 2 caracteres"
            return
        } else {
            nombreEditText.error = null
        }

        if (TextUtils.isEmpty(pass) || !validarPassword(pass)) {
            passEditText.error =
                "Contraseña requerida, más de siete caracteres y debe contener al menos un número, una letra mayúscula y una minúscula"
            return
        } else {
            passEditText.error = null
        }

        if (!TextUtils.isEmpty(cp) && !validarCP(cp)) {
            cpEditText.error = "Código postal inválido"
            return
        } else {
            cpEditText.error = null
        }

        if (!TextUtils.isEmpty(edadString)) {
            val edad = edadString.toInt()
            if (edad < 18) {
                edadEditText.error = "Debe ser mayor de edad"
                return
            } else {
                edadEditText.error = null
            }
        }

        // Si llegamos aquí, el formulario es válido
        Toast.makeText(this, "Formulario válido", Toast.LENGTH_SHORT).show()
    }

    private fun validarPassword(password: String): Boolean {
        val pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"
        val matcher = Regex(pattern)
        return matcher.matches(password)
    }

    private fun validarCP(cp: String): Boolean {
        return cp.length <= 5 && cp.all { it.isDigit() }
    }
}
