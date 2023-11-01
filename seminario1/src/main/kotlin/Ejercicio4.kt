//Ejercicio 4. Crea una función que determine si una cadena de texto es un palíndromo.

fun palindromo(cadena: String): Boolean {

    if (cadena.equals(cadena.reversed(), ignoreCase = true)) {
        return true
    } else
        return false
}