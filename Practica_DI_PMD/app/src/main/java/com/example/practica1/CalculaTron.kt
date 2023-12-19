package com.example.practica1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1.databinding.ActivityCalculatronBinding
import kotlin.random.Random

private lateinit var tvOperacion: TextView
private lateinit var etRespuesta: EditText
private lateinit var tvOperacion2: TextView
private lateinit var etRespuesta2: EditText
private lateinit var tvOperacion3: TextView
private lateinit var etRespuesta3: EditText
private lateinit var acertadas: TextView
private lateinit var falladas: TextView
private lateinit var respuestaCorrecta: String


private val key = "MY_KEY"
private lateinit var binding: ActivityCalculatronBinding


private lateinit var tvTiempo: TextView
private lateinit var countDownTimer: CountDownTimer
private var tiempoRestante: Long = 100020 // 60 segundos (en milisegundos)


private var suma = true
private var resta = false
private var multi = false

class CalculaTron : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the binding layout first
        binding = ActivityCalculatronBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("valores", Context.MODE_PRIVATE)
        val prefs = getSharedPreferences(key, 0)

        acertadas = findViewById(R.id.acertadas)
        falladas = findViewById(R.id.falladas)
        tvOperacion = binding.tvOperacion1
        etRespuesta = binding.etRespuesta1
        tvOperacion2 = binding.tvOperacion2
        etRespuesta2 = binding.etRespuesta2
        tvOperacion3 = binding.tvOperacion3
        etRespuesta3 = binding.etRespuesta3
        tvTiempo = binding.tvTiempo

        val botonesNumericos = listOf(
            binding.boton0,
            binding.boton1,
            binding.boton2,
            binding.boton3,
            binding.boton4,
            binding.boton5,
            binding.boton6,
            binding.boton7,
            binding.boton8,
            binding.boton9
        )




        botonesNumericos.forEach { boton ->
            boton.setOnClickListener {
                val focusedEditText = currentFocus as? EditText
                focusedEditText?.let {
                    agregarNumero(boton.text.toString(), it)
                }
            }
        }


        val botonIntro = binding.botonIntro
        botonIntro.setOnClickListener { verificarRespuesta1() }

        val botonC = findViewById<Button>(R.id.botonC)
        botonC.setOnClickListener {
            borrarNumero()
        }

        val botonCE = findViewById<Button>(R.id.botonCE)
        botonCE.setOnClickListener {
            borrarUltimaCifra()
        }
        generarOperacionesAleatorias()
        etRespuesta.requestFocus()

        iniciarTemporizador()


        etRespuesta.inputType = 0
        etRespuesta2.inputType = 0
        etRespuesta3.inputType = 0

        // Set OnClickListener for your buttons to handle input

        botonesNumericos.forEach { boton ->
            boton.setOnClickListener {
                handleButtonClick("1")
            }
        }


        // Set OnClickListener for your custom EditText fields if you want to enable focus programmatically
        etRespuesta.setOnClickListener { enableFocus(etRespuesta) }
        etRespuesta2.setOnClickListener { enableFocus(etRespuesta2) }
        etRespuesta3.setOnClickListener { enableFocus(etRespuesta3) }

    }


    private fun iniciarTemporizador() {
        countDownTimer = object : CountDownTimer(tiempoRestante, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tiempoRestante = millisUntilFinished
                actualizarTiempo()
            }

            override fun onFinish() {
                // Lógica cuando el tiempo llega a cero
                Toast.makeText(this@CalculaTron, "Tiempo agotado", Toast.LENGTH_SHORT).show()

                Handler().postDelayed({
                    iniciarCalculatron()
                }, 2000)

            }


        }

        countDownTimer.start()
    }

    fun iniciarCalculatron() {
        val intent2 = Intent(this, ResumenCalculatron::class.java)
        startActivity(intent2)
    }

    private fun actualizarTiempo() {
        val segundos = tiempoRestante / 1000
        tvTiempo.text = "Tiempo restante: $segundos s"
    }

    fun generarOperacionesAleatorias() {
        // Operadores disponibles: 0 para suma, 1 para resta, 2 para multiplicación
        val operadores = listOf("+", "-", "*")

        // Generar números aleatorios
        val num1 = Random.nextInt(0, 20)
        val num2 = Random.nextInt(0, 20)
        val num3 = Random.nextInt(0, 20)
        val num4 = Random.nextInt(0, 20)
        val num5 = Random.nextInt(0, 20)
        val num6 = Random.nextInt(0, 20)

        // Seleccionar aleatoriamente los operadores
        val operador1 = operadores[Random.nextInt(0, operadores.size)]
        val operador2 = operadores[Random.nextInt(0, operadores.size)]
        val operador3 = operadores[Random.nextInt(0, operadores.size)]

        // Construir las operaciones
        val operacion1 = "$num1 $operador1 $num2"
        val operacion2 = "$num3 $operador2 $num4"
        val operacion3 = "$num5 $operador3 $num6"

        // Obtener referencias a los TextView
        val tvOperacion1: TextView = findViewById(R.id.tvOperacion1)
        val tvOperacion2: TextView = findViewById(R.id.tvOperacion2)
        val tvOperacion3: TextView = findViewById(R.id.tvOperacion3)

        // Mostrar las operaciones en los TextView
        tvOperacion1.text = "$operacion1 = "
        tvOperacion2.text = "$operacion2 = "
        tvOperacion3.text = "$operacion3 = "

        // Assign the correct answer to respuestaCorrecta
        respuestaCorrecta = when {
            operador1 == "+" -> (num1 + num2).toString()
            operador1 == "-" -> (num1 - num2).toString()
            operador1 == "*" -> (num1 * num2).toString()
            else -> ""
        }
    }


    private fun agregarNumero(numero: String, focusedEditText: EditText) {
        val currentText = focusedEditText.text.toString()
        focusedEditText.setText(currentText + numero)
    }

    private fun agregarNumero2(numero: String) {
        val currentText = etRespuesta2.text.toString()
        etRespuesta2.setText(currentText + numero)
    }

    private fun agregarNumero3(numero: String) {
        val currentText = etRespuesta3.text.toString()
        etRespuesta3.setText(currentText + numero)
    }

    private fun verificarRespuesta1() {
        val respuestaUsuario = etRespuesta.text.toString()
        Log.d("Debug", "respuestaUsuario: $respuestaUsuario")
        Log.d("Debug", "respuestaCorrecta: $respuestaCorrecta")

        if (respuestaUsuario == respuestaCorrecta) {
            // Respuesta correcta
            actualizarAcertadas()
            Toast.makeText(this, "Respuesta correcta ", Toast.LENGTH_SHORT).show()
        } else {
            // Respuesta incorrecta
            actualizarFalladas()
            Toast.makeText(this, "Respuesta incorrecta ", Toast.LENGTH_SHORT).show()
        }

        Log.d("Debug", "verificarRespuesta1 called")
    }

    private fun actualizarAcertadas() {
        val textoActual = acertadas.text.toString()
        val numeroActual = textoActual.split(":")[1].trim().toInt()
        val nuevoNumero = numeroActual + 1
        acertadas.text = "Acertadas: $nuevoNumero"
    }

    private fun actualizarFalladas() {
        val textoActual = falladas.text.toString()
        val numeroActual = textoActual.split(":")[1].trim().toInt()
        val nuevoNumero = numeroActual + 1
        falladas.text = "Falladas: $nuevoNumero"
    }

    private fun borrarNumero() {
        val focusedEditText = currentFocus as? EditText
        focusedEditText?.let {
            it.text.clear()
        }
    }

    private fun borrarUltimaCifra() {
        val focusedEditText = currentFocus as? EditText
        focusedEditText?.let {
            val currentText = it.text.toString()
            if (currentText.isNotEmpty()) {
                it.setText(currentText.substring(0, currentText.length - 1))
            }
        }
    }


    private fun enableFocus(editText: EditText) {
        editText.requestFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    private fun handleButtonClick(value: String) {
        // Handle button click and append the value to the focused EditText
        val focusedEditText = currentFocus as? EditText
        focusedEditText?.append(value)
    }




}