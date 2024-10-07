package Condicionales

//14.Edad para votar: Pregunta la edad del usuario y muestra si puede
//votar o no (mayor de 18 años).

fun main() {
    print("Introduce tu edad: ")
    val edad = readLine()?.toIntOrNull() ?: return

    if (edad >= 18) {
        println("Tienes $edad años, por lo tanto, puedes votar.")
    } else {
        println("Tienes $edad años, por lo tanto, no puedes votar.")
    }
}
