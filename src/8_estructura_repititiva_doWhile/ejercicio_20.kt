package `8_estructura_repititiva_doWhile`

fun main(){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do{
        print("ingrese el peso de la pieza (0 para finalizar)")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
        else if (peso > 0)
            cant3++
    }while (peso !=0.0)
    println("piezas aptas: $cant2")
    println("piezas con peso superior a 10.2: $cant1")
    println("piezas inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("cantidad total de piezas procesadas: $suma")


}