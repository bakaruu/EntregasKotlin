//Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números

fun sumatoria(lista: List<Int>): Int?{

    if (lista.isEmpty()) {
        return null // Devolver null si la lista está vacía
    }

        var suma: Int = 0
        for (numero in lista){
            suma+=numero

        }

    return suma
}