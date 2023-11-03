//Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
//número triangular (puede representarse como un triángulo equilátero de puntos), o
//False en caso contrario.

fun numTriangular(numero: Int): Boolean {
    var suma = 0
    var n = 1

    while (suma < numero) {
        suma += n
        n++
    }

    return suma == numero
}

