//clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define
//constructor, accedentes y toString.
open class Nota(val id: Int, val texto: String) {

    constructor() : this(0, "Predeterminado")

    fun obtenerId(): Int {
        return id

    }

    fun obtenerTexto(): String {
        return texto

    }

    override fun toString(): String {
        return "Id=$id, Texto=$texto"
    }


}

//clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define
//constructor, accedentes y toString.
class notaAlarma(id: Int, texto: String, var hora: String) : Nota(id, texto) {

    constructor() : this(1, "Por defecto", "23:22")

    var horaAlarma: String
        get() = hora
        set(value) {
            hora = value
        }


    override fun toString(): String {
        return "Id: $id, Nota: $texto, hora=$hora\n"
    }


}

//clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
//todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
//notas contiene el bloc de notas. Debes utilizar una colección.

class BlocNotas(var lista: MutableList<Nota> = mutableListOf()) {

    fun agregarNota(nota: Nota) {
        lista.add(nota)
    }

    fun listarNotas() {
        for ((index, nota) in lista.withIndex()) {
            println("Nota: $index, $nota")

        }
    }

    fun eliminarNota(posicion: Int) {
        if (posicion >= 0 && posicion <= lista.size) {
            lista.removeAt(posicion)
        } else {
            println("No existe la posicion indicada")
        }

    }

    fun cantidadNotas(): Int {
        return lista.size
    }


}


//clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta. .

class Prueba() {

    fun ejecutarPrueba() {
        val bloc = BlocNotas()

        val nota1 = Nota(1, "Primera nota")
        val nota2 = Nota(2, "Segunda nota")
        val nota3 = Nota(3, "Tercera nota")

        bloc.agregarNota(nota1)
        bloc.agregarNota(nota2)
        bloc.agregarNota(nota3)

        bloc.listarNotas()

        println("Cantidad de notas en el bloc: ${bloc.cantidadNotas()}")

        bloc.eliminarNota(1)

        bloc.listarNotas()

        println("Cantidad de notas en el bloc después de eliminar una nota: ${bloc.cantidadNotas()}")
    }

}