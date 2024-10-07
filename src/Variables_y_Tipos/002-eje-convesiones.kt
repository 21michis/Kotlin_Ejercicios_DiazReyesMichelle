package Variables_y_Tipos

//Conversión de grados Celsius a Fahrenheit: Crea un programa que
//convierta una temperatura dada en grados Celsius a Fahrenheit.

fun main() {
    // Solicitar al usuario que ingrese la temperatura en Celsius
    println("Introduce la temperatura en grados Celsius:")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        // Convertir Celsius a Fahrenheit
        val fahrenheit = celsius * 9/5 + 32
        println("$celsius grados Celsius son $fahrenheit grados Fahrenheit.")
    } else {
        println("Por favor, introduce un número válido.")
    }
}
