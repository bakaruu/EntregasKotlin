//Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro, tipo de
//triángulo (isósceles, escaleno o equilátero). Implementar el método .rectangulo():Boolean que
//calcula si el triángulo es rectángulo. Nota (se parte de la hipótesis de que la longitud de los lados
//dados crean un triángulo)

class Triangulo (a: Double, b: Double, c:Double){
    val ladoA = 5.56
    val ladoB = 4.0
    val ladoC = 4.0

    val perimetro = a + b + c

    //tipo de triangulo

    val tipoTriangulo: String = when{
        ladoA== ladoB && ladoB == ladoC -> "Equilátero"
        ladoA== ladoB || ladoB == ladoC || ladoA == ladoC -> "Isósceles"
        else -> "Escaleno"

    }

    fun esRectangulo(): Boolean{
        if ((ladoA*ladoA) + (ladoB*ladoB)== ladoC*ladoC){
            return true

        }else{
            return false
        }

    }




}





