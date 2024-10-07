package Arreglos_y_Cadenas

//33.Revertir una cadena: Pide una cadena y muestra su reverso.

fun main() {
    print("Introduce una cadena: ")
    val cadena = readLine() ?: return

    val reverso = cadena.reversed()
    println("La cadena reversa es: $reverso")
}
