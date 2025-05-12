package `11_estructura_condicional_when_con_argumento`

fun main(){
    var hijos0 = 0
    var hijos1o2 = 0
    var hijos3omas= 0
    for (i in 1..10){
        println("digite el numero de la familia #$i")
        val hijos = readln().toInt()
        when (hijos){
            in 0..0-> hijos0++
            in 1..2-> hijos1o2++
            else -> hijos3omas++
        }
    }
    println("la cantidad de familias con 0 hijos es de: $hijos0")
    println("la cantidad de familias con 1 o 2 hijos es de: $hijos1o2")
    println("la cantidad de familias con 3 o mas hijos es de: $hijos3omas")
}