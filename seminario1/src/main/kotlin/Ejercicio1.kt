//Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números

//Si queremos devolver un null tendremos que declarar el valor de retorno como Int?
//Esto hace que podamos retornar null, si no, nos da error
fun numeroMax(lista: List<Int>): Int? {

    //Cuando se ejecuta return null, la función numeroMax finaliza y regresa null.
    // Esto significa que la ejecución de la función se interrumpe y no se continuarán
    // procesando más elementos de la lista, ya que ya se ha determinado que el máximo no se
    // puede calcular en una lista vacía.
    //
    //El uso de break generalmente se asocia con bucles (como un bucle for o while) y se
    // utiliza para salir de ese bucle en particular. En este caso, no estamos dentro de un bucle,
    // y la función se detiene por completo cuando se encuentra con return null. Por lo tanto,
    // no es necesario utilizar break en este contexto.

    if (lista.isEmpty()) {
        return null // Devolver null si la lista está vacía
    }

    var max = lista[0]

    for (numero in lista) {
        if (numero > max) {
            max = numero

        }

    }

    return max
}