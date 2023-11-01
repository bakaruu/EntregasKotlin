//Ejercicio 10. Crea una función que calcule el término n-ésimo
// de la sucesión de Finbonacci. En matemática, la sucesión de
// Fibonacci se trata de una serie infinita de números naturales
// que empieza con un 0 y un 1 y continúa añadiendo números que
// son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21,
// 34, 55, 89, 144, 233, 377, 610, 987, 1597…


fun fibonacci(numero: Int) {
    var a = 0           //x0- 0       x1- 1      x2- 1        x3- 2
    var b = 1           //x0- 1       x1- 1      x2- 2        x3- 3

    for (x in 0..numero) {
        println("$a")   //x0- a=0     x1- a=1    x2- a=1      x3- a=2

        val tempo = a   //x0- tempo0  x1- temp1  x2- temp1    x3- temp2
        a=b             //x0- a1      x1- a1     x2- a2       x3- a3
        b= tempo +a     //x0- b1      x1- b2     x2- b3       x3- b5

    }

}