//Ejercicio 29: Crea una función que determine si una cadena de texto es un
//anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
//pero en un orden diferente.

fun anagrama(cadena: String, cadena2: String): Boolean {

    val cad1 = cadena.replace("\\s".toRegex(), "").toLowerCase()
    val cad2 = cadena2.replace("\\s".toRegex(), "").toLowerCase()


    if(cad1.toCharArray().sorted()==cad2.toCharArray().sorted()){
        return true
    }else{
        return false
    }

}