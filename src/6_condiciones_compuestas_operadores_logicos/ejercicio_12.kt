package `6_condiciones_compuestas_operadores_logicos`
import kotlin.math.pow

fun main(){
    print("ingrese un primer valor:")
    val num1: Double = readln().toDouble()
    print("ingrese segundo valor:")
    val num2: Double = readln().toDouble()
    println("ingrese tercer valor:")
    val num3: Double = readln().toDouble()
    if (num1>num2 && num1>num3)

    else
        if (num2>num3)
            print(num2)
    else
        print(num3)
}