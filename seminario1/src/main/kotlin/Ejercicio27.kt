//Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.

fun masCorta(lista: List<String>):String{


    var mascorta = lista[0]
    for (palabra in lista) {

        if (palabra.length < mascorta.length) {
            mascorta = palabra

        }


    }
    return mascorta
}