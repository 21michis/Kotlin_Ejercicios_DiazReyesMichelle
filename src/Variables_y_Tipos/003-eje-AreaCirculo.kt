//Ejercicio 3
/*Área de un círculo: Escribe un programa que calcule el área de un
círculo, dado su radio.*/

fun main(){
    println("Escribe el radio del circulo: ");
    val radio = readln().toDouble();
    val pi = 3.14
    //var radio = 5.2
    val areacirculo = 2 * pi * radio

    println("Area del circulo es " + areacirculo)
}

