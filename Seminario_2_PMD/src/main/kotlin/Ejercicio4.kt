class Estudiantes(val nombre:String, val edad: Int, val calificaciones: List<Int>) {

    constructor():this("default", 0, listOf(0,0,0,0))
    
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Calificaciones: $calificaciones\n"
    }
}

class registro (val clase: MutableList<Estudiantes>){

    fun añadirEstu(estu:Estudiantes){
        clase.add(estu)

    }
    fun notaMedia():Int{
        var suma= 0;
        var divisor = 0
        var total= 0
        for (ele in clase){
            //si no hacemos el sum() hay que hacer un for
            //doble for para recorrer la lista de calificaciones
            suma+= ele.calificaciones.sum()
            divisor =ele.calificaciones.size
        }
        total = suma/divisor
        return total

    }

    override fun toString(): String {
        var res ="========= Lista de estudiantes ========\n"
        for (estu in clase){
            res+="$estu"

        }

        return res
    }

}