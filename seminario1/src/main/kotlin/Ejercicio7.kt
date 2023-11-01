//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto

fun capitalizacion(text: String):String {

    val textSplit = text.split(" ")
    val capitalist = textSplit.map { it.replaceFirstChar { it.uppercase() } }

    return capitalist.joinToString(" ")

}


