package org.example

// Clase derivada Perro que hereda de Animal, demostrando Herencia
class Perro : Animal() {

    // Sobrescribiendo el metodo sonido, demostrando Polimorfismo
    override fun sonido(): String {
        return "Ladrido"
    }

    // Sobrescribiendo el metodo mostrarDetalles para proporcionar más detalles
    override fun mostrarDetalles() {
        println("Este es un perro llamado ${getNombre()} que hace ${sonido()}")
    }
}