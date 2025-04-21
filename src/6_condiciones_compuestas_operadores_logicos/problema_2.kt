package `6_condiciones_compuestas_operadores_logicos`
import kotlin.math.pow

fun main(){
    print("ingrese un primer valor")
    val num1: Double = readln().toDouble()
    println("ingrese un segundo numero")
    val num2: Double = readln().toDouble()
    println("ingrese un tercer valor numero")
    val num3: Double = readln().toDouble()
    val resultad = num1.pow( 3.0)

    if (num1==num2 && num1==num3)
    print(resultad)
    else
        println("nada que hacer")

}