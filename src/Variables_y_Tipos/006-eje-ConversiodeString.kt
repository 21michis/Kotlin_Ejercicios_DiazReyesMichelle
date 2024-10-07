//Conversión de String a Int: Lee una cadena y conviértela a un
//entero, manejando posibles errores.

fun main() {
    print("Ingrese un número: ")
    val input = readLine()

    try {
        val number = input?.toInt() ?: throw NumberFormatException()
        println("El número ingresado es: $number")
    } catch (e: NumberFormatException) {
        println("Error: La cadena ingresada no es un número válido.")
    }
}
