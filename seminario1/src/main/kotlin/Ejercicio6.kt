//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.

fun cuentaSubcadena(cadena: String, opcion: String): Int {
    var contador = 0
    var posicion = cadena.indexOf(opcion)

    while (posicion != -1) {
        contador++
        posicion = cadena.indexOf(opcion, posicion + 1)
    }


    return contador
}
