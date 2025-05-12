package `12_conceptos_de_funciones`

fun menor(){
    println("ingrese el primer valor")
    val valor1 = readln().toInt()
    println("ingrese el segundo valor")
    val valor2 = readln().toInt()
    println("ingrese el tercer valor")
    val valor3 = readln().toInt()
    when{
        valor1 < valor2 && valor1 < valor3 ->{
            println("el valor menor es valor 1 con $valor1")
        }
        valor2 < valor1 && valor2 < valor3->{
            println("el valor menor es valor 2 con $valor2")
        }
        valor3 < valor1 && valor3 < valor2->{
            println("el  valor menor es valor 3 con $valor3")
        }
        else->{
            println("todos los valores son igules")
        }
    }
    println("**************************************************************")
}
fun main(){
    menor()
    menor()
}