//Ejercicio 12. Crea una función que determine si un número dado es capicúa


fun capicua(numero: Int): Unit {

    var cambio = numero.toString()
    //.reversed no modifica la original.
    var vuelta = cambio.reversed().toInt()

    if (numero == vuelta) {

        println("Es capicua")
    } else {

        println("No es capicua")
    }


}