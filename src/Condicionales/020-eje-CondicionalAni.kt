package Condicionales

//20.Condicional anidado: Pide un número del 1 al 12 y muestra el mes
//correspondiente.

fun main() {
    print("Introduce un número del 1 al 12: ")
    val numero = readLine()?.toIntOrNull() ?: return

    val mes = when (numero) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Número no válido. Debes introducir un número del 1 al 12."
    }

    println(mes)
}
