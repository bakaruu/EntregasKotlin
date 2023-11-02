//Ejercicio 24: Crea una función que encuentre el número
// más grande en una matriz bidimensional (una lista de listas).


fun numMasGrande(matriz: Array<Array<Int>>):Int {

    //arrayOf= mutable, tamaño fijo
    //var matriz = arrayOf(arrayOf(1, 2, 3, 5), arrayOf(3, 4, 5, 6))

    //listOf= inmutable, tamaño dinamico.
    //var lista = listOf(listOf(1,2,3), listOf(2,3,4))

    var max = matriz[0][0]

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            if (matriz[i][j] > max) {
                max = matriz[i][j]

            }
        }
    }


    return max
}