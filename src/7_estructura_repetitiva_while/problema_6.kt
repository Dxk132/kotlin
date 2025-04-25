package `7_estructura_repetitiva_while`

fun main(){
    var x_1 = 1
    var x_2 = 1
    var suma_1 = 0
    var suma_2 = 0
    while (x_1 <= 5){
        println("digite un numero para la primera lista:")
        val num_1 = readln().toInt()
        suma_1 = suma_1 + num_1
        x_1 = x_1 + 1
    }
    while (x_2 <= 5){
        println("digite un numero para la segunda lista:")
        val num_2 = readln().toInt()
        suma_2 = suma_2 + num_2
        x_2 = x_2 + 1
    }
    if (suma_1 > suma_2)
        print("la lista 1 es mayor con una cantidad de $suma_1 contra $suma_2")
    else if (suma_2 > suma_1)
        print("la lista 2 es mayor con una cantidad de $suma_2 contra $suma_1")
    else if (suma_2 == suma_1)
        print("la lista 1 y 2 tienen la misma cantidad $suma_1")
}