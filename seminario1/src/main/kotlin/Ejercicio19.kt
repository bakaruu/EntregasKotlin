//Ejercicio 19: Crea una función que, dada una cadena de texto,
// elimine todas las vocales de la cadena.

fun eliminaVocales(cadena: String): String{

    val nueva = "[aeiouAEIOU]".toRegex()

    return cadena.replace(nueva, " ")

}