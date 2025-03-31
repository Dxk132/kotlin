package `4_estructura_condicional_como_expresion`

fun main(){
    print("ingrese un primer valor")
    val valor1:Int = readln().toInt()
    print("ingrese un segundo valor")
    val valor2:Int = readln().toInt()
    val resultado:Int
    resultado = if(valor1>valor2) valor1 else valor2
    println ("el numero mas grande o mayor entre $valor1 y $valor2 es $resultado")
}