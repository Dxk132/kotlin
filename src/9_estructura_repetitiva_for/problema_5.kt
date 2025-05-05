package `9_estructura_repetitiva_for`

fun main(){
    var trianguloescaleno= 0
    var trianguloisoceles= 0
    var trianguloequilatero= 0
    println("ingrese el numero de triangulos")
    val num = readln().toInt()
    for (i in 1..num)
    println("digite el primer lado ")
    val lado1 = readln().toInt()
    println("digite el segundo lado ")
    val lado2 = readln().toInt()
    println("digite el tercer  lado ")
    val lado3 = readln().toInt()
    if (lado1 == lado2||lado3==lado1||lado2==lado3){
        trianguloisoceles++
    }else if (lado1 == lado2 && lado2==lado3){
        trianguloequilatero++
    }else if (lado1 != lado2 && lado2 != lado3){
        trianguloescaleno++
    }
       println("la cantidad de triangulos escalenos es:$trianguloescaleno")
    println("la cantidad de triangulos isoceles es:$trianguloisoceles")
    println("la cantidad de triangulos equilateros es:$trianguloequilatero")

}