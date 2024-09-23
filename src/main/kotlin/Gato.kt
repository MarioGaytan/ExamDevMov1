package org.example

// Otra clase derivada Gato que hereda de Animal, también demuestra Polimorfismo
class Gato : Animal() {

    // Sobrescribiendo el metodo sonido
    override fun sonido(): String {
        return "Maullido"
    }

    // Sobrescribiendo el metodo mostrarDetalles
    override fun mostrarDetalles() {
        println("Este es un gato llamado ${getNombre()} que hace ${sonido()}")
    }
}
