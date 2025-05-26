package `18_funciones_internas`

fun multiplos2y5(){
    fun multiplo(numero: Int, valor: Int)= numero % valor == 0
    var mult2 = 0
    var mult5 = 0
    for (i in 1..10){
        print("ingrese valor:")
        val valor = readln().toInt()
        if (multiplo(valor, 5))
            mult5++
        if (multiplo(valor,2))
            mult2++
    }
    println("cantidad de multiplos de 2 es: $mult2")
    println("cantidad de multiplos de 5 es: $mult5")
}
fun main(){
    multiplos2y5()
}