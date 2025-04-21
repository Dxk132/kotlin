package `6_condiciones_compuestas_operadores_logicos`

fun main(){
    print("ingrese un primer valor")
    val num1: Int = readln().toInt()
    print("ingrese un segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese un tercer valor")
    val num3: Int = readln().toInt()
    if (num1<10 || num2<10 || num3<10)
        print("algun numero es menor a 10")
    else
        println("ningun numero es menor a 10")
}