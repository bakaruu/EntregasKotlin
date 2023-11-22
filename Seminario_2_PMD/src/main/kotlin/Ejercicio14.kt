import kotlin.math.PI
import kotlin.math.hypot

//Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el radio de
//la circunferencia y el secundario recibirá la posición del centro de la circunferencia y
//un punto cualquiera de la misma. Crear el método longitud() y sobrecargar el método
//toString() de forma que muestre toda la info de la circunferencia


class Punto(val x: Double, val y: Double)
open class Circunferencia(val radio: Double, val centro: Punto) {

    // Constructor secundario
    constructor(radio: Double, centroX: Double, centroY: Double) : this(radio, Punto(centroX, centroY))

    // Método para calcular la longitud
    fun longitud(): Double {
        return 2 * PI * radio
    }

    // Sobrecarga del método toString
    override fun toString(): String {
        return "Circunferencia con radio $radio\nCentro en: (${centro.x}, ${centro.y})\n"
    }

}