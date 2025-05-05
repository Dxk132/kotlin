package `9_estructura_repetitiva_for`

fun main(){
    var suma = 0
    for (i in 1..10){
        println("digite un numero")
        val num = readln().toInt()
        if (i>5)
            suma = suma + num

    }
        println("la suma de los ultimmos 5 digitos es $suma")
}