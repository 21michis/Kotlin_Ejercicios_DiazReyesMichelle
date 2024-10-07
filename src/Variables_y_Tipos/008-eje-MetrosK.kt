//Conversión de metros a kilómetros: Convierte una distancia dada
//en metros a kilómetros.

fun metrosAKilometros(metros: Double): Double {
    return metros / 1000
}

fun main() {
    val metros = 100.0
    val kilometros = metrosAKilometros(metros)
    println("$metros metros son $kilometros kilómetros")
}
