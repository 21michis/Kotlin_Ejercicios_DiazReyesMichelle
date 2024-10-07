package Condicionales

//16.Calificación: Dada una calificación numérica (0-100), convierte y
//muestra la letra correspondiente (A, B, C, D o F).

fun main() {
    print("Introduce una calificación numérica (0-100): ")
    val calificacion = readLine()?.toIntOrNull() ?: return

    val letra = when {
        calificacion in 90..100 -> "A"
        calificacion in 80..89 -> "B"
        calificacion in 70..79 -> "C"
        calificacion in 60..69 -> "D"
        calificacion in 0..59 -> "F"
        else -> "Calificación no válida. Debe estar entre 0 y 100."
    }

    println("La calificación correspondiente es: $letra")
}
