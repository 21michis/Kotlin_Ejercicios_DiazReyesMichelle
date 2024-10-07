package Condicionales

//19.Ordenar tres números: Solicita tres números y muestra el mayor, el
//intermedio y el menor.

fun main() {
    print("Introduce el primer número: ")
    val numero1 = readLine()?.toDoubleOrNull() ?: return

    print("Introduce el segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull() ?: return

    print("Introduce el tercer número: ")
    val numero3 = readLine()?.toDoubleOrNull() ?: return

    val mayor = maxOf(numero1, numero2, numero3)
    val menor = minOf(numero1, numero2, numero3)
    val intermedio = (numero1 + numero2 + numero3) - mayor - menor

    println("Mayor: $mayor")
    println("Intermedio: $intermedio")
    println("Menor: $menor")
}
