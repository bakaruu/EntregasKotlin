
open class Planetad(val nombre:String, val tipo:String, val masa:Int){


    override fun toString(): String {
        return "Nombre: $nombre, Tipo: $tipo, Masa: $masa\n"
    }

}

class SistemaSolar(val planetas: MutableList<Planeta>){


    fun agregarPlaneta(planeta: Planeta){
        planetas.add(planeta)

    }

    fun planetaMayor(): String{

        var planetaMayorMasa = planetas[0]

        for (planeta in planetas){
            if(planeta.masa > planetaMayorMasa.masa){

                planetaMayorMasa = planeta
            }
        }

        var res = planetaMayorMasa.nombre
        return res

    }

    fun planetaMenor(): String{

        var planetaMenorMasa = planetas[0]

        for (planeta in planetas){
            if (planeta.masa < planetaMenorMasa.masa){
                planetaMenorMasa= planeta

            }

        }
        var res = planetaMenorMasa.nombre

        return res

    }

    override fun toString(): String {
        var res: String = "======== LISTADO DE PLANETAS ========\n"
        for (planeta in planetas){
            res+= "$planeta"

        }
        return res
    }

}