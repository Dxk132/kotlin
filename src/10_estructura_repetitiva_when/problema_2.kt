package `10_estructura_repetitiva_when`

fun main(){
    var mayor = 0
    for (i in 1..5){
        println("ingrese le primer valor")
        val valor1 = readln().toInt()
        println("ingrese le segundo valor")
        val valor2 = readln().toInt()
        println("ingrese le tercer valor")
        val valor3 = readln().toInt()
        when{
            valor1 > valor2 && valor1 > valor3 ->{
                println("el valor mayor es valor 1 con $valor1")
                mayor += valor1
            }
            valor2 > valor1 && valor2 > valor3->{
                println("el valor mayor es valor 2 con $valor2")
                mayor += valor2
            }
            valor3 > valor1 && valor3 > valor2->{
                println("el  valor mayor es valor 3 con $valor3")
                mayor += valor3
            }
            else->{
                println("todos los valores son igules")
                mayor += 0
            }
        }
    }

    println("la suma de todos los valores es $mayor ")
}