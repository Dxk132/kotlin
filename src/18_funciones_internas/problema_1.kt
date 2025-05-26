package `18_funciones_internas`

fun pares(){
    fun mayores(num1: Int, num2: Int):Int{
        return if (num1 > num2) num1 else num2
    }
    for (i in 1..5){
        println("ingrese el primer numero entero")
        val num1 = readln().toInt()
        println("digite el segundo numero entero")
        val num2 = readln().toInt()
        println("el mayor entre los dos es: ${mayores(num2,num1)}")
    }
}
fun main(){
    pares()
}