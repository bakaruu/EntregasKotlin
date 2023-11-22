//Ejercicio 5: Control de Inventario
//Crea una clase Producto que represente productos en un inventario. La clase debe tener
//propiedades como nombre del producto, precio y cantidad en stock. Luego, crea una lista de
//objetos Producto y permite a los usuarios agregar nuevos productos, actualizar el stock y
//mostrar el inventario.

class Producto(val nombre: String, val precio: Int, val cantidad: Int) {

    constructor(): this("Preestablecido", 0,  0)

    override fun toString(): String {
        return "Nombre= $nombre, Precio= $precio, Cantidad= $cantidad\n"
    }



}


class listaObjetos (val lista: MutableList<Producto>){

    fun añadirProducto(producto: Producto){
        lista.add(producto)

    }

    fun quitarObjeto (producto: Producto){

        lista.remove(producto)
    }

    override fun toString(): String {
        var res ="========= Lista de estudiantes ========\n"
        for (pro in lista){
            res+="${pro}"

        }

        return res
    }


}