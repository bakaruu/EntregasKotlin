package com.example.practica1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MemoryTron : AppCompatActivity() {


    private lateinit var matrizTablero: Array<Array<ImageView>>
    private lateinit var contador: TextView

    private var cartaSeleccionada1: ImageView? = null
    private var cartaSeleccionada2: ImageView? = null
    private var cont = 10
    private var paraGanar = 6

    private val mazoCartas = intArrayOf(
        R.drawable.carta1,
        R.drawable.carta2,
        R.drawable.carta3,
        R.drawable.carta4,
        R.drawable.carta5,
        R.drawable.carta6,
        R.drawable.carta1,
        R.drawable.carta2,
        R.drawable.carta3,
        R.drawable.carta4,
        R.drawable.carta5,
        R.drawable.carta6

    )
    var mazoDesechable = mazoCartas.copyOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.memory_tron)

        matrizTablero = Array(3) { Array(4) { ImageView(this) } }
        contador = findViewById(R.id.textoVida)

        inicializarTablero()
        iniciaTablero()
        mezclarMazo()


        val reiniciarJuego = findViewById<Button>(R.id.Reiniciar)
        reiniciarJuego.setOnClickListener {
            reiniciarJuego()
        }


    }


    fun inicializarTablero() {
        matrizTablero[0][0] = findViewById(R.id.carta1)
        matrizTablero[0][1] = findViewById(R.id.carta2)
        matrizTablero[0][2] = findViewById(R.id.carta3)
        matrizTablero[0][3] = findViewById(R.id.carta4)
        matrizTablero[1][0] = findViewById(R.id.carta5)
        matrizTablero[1][1] = findViewById(R.id.carta6)
        matrizTablero[1][2] = findViewById(R.id.carta7)
        matrizTablero[1][3] = findViewById(R.id.carta8)
        matrizTablero[2][0] = findViewById(R.id.carta9)
        matrizTablero[2][1] = findViewById(R.id.carta10)
        matrizTablero[2][2] = findViewById(R.id.carta11)
        matrizTablero[2][3] = findViewById(R.id.carta12)

    }

    fun iniciaTablero() {
        // Asignar las cartas iniciales con el drawable "trasera"
        for (i in matrizTablero.indices) {
            for (j in matrizTablero[i].indices) {
                matrizTablero[i][j].setImageResource(R.drawable.trasera)
            }
        }
    }


    fun obtenerFila(id: Int): Int {
        return (id - R.id.carta1) / 4
    }

    fun obtenerColumna(id: Int): Int {
        return (id - R.id.carta1) % 4
    }

    fun mezclarMazo() {
        mazoDesechable.shuffle()

    }


    fun jugar(accion: View) {
        if (paraGanar != 0) {
            if (contador.text.toString().toInt() > 0) {
                if (accion is ImageView) {
                    val fila = obtenerFila(accion.id)
                    val columna = obtenerColumna(accion.id)


                    // Verificar si ya hay dos cartas seleccionadas
                    if (cartaSeleccionada1 == null) {
                        // Primer click
                        cartaSeleccionada1 = accion
                        accion.setImageResource(mazoDesechable[fila * matrizTablero[fila].size + columna])

                    } else if (cartaSeleccionada2 == null && accion != cartaSeleccionada1) {
                        // Segundo click y asegurarse de que no sea la misma carta
                        cartaSeleccionada2 = accion
                        accion.setImageResource(mazoDesechable[fila * matrizTablero[fila].size + columna])

                        // Comparar las cartas seleccionadas después de un pequeño retraso
                        Handler(Looper.getMainLooper()).postDelayed({
                            compararCartas()
                        }, 500)

                    }

                }
            }else{
                Toast.makeText(this, "HAS PERDIDO !, reinicia para volver a Jugar ", Toast.LENGTH_SHORT).show()

            }

        } else {

        }


    }

    private fun compararCartas() {
        if (cartaSeleccionada1 != null && cartaSeleccionada2 != null) {
            val idCarta1 = cartaSeleccionada1!!.id
            val idCarta2 = cartaSeleccionada2!!.id

            val fila1 = obtenerFila(idCarta1)
            val columna1 = obtenerColumna(idCarta1)
            println(idCarta1)
            println(idCarta2)
            val fila2 = obtenerFila(idCarta2)
            val columna2 = obtenerColumna(idCarta2)

            val drawable1 = mazoDesechable[fila1 * matrizTablero[fila1].size + columna1]
            val drawable2 = mazoDesechable[fila2 * matrizTablero[fila2].size + columna2]

            // Verificar si las cartas son iguales
            if (drawable1 == drawable2) {
                // Cartas iguales, mantenerlas boca arriba
                cartaSeleccionada1 = null
                cartaSeleccionada2 = null
                paraGanar--
                println(paraGanar)

            } else {
                // Cartas diferentes, volver a ponerlas boca abajo
                cartaSeleccionada1?.setImageResource(R.drawable.trasera)
                cartaSeleccionada2?.setImageResource(R.drawable.trasera)
                cartaSeleccionada1 = null
                cartaSeleccionada2 = null
                cont--
                contador.text = cont.toString()


            }
        }
    }

    fun reiniciarJuego() {
        for (fila in matrizTablero) {
            for (carta in fila) {
                carta.setImageResource(R.drawable.trasera)
            }
        }
        mezclarMazo()
        paraGanar = 6
        cont = 10
        contador.text = "10"

    }


}