package com.example.myapplication

class Planeta(var nombre:String="Pluton", var tipo: String="No planeta", var masa: Double= 10000.0){


//- Ejercicio 1. Crear la clase planeta.
// Propiedades: nombre, tipo y masa (con al menos 3 métodos)

    fun atacarConMasa(ataque:Double){
        println("Has atacado con una fuerza de: $ataque*$masa")

    }

    fun esUnPlaneta(){
        println("Pluton no era un planeta, pero ha vuelto a ser uno.")

    }

    override fun toString(): String {
        return return "Planeta(nombre: $nombre, tipo: $tipo, masa: $masa)"
    }

}