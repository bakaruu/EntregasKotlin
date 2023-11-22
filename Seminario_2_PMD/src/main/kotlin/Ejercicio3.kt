//Ejercicio 3: Gestión de Contactos
//Crea una clase llamada Contacto que represente la información de un contacto en una lista de
//contactos. La clase debe tener propiedades como nombre, número de teléfono y dirección de
//correo electrónico. Luego, crea una lista de objetos Contacto y permite a los usuarios agregar,
//eliminar y mostrar contactos.


class Contacto(val nombre: String, val telefono: Int, val dirección: String) {

    override fun toString(): String {
        return "Nombre: $nombre, Telefono: $telefono, Email: $dirección"
    }
}

