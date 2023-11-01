//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un texto

fun contar(texto: String, letra: Char): Int {

    var contador: Int = 0
    for (caracter in texto) {
        if (caracter == letra) {
            contador++

        }

    }

    return contador
}
