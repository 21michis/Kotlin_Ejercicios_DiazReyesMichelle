package Bucles

//23.Tabla de multiplicar: Pide un número e imprime su tabla de
//multiplicar del 1 al 10.

fun main() {
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    println("Tabla de multiplicar del $numero:")
    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }
}
