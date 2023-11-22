class Triangulo(ladoA: Int, ladoB: Int, ladoC: Int) {


    val a = ladoA
    val b = ladoB
    val c = ladoC

    fun perimetro():Int{
        val perimetro = a + b + c
        return perimetro
    }


    //tipo de triangulo

    val tipoTriangulo: String = when {
        ladoA == ladoB && ladoB == ladoC -> "Equilátero"
        ladoA == ladoB || ladoB == ladoC || ladoA == ladoC -> "Isósceles"
        else -> "Escaleno"

    }

    fun esRectangulo(): Boolean {
        if ((a * a) + (b * b) == c * c) {
            return true

        } else {
            return false
        }

    }


}