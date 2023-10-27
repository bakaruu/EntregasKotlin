fun main(args: Array<String>) {
    val triangulo = Triangulo(3.0, 4.0, 5.0)
    println("Perímetro: ${triangulo.perimetro}")
    println("Tipo de triángulo: ${triangulo.tipoTriangulo}")
    if (triangulo.esRectangulo()){
        println("¿Es rectángulo?: Si.")
    }else{
        println("¿Es rectángulo?: No.")
    }

}