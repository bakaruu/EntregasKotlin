//Ejercicio 20: Crea una función que calcule el factorial de un número.

fun factorialN(numero: Int): Int {
    var res = 1
    var it = 1
    while (it  <= numero) {
        res *= it
        it++
    }

    return res

}