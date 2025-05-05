package `9_estructura_repetitiva_for`

fun main(){
    print("ingrese la cantidad de traiangulos")
    val num = readln().toInt()
    var mayora12 = 0
    for(i in 1..num){
        println("digite la altura")
        val altura = readln().toInt()
        println("digite la base")
        val base = readln().toInt()
        val superfice = altura * base / 2
        println("la medida del triangulo numero $num son: altura $altura, base $base y su superficie $superfice")

        if ( superfice > 12){
            mayora12++

        }
    }
    println("la cantidad de triangulos con superficie mayor  12 son $mayora12")

}