package `9_estructura_repetitiva_for`

fun main(){
    var multiplicacion = 5
    var resultado = 0
    for (i in  1..50){

        resultado = i * multiplicacion
        println("$i * $multiplicacion = $resultado")
    }

}