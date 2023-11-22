import kotlin.random.Random


fun main(args: Array<String>) {


    //Ejercicio1
//    val sistemaSolar = SistemaSolar(mutableListOf())
//
//    sistemaSolar.agregarPlaneta(Planeta("Mercurio", "Rocoso", 45000))
//    sistemaSolar.agregarPlaneta(Planeta("Venus", "Gaseoso", 2400))
//    sistemaSolar.agregarPlaneta(Planeta("La Tierra", "Rocoso", 33000))
//    sistemaSolar.agregarPlaneta(Planeta("Júpiter", "Gaseoso", 123000))
//    sistemaSolar.agregarPlaneta(Planeta("Urano", "Rocoso", 190))
//
//    val mayorMasa = sistemaSolar.planetaMayor()
//    val menorMasa = sistemaSolar.planetaMenor()
//    println("El planeta con mayor masa es: $mayorMasa")
//    println("El planeta con menor masa es: $menorMasa")
//    println(sistemaSolar)


    //Ejercicio2
//    val opcion1 = Triangulo(6, 8, 10)
//    val peri =opcion1.perimetro()
//    val tipo = opcion1.tipoTriangulo
//    val rect = opcion1.esRectangulo()
//
//
//    println("El perimetro del triangulo pasado es: $peri")
//    println("Tipo de triangulo: $tipo")
//    println("Es rectangulo?: $rect")

    //Ejercicio3
//    var lista : MutableList<Contacto> = mutableListOf()
//
//    lista.add(Contacto("Juan", 1234578, "contacto1@hotmail.com"))
//    lista.add(Contacto("Loco", 2233578, "contacto2@hotmail.com"))
//    lista.add(Contacto("SErgio", 3234578, "contacto3@hotmail.com"))
//
//    var res = ""
//    lista.removeAt(2)
//
//    for (contacto in lista){
//        res+= "$contacto\n"
//
//    }
//    println(res)


    //Ejercicio4

//    var lista = registro(mutableListOf())
//
//    lista.añadirEstu(Estudiantes("Sergio", 18, listOf(1, 2, 3)))
//    lista.añadirEstu(Estudiantes("Juan", 20, listOf(90, 85, 92)))
//    lista.añadirEstu(Estudiantes("María", 22, listOf(78, 88, 95)))
//    lista.añadirEstu(Estudiantes("Carlos", 21, listOf(85, 89, 93)))
//
//
//    println(lista)
//    println("La nota media de la clase es: ${lista.notaMedia()}")

    //Ejercicio5
//    var lista = listaObjetos(mutableListOf())
//
//    val producto1 = Producto("hola", 2, 4)
//    lista.añadirProducto(Producto("Objeto1", 12, 2))
//    lista.añadirProducto(Producto("Objeto2", 4, 52))
//    lista.añadirProducto(Producto("Objeto3", 6, 12))
//    lista.añadirProducto(producto1)
//
//
//    println(lista)
//    lista.quitarObjeto(producto1)


    //Ejerecicio6
//    val listaDePlanetas: MutableList<Planeta> = mutableListOf()
//
//    listaDePlanetas.add(Planeta("Mercurio", "Rocoso", 330))
//    listaDePlanetas.add(Planeta("Venus", "Gaseoso", 4500))
//    listaDePlanetas.add(Planeta("Tierra", "Rocoso", 597))
//    listaDePlanetas.add(Planeta("Marte", "Rocoso", 641))
//    listaDePlanetas.add(Planeta("Júpiter", "Gaseoso", 1898600))
//    listaDePlanetas.add(Planeta("Saturno", "Gaseoso", 568460000))
//    listaDePlanetas.add(Planeta("Urano", "Rocoso", 86832))
//    listaDePlanetas.add(Planeta("Neptuno", "Gaseoso", 102430000))

    //Ejercicio7 Muestra por pantalla toda la información de todos los planetas

//    for (pla in listaDePlanetas){
//        println(pla)
//    }


    //Ejercicio8 Muestra por pantalla todos los planetas que empiecen por la letra ‘M’
//    for (pla in listaDePlanetas){
//        if(pla.nombre.startsWith("m", ignoreCase = true)){
//            println(pla)
//
//        }
//    }

    //Ejercicio9 Muestra por pantalla todos los planetas gaseosos cuya masa sea superior a 20
    //veces la de la tierra

//    for (pla in listaDePlanetas) {
//        if (pla.masa > listaDePlanetas[2].masa * 20 && pla.tipo.equals("Gaseoso")) {
//            println(pla)
//        }
//
//    }

    //Ejercicio10 Muestra por pantalla la masa media de los planetas del sistema solar
//    var sum = 0
//    for (pla in listaDePlanetas) {
//        sum += pla.masa
//
//    }
//
//    println(sum / listaDePlanetas.size)

//    Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no puede
//    haber más de cuatro equipos por país)

//    val listaFutbol: List<Equipo> = listOf(
//        Equipo("Real Madrid", "España"),
//        Equipo("Betis", "España"),
//        Equipo("Barcelona", "España"),
//        Equipo("Granada", "España"),
//        Equipo("Manchester", "Inglaterra"),
//        Equipo("Arsenal", "Inglaterra"),
//        Equipo("Aston Villa", "Inglaterra"),
//        Equipo("Chelsea", "Inglaterra"),
//        Equipo("Bayer de Munich", "Alemania"),
//        Equipo("Borusia de Dortmund", "Alemania"),
//        Equipo("Schalke 04", "Alemania"),
//        Equipo("Colonia", "Alemania"),
//        Equipo("Milan", "Italia"),
//        Equipo("Juventus", "Italia"),
//        Equipo("Genoa", "Italia"),
//        Equipo("Fiorentina", "Italia")
//    )
//
//
//    //Ejercicio 13. Crea la función championsLeague() que recibe como entrada la lista con
//    //los 16 equipos y muestra por pantalla un sorteo de octavos* de final de la Champions.
//    //*(no tengas en cuenta que equipos de un mismo país no pueden enfrentarse)
//    fun championsLeague(lista: List<Equipo>) {
//        // Crear una copia de la lista original para no afectarla
//        val listaCopia = lista.toMutableList()
//
//        println("Sorteo de octavos de final de la Champions League:")
//
//        for (i in 1..8) {
//            val equipoLocal = listaCopia.removeAt((0 until listaCopia.size).random())
//            val equipoVisitante = listaCopia.removeAt((0 until listaCopia.size).random())
//
//            println("Partido $i: ${equipoLocal.nombre} vs ${equipoVisitante.nombre}")
//        }
//    }
//
//    championsLeague(listaFutbol)


    //Ejercicio14/5
    // Crear una circunferencia utilizando el constructor primario
//    val circunferencia1 = Circunferencia(5.0, Punto(2.0, 3.0))
//
//
//    // Imprimir información de las circunferencias
//    println("Información de la Circunferencia 1:")
//    println(circunferencia1.toString())
//    println("Longitud de la circunferencia 1: ${circunferencia1.longitud()}")
//    println()
//
//
//    // Crear un círculo utilizando el constructor primario
//    val circulo1 = Circulo(5.0, Punto(2.0, 3.0), "Rojo")
//
//
//    // Imprimir información de los círculos
//    println("Información del Círculo 1:")
//    println(circulo1.toString())
//    println("Área del círculo 1: ${circulo1.area()}")
//    println()


    //Ejercicio 17

//    val prueba = Prueba()
//    prueba.ejecutarPrueba()

    //Ejercicio18
    // Crear instancias de planetas y satélites
//    val tierra = Planeta("Tierra", 5.972e24, 12742.0, 24.0, 365.25, 147.1e6, 0.017, "Terrestre")
//    val luna = Satelite("Luna", 7.342e22, 3474.0, 27.3, 27.3, 384.4e3, 0.055, tierra)
//
//    // Imprimir información
//    tierra.imprimirInformacion()
//    luna.imprimirInformacion()


    //Ejercicio19
    val guerrero = PnjGuerrero("Guerrero1", 1600, 50, 1)
    val mago = PnjMago("Mago1", 1600, 150, 1)

    println("Estado inicial del guerrero:")
    println(guerrero)

    guerrero.levelUp(20)

    println("\nEstado del guerrero después de levelUp:")
    println(guerrero)

    println("\nEstado inicial del mago:")
    println(mago)

    mago.levelUp(20)

    println("\nEstado del mago después de levelUp:")
    println(mago)


    //Ejercicio20
}

