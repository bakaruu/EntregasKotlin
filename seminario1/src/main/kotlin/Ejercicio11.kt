//Ejercicio 11. Crea una función que determine si dos números
// son primos relativos. Se dice que dos números son relativamente
// primos si su factor común más grande ( MCD ) es 1. Ejemplo 1:
// Los factores de 20 son 1, 2, 4, 5, 10 y 20. Los factores de 33
// son 1, 3, 11, y 33.


//UTILIZAR EUCLIDES Y SI LLEGA A 1 ANTES QUE A 0 ES PRIMO RELATIVO
fun primoRelativo(numA: Int, numB: Int) {
    var numeroA = numA
    var numeroB = numB

    while (numeroB != 0) {
        val temp = numeroB
        numeroB = numeroA % numeroB
        numeroA = temp

        if (numeroB == 1){
            return println("Es primo relativo porque el MCD es $numeroB")

        }
    }

    return println("No es primo relativo porque el MCD es $numeroA")



}