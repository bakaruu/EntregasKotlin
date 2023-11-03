//Ejercicio 18: Crea una función que determine si un número es primo.

fun esPrimo(numero: Int): Boolean {

    if (numero in 2..3) {
        return true //2 y 3 son primos

    }

    if(numero <= 1 || numero % 2 == 0 || numero % 3 == 0){
        return false

    }
    return true


}