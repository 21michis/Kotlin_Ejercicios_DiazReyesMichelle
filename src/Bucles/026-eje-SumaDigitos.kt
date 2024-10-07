package Bucles

//26.Sumar dígitos de un número: Lee un número entero y calcula la
//suma de sus dígitos.

fun main() {
    print("Introduce un número entero: ")
    val numero = readLine()?.toIntOrNull() ?: return

    var suma = 0
    var n = Math.abs(numero) // Asegurarse de que sea positivo para evitar problemas con el signo

    while (n > 0) {
        suma += n % 10  // Sumar el último dígito
        n /= 10         // Eliminar el último dígito
    }

    println("La suma de los dígitos de $numero es: $suma")
}
