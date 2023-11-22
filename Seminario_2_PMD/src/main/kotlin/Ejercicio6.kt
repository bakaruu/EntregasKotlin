//Ejercicio 6. Crea una lista con los nueve planeta del Sistema Solar.
//Usa la clase planeta creada en el ejercicio 1


class SisSolar(val lista: MutableList<Planeta>){
    fun agregarPlaneta(planeta: Planeta){
        lista.add(planeta)
    }

}