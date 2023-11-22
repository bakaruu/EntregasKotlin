class Equipo(val nombre: String, val pais: String) {

    constructor():this("Por defecto", "España")

    override fun toString(): String {
        return "Nombre=$nombre, Pais='$pais\n"
    }


}