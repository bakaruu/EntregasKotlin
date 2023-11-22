//Define una jerarquía de clases que permita almacenar datos sobre los
//planetas y satélites que forman parte del sistema solar ( junto con el sol).
//Algunos atributos que puede ser interesante recoger son: la masa del
//cuerpo, su diámetro medio, el período de rotación sobre el propio eje,
//período de traslación alrededor del cuerpo que orbitan, distancia media a
//ese cuerpo, excentricidad de la órbita, etc.
//Define un método que, dado un objeto del sistema solar (planeta o satélite),
//imprima toda la información de que se dispone sobre el mismo.

open class CuerpoCeleste(
    val nombre: String,
    val masa: Double,
    val diametroMedio: Double,
    val periodoRotacion: Double,
    val periodoTraslacion: Double,
    val distanciaMediaAlOrigen: Double,
    val excentricidadOrbita: Double
) {
    // Método para imprimir la información del cuerpo celeste
    open fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Masa: $masa kg")
        println("Diámetro Medio: $diametroMedio km")
        println("Período de Rotación: $periodoRotacion horas")
        println("Período de Traslación: $periodoTraslacion días")
        println("Distancia Media al Origen: $distanciaMediaAlOrigen km")
        println("Excentricidad de la Órbita: $excentricidadOrbita")
        println("------------------------------")
    }


}

class Planeta(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    distanciaMediaAlOrigen: Double,
    excentricidadOrbita: Double,
    val tipo: String
) : CuerpoCeleste(
    nombre, masa, diametroMedio, periodoRotacion,
    periodoTraslacion, distanciaMediaAlOrigen, excentricidadOrbita
) {
    // Sobrescribimos el método para imprimir información específica de un planeta
    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Tipo: $tipo")
        println("------------------------------")
    }
}

class Satelite(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    distanciaMediaAlOrigen: Double,
    excentricidadOrbita: Double,
    val planetaOrbitado: Planeta
) : CuerpoCeleste(
    nombre, masa, diametroMedio, periodoRotacion,
    periodoTraslacion, distanciaMediaAlOrigen, excentricidadOrbita
) {
    // Sobrescribimos el método para imprimir información específica de un satélite
    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Planeta Orbitado: ${planetaOrbitado.nombre}")
        println("------------------------------")
    }
}