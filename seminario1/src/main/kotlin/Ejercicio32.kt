//Ejercicio 32: Crear un Diccionario a partir de Listas
//Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
//cree un diccionario utilizando mapOf para combinar las listas en un diccionario
//clave-valor. La función debe devolver el diccionario resultante.


fun diccionario(lista1: List<Int>, lista2: List<String>):Map<Int, String>{

    var diccionario = mutableMapOf<Int, String>()


    for (i in 0 until lista1.size){
        diccionario[lista1[i]] = lista2[i]

    }
    return diccionario
}