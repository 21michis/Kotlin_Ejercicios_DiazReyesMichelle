//Intercambiar dos variables: Solicita dos variables e intercambia sus
//valores.

fun main() {
    print("Ingrese el primer valor: ")
    var k = readLine()?.toIntOrNull() ?: 0

    print("Ingrese el segundo valor: ")
    var o = readLine()?.toIntOrNull() ?: 0

    println("Antes del intercambio: k = $k, o = $o")

    val temp = k
    k = o
    o = temp

    println("Después del intercambio: k = $k, o = $o")
}
