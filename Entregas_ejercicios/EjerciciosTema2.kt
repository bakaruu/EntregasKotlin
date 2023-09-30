package com.example.kotlinopenw1

fun ejer1(){

    /*Declara una variable llamada edad y asígnale tu edad actual. Luego, declara una variable llamada
    nombre y asígnale tu nombre. Finalmente, crea una variable llamada altura y asígnale tu altura
    en metros como un número decimal. Asegúrate de que los tipos de datos de las variables sean
    apropiados.*/

    var edad: Int = 35
    val nombre: String = "Álvaro"
    val altura: Double = 1.86


}

fun ejer2(){

    /*Declara una constante llamada PI y asígnale el valor de Pi (3.14159). Luego, declara una variable
    llamada radio y asígnale un valor entero. Calcula el área de un círculo utilizando la fórmula A =
    πr^2, donde r es el radio. Asegúrate de convertir el radio a un tipo de dato adecuado antes de
    realizar la operación.*/

    val pi: Double = 3.14159
    var radio: Int = 12

    var area = pi* (Math.pow(radio.toDouble(), 2.0))

}

fun ejer3saludar(a:String, b:Int){

    /*Crea una función llamada saludar que tome dos argumentos: nombre y edad. La función debe
    imprimir un saludo que incluya el nombre y la edad de la persona. Luego, llama a esta función
    con tus propios datos.*/

    var mensaje: String = "Hola, me llamo $a y tengo  $b años"
    println(mensaje)


}

fun ejer4InformacionPersonal (nom:String, edad:Int, ciudad:String){

    /*Crea una función llamada informacionPersonal que tome tres argumentos: nombre, edad y
    ciudad. La función debe imprimir una cadena que utilice string templates para mostrar esta
    información de forma legible. Llama a la función con tus propios datos.*/

    /*HAHA YA LO HICE ARRIBA HULIO*/

    println("Buenas, me llamo $nom, tengo $edad y vivo en ${ciudad.uppercase()}")


}
// El double es para el tipo que devolvemos en el return
/*fun ejer5(grados: Double): Double{*/

fun ejer5(grados: Double){

    /*Escribe una función que convierta grados Celsius a Fahrenheit. Luego, escribe otra función que
    convierta grados Fahrenheit a Celsius.*/

    var cambio:Double = (grados * 9/5 +32)

}

fun ejer5_2(grados: Double){
    var cambio: Double =  ((grados - 32) * 5/9)
    println("$grados grados Fahrenheit son "+ "%.2f".format(cambio)+ " grados Celsius")
}

fun main(){
    ejer4InformacionPersonal("Frodo", 12, "Granada")
    ejer5(12.3)
    ejer5_2(100.2)

}





















