//Ejercicio 14. Crea una función que dado un número n imprima
// el siguiente ‘mosaico’
// (para n = 6):
// 1
// 22
// 333
// 4444
// 55555
// 666666

fun mosaico(numero: Int): Unit {

    //opcion valida
//    for (i in 1..numero) {
//        val number = Integer.parseInt(i.toString().repeat(i))
//        println(number)
//    }



    for (i in 1..numero){
        var num = 0
        for (j in 1 ..  i){
            num= num*10+i
        }
        println(num)
    }

}