//Número par o impar: Lee un número y determina si es par o impar.

fun main() {
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero % 2 == 0) {
        println("$numero es un número par")
    } else {
        println("$numero es un número impar")
    }
}
