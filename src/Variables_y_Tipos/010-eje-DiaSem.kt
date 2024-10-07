//10.Día de la semana: Pide un número del 1 al 7 y muestra el día de la
//semana correspondiente.

fun main() {
    print("Introduce un número del 1 al 7: ")
    val numero = readLine()?.toIntOrNull() ?: return

    val diaSemana = when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número no válido. Debes introducir un número del 1 al 7."
    }

    println(diaSemana)
}
