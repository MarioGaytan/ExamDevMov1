package org.example

fun main() {
    // Creando una instancia de Perro
    val perro = Perro()
    perro.setNombre("Firulais")
    perro.mostrarDetalles() // Polimorfismo y Encapsulamiento en acción

    // Creando una instancia de Gato
    val gato = Gato()
    gato.setNombre("Michi")
    gato.mostrarDetalles() // Polimorfismo y Encapsulamiento en acción
}
