//Ejercicio 15. Crear una función que reciba dos arrays de
// enteros y devuelva un array de booleanos que determine
// si los elementos, uno a uno, de ambos arrays son iguales


fun arrayBol(array1: IntArray, array2: IntArray ): BooleanArray{

    var arrayboleanos = BooleanArray(array1.size)

    for (it in 0..arrayboleanos.size-1){
        if(array1[it].equals(array2[it])){
            arrayboleanos[it]=true
        }

    }

    return arrayboleanos


}