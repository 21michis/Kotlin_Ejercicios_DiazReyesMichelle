//Doble y mitad: Pide un número y muestra su doble y su mitad.

fun main() {

    print("Ingrese un número: ")
    val input = readLine()

    try {
        val number = input?.toDouble() ?: throw NumberFormatException()

        val doble = number * 2
        val mitad = number / 2

        println("El doble de $number es: $doble")
        println("La mitad de $number es: $mitad")

    } catch (e: NumberFormatException) {
        println("Error: La cadena ingresada no es un número válido. ${e.message}")
    }
}
