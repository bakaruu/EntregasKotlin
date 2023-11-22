//Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos
//constructores, el primero recibirá el radio y el color del círculo y el segundo
//su centro, un punto cualquiera y su color. Crear el método área() y
//sobrecargar el método toString() de forma que muestre toda la info de la
//circunferencia


class Circulo : Circunferencia {

    val color: String

    // Constructor 1
    constructor(radio: Double, centro: Punto, color: String) : super(radio, centro) {
        this.color = color
    }

    // Constructor 2
    constructor(radio: Double, centroX: Double, centroY: Double, color: String) : super(radio, centroX, centroY) {
        this.color = color
    }

    // Método para calcular el área
    fun area(): Double {
        return Math.PI * radio * radio
    }

    // Sobrecarga del método toString
    override fun toString(): String {
        return "Círculo con radio $radio\nCentro en: (${centro.x}, ${centro.y})\nColor: $color\n"
    }
}