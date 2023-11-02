//Ejercicio 22: Crea una función que, dado un número, devuelva
// True si es un número perfecto (la suma de sus
// divisores propios positivos es igual al número),
// o False en caso contrario.

fun numPerfecto(numero: Int): Boolean {

    var suma = 0
    for (i in 1 until numero) {
        if (numero % i == 0){
            suma+= i

        }

    }

    return if (suma== numero){
        true
    }else
        false




}