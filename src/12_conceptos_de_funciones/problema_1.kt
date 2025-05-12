package `12_conceptos_de_funciones`

fun  cuadrado(){
    println("digite un numero entero positivo")
    val num = readln().toInt()
    val resultado = num * num
    println("el cuadrado de $num es: $resultado")
    println("***********************************************")
}
fun cargamultiplicacion (){
    print("digite un primer valor:")
    val valor1 = readln().toInt()
    print("digite el segundo valor")
    val valor2 = readln().toInt()
    val multplicacion = valor1 * valor2
    println("el producto de los valores $valor1 y $valor2 es $multplicacion")
}
fun main(){
    cuadrado()
    cargamultiplicacion()
}