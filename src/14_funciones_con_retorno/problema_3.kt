package `14_funciones_con_retorno`

fun retornarsuperficie(lado1: Int, lado2: Int): Int{
    return lado1 * lado2
}
fun main(){
    println("ingrese el primer lado dle primer rectangulo")
    println("lado1")
    val lado1rect1 = readln().toInt()
    println("lado2")
    val lado2rect1 = readln().toInt()
    println("ingrese el primer lado del segundo  rectangulo")
    println("lado1")
    val lado1rect2 = readln().toInt()
    println("lado2")
    val lado2rect2 = readln().toInt()
    val superficierect1= retornarsuperficie(lado1rect1, lado2rect1)
    val superficierect2 = retornarsuperficie(lado1rect2, lado2rect2)
    println("la superficie del rectangulo 1 es $superficierect1 y la del segundo es $superficierect2")
    when{
        superficierect1 > superficierect2 ->
            println("el primer rectangulo tiene una superficie mayor")
        superficierect2 > superficierect1 ->
            println("el segundo rectangulo tiene una superficie mayor")
        else -> println("ambas superficies son iguales")
    }
}