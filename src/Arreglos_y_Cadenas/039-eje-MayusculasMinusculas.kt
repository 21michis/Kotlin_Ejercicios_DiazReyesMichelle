package Arreglos_y_Cadenas

//39.Mayúsculas a minúsculas: Convierte una cadena dada a
//minúsculas.

fun main() {
    print("Introduce una cadena: ")
    val cadena = readLine() ?: return

    val cadenaMinusculas = cadena.lowercase()
    println("La cadena en minúsculas es: $cadenaMinusculas")
}
