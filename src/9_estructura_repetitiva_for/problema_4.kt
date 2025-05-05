package `9_estructura_repetitiva_for`

fun main(){

    var resultado = 0
    println("digite un numero del 1 al 10")
    val num = readln().toInt()
    if (num > 10 && num < 1){
        println("el numero ingresado no es valido")

    }else if (num < 10 && num > 1){
        println("la tabla del $num es:")
        for (i in 1..12){
            resultado = num * i
            println("$num * $i = $resultado")


        }
    }
}