//Ejercicio 26: Crea una función que, dada una lista
// de palabras, devuelva la palabra más larga.


fun palMasLarga(lista: List<String>): String {

    var masLarga = lista[0]
    for (palabra in lista) {

        if (palabra.length > masLarga.length) {
            masLarga = palabra

        }


    }
    return masLarga

}