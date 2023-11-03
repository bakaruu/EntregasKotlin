//Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
//caracteres alfabéticos (letras) y espacios en blanco.

fun soloTexto(cadena: String):Boolean{

    return cadena.matches(Regex("^[A-Za-z ]+\$"))

}