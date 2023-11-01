//Ejercicio 8. Crea una función que sume los dígitos de un
//número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11

fun sumaDigitos(numero: Int): Int {

    var num = numero
    var suma = 0

    while (num > 0) {
        val digito = num % 10

        suma += digito
        num /= 10

    }
    return suma


}