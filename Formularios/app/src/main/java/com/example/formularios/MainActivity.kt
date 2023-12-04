package com.example.formularios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }



    fun validname(validar:EditText):Boolean{
        var isValid = true


        //validar longitud

        if(validar.text.length<2){
            validar.error = "El nombre tiene que tener minimo dos caracteres"
            isValid = false

        }

        val Nombre = findViewById<TextInputLayout>(R.id.Nombre)
        val inputNombre = findViewById<TextInputEditText>(R.id.inputNombre)
        //validar nombre
        val nom = validar.text.toString().trim()
        if(nom.isEmpty()){
            Nombre.error = "Ingrese su nombre"
            isValid= false

        }else{
            Nombre.error= null

        }

        return isValid

    }
}