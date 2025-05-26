package `16_funciones_parametro_por_defecto`

fun SumadeValores(a: Int = 2, sumaiNICIAL: Int = 0, num1:  Int=0): Int{
    var total = sumaiNICIAL + num1
    for (i in 1 .. a){
        println("Digite un valor:")
        val num = readln().toInt()
        total += num
    }
    return total
}
fun main(){
    println("Digite de 2 a 5 valores")
    val a = readln().toInt()
    if (a < 2){
        println("Digite 2 o màs valores")
    }else{
       val total = SumadeValores(a)
       println("El total de la suma de valores es: $total")
    }
}