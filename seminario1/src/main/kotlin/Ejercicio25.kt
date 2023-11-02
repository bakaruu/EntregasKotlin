//Ejercicio 25: Crea una función que encuentre el número
// más pequeño en una matriz bidimensional (una lista de listas).

fun numMasPeque(matriz: Array<Array<Int>>):Int {


    var max = matriz[0][0]

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            if (matriz[i][j] < max) {
                max = matriz[i][j]

            }
        }
    }


    return max
}