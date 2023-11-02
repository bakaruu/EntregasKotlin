//Ejercicio 16: Crea una función que calcule el producto de todos los
// elementos en una lista de números.


fun productoLista(lista: List<Int>): Int {

    //inicializamos en 1 para no tener el resultado siempre en 0
    var res = 1
    lista.forEach { lista ->
        res *= lista

    }
    return res
}