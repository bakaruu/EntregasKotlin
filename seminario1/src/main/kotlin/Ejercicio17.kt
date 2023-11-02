//Ejercicio 17: Crea una función que dada una lista de números, devuelva
// una nueva lista con solo los números pares.

fun soloPares(lista: List<Int>): List<Int> {

    return lista.filter { it % 2 == 0 }


}