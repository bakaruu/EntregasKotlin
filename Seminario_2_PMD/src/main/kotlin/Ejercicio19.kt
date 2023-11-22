//Crea la clase PNJ que representa un personaje en un juego de rol.
//La clase tendrá los atributos, nombre, PV –Puntos de Vida-, PM
//–Puntos mágicos- y LVL.
open class Pnj(
    val nombre: String,
    var puntosDeVida: Int,
    var puntosDeMagia: Int,
    var level: Int
) {

    override fun toString(): String {
        return "Nombre: $nombre\n" +
                "PV: $puntosDeVida\n" +
                "PM: $puntosDeMagia\n" +
                "Nivel del personaje: $level"
    }

}

//Crea las clases hijas de PNJ Guerrero y
//Mago. Dichas clases implementarán el método levelUp() que
//incrementa el atributo LVL del personaje y sus atributos PV y MP
//Los guerreros por cada nuevo nivel tendrán un 8% más de PV y un
//1% más de PM mientras que los magos tendrán un 4% más de PV y
//un 3% más de PM.

class PnjGuerrero(nombre: String,
                  puntosDeVida: Int,
                  puntosDeMagia: Int,
                  level: Int,
) : Pnj(nombre, puntosDeVida, puntosDeMagia, level){

    fun levelUp(cantidad: Int){
        level += cantidad

        // Incremento de PV y PM para guerreros
        val incrementoPV = (puntosDeVida * 0.08).toInt()*cantidad
        val incrementoPM = (puntosDeMagia * 0.01).toInt()*cantidad

        puntosDeVida += incrementoPV
        puntosDeMagia += incrementoPM

    }
}

class PnjMago(
    nombre: String,
    puntosDeVida: Int,
    puntosDeMagia: Int,
    level: Int
) : Pnj(nombre, puntosDeVida, puntosDeMagia, level) {


    fun levelUp(cantidad: Int) {

        level += cantidad

        // Incremento de PV y PM para magos
        val incrementoPV = (puntosDeVida * 0.04).toInt()*cantidad
        val incrementoPM = (puntosDeMagia * 0.03).toInt()*cantidad

        puntosDeVida += incrementoPV
        puntosDeMagia += incrementoPM
    }
}