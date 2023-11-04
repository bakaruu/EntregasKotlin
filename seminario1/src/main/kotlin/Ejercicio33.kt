//Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
//binario sin utilizar funciones propias del lenguaje que lo hagan directamente.


fun decToBin(numero: Int):Int{

    var binario = 0
    var base = 1

    var num = numero
    while (num > 0) {
        val digito = numero % 2
        binario += digito * base
        base *= 10
        num /= 2
    }

    return binario

}