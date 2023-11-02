import kotlin.math.pow

//Ejercicio 23: Crea una función que, dado un número entero,
// devuelva True si es un número Armstrong
// (un número que es igual a la suma de sus propios dígitos
// elevados a una potencia). Por ejemplo, 153 es un número
// Armstrong porque 1^3 + 5^3 + 3^3 = 153.

fun numeroNarcisista (numero: Int):Boolean{

    var cadena = numero.toString()
    val potencia = cadena.length

    var suma= 0.0
    for (num in cadena){
        suma+= num.toString().toDouble().pow(potencia.toDouble())


    }

    /*
    Todo el for en una linea con .map
    val suma = cadena.map { it.toString().toDouble().pow(potencia) }.sum()
    */

    return if(numero==suma.toInt()){
        true
    }else
        false
}