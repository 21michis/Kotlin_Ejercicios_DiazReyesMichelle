package Arreglos_y_Cadenas

//35.Concatenar dos cadenas: Pide dos cadenas e imprímelas juntas.

fun main() {
    print("Introduce la primera cadena: ")
    val cadena1 = readLine() ?: return

    print("Introduce la segunda cadena: ")
    val cadena2 = readLine() ?: return

    val resultado = cadena1 + cadena2
    println("Las cadenas juntas son: $resultado")
}
