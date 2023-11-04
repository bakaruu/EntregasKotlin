//Ejercicio 31: Duplicar Elementos en una Lista
//Escribe una función que tome una lista de números y utilice la función map para
//duplicar cada número en la lista. La función debe devolver una nueva lista con
//todos los números duplicados.
//Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8].


fun duplicarEle(lista: List<Int>): List<Int> {
    val nuevaLista: List<Int> = lista.map { numero -> numero * 2 }


    return nuevaLista

}