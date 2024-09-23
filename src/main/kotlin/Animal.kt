package org.example

// Clase base abstracta Animal que demuestra la Abstracción
abstract class Animal {
    // Propiedad privada, demostrando Encapsulamiento
    private var nombre: String = ""

    // Metodo para establecer el nombre
    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    // Metodo para obtener el nombre
    fun getNombre(): String {
        return nombre
    }

    // Metodo abstracto, obliga a las clases derivadas a implementarlo
    abstract fun sonido(): String

    // Metodo que se puede sobrescribir en clases derivadas
    open fun mostrarDetalles() {
        println("Animal: $nombre")
    }
}