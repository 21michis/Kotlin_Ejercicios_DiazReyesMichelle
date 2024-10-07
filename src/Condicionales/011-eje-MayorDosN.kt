package Condicionales

//11.Mayor de dos números: Solicita dos números y muestra el mayor de
//ellos.

fun main() {
    print("Introduce el primer número: ")
    val numero1 = readLine()?.toDoubleOrNull() ?: return

    print("Introduce el segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull() ?: return

    val mayor = if (numero1 > numero2) numero1 else numero2

    println("El mayor de los dos números es: $mayor")
}
