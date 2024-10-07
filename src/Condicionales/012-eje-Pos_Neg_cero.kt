package Condicionales

//12.Positivo, negativo o cero: Dado un número, indica si es positivo,
//negativo o cero.

fun main() {
    print("Introduce un número: ")
    val numero = readLine()?.toDoubleOrNull() ?: return

    when {
        numero > 0 -> println("$numero es un número positivo")
        numero < 0 -> println("$numero es un número negativo")
        else -> println("El número es cero")
    }
}
