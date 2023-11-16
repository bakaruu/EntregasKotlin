package com.example.tresenraya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    private var turnoJugador: Boolean = true // true -> jugador 1, false -> jugador 2
    private lateinit var botones: Array<Array<Button>>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botones = Array(3) { Array(3) { Button(this) } }

        inicioTablero()

        val reiniciarJuego = findViewById<Button>(R.id.reiniciar)

        reiniciarJuego.setOnClickListener {
            reiniciarJuego()
        }


    }

    fun inicioTablero() {
        botones[0][0] = findViewById(R.id.boton1)
        botones[0][1] = findViewById(R.id.boton2)
        botones[0][2] = findViewById(R.id.boton3)
        botones[1][0] = findViewById(R.id.boton4)
        botones[1][1] = findViewById(R.id.boton5)
        botones[1][2] = findViewById(R.id.boton6)
        botones[2][0] = findViewById(R.id.boton7)
        botones[2][1] = findViewById(R.id.boton8)
        botones[2][2] = findViewById(R.id.boton9)

    }

    fun jugar(v: View) {
        if (hayGanador()) {
            // Puedes mostrar un mensaje o tomar alguna acción adicional si el juego ya ha terminado
            return
        }

        if (v is Button && v.text.isBlank()) {
            // Jugador realiza su movimiento
            v.setBackgroundResource(R.drawable.y)
            v.text = "x"

            if (hayGanador()) {
                mostrarVictoriaJugador()
                return
            }

            // Máquina realiza su movimiento (movimiento aleatorio)
            realizarJugadaMaquina()

            if (hayGanador()) {
                mostrarVictoriaMaquina()
            }
        }
    }
    fun mostrarVictoriaJugador() {
        val textoScore = findViewById<TextView>(R.id.textoScore)
        textoScore.visibility = View.VISIBLE
    }
    fun mostrarVictoriaMaquina() {
        val textoScore = findViewById<TextView>(R.id.textoScoreMaquina)

        textoScore.visibility = View.VISIBLE
    }





    fun hayGanador(): Boolean {
        for (i in 0 until 3) {
            if (botones[i][0].text == botones[i][1].text && botones[i][1].text == botones[i][2].text && botones[i][0].text.isNotBlank()) {
                return true
            }

            if (botones[0][i].text == botones[1][i].text && botones[1][i].text == botones[2][i].text && botones[0][i].text.isNotBlank()) {
                return true
            }
        }

        if (botones[0][0].text == botones[1][1].text && botones[1][1].text == botones[2][2].text && botones[0][0].text.isNotBlank()) {
            return true
        }

        if (botones[0][2].text == botones[1][1].text && botones[1][1].text == botones[2][0].text && botones[0][2].text.isNotBlank()) {
            return true
        }

        return false
    }

    fun reiniciarJuego() {
        for (fila in botones) {
            for (boton in fila) {
                // Restablecer el texto a vacío
                boton.text = ""

                // Restablecer la imagen a la predeterminada 
                boton.setBackgroundResource(android.R.drawable.btn_default)
            }
        }

        val textoScore = findViewById<TextView>(R.id.textoScore)
        textoScore.visibility = View.INVISIBLE
    }

    fun realizarJugadaMaquina() {
        val random = Random()
        var fila: Int
        var columna: Int

        // Realizar un movimiento aleatorio que no esté ocupado
        do {
            fila = random.nextInt(3)
            columna = random.nextInt(3)
        } while (!botones[fila][columna].text.equals(""))

        // Realizar el movimiento de la máquina
        botones[fila][columna].setBackgroundResource(R.drawable.o)
        botones[fila][columna].text = "o"

        // Aquí puedes agregar la lógica que necesites después del movimiento de la máquina
    }


}