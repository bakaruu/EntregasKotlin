//Ejercicio 9. Crea una función que calcule el máximo
// común divisor de dos números naturales

fun maxComunDivi(numA: Int, numB: Int): Int {
    var numeroA = numA //1v 48, 2v 18  3v 12 4v 6
    var numeroB = numB //1v 18  2v 12  3v 6  4v 0 corta bucle

    while (numeroB != 0) {
        val temp = numeroB //esto es el resto de A modulo B el cual
                            // es el MCD POR EL ALGORITMO DE EUCLIDES
                            // Cuando el resto llega a 0 sale
                            // del bucle y guarda el penultimo resto=MCD
        numeroB = numeroA % numeroB
        numeroA = temp

    }
    return numeroA

}