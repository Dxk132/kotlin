package `6_condiciones_compuestas_operadores_logicos`

fun main(){
    print("ingrese un primer valor")
    val num1: Int = readln().toInt()
    print("ingrese un segundo valor")
    val num2: Int = readln().toInt()
    print("ingrese un tercer valor")
    val num3: Int = readln().toInt()
    val mayor = if (num1>num2 && num1>num3)num1 else if(num2>num1 && num2>num3)num2 else num3
    val menor =  if (num1<num2 && num1<num3)num1 else if (num2<num1 && num2<num3)num2 else num3
    println("el numero mayor es $mayor")
    print("el numero menor es $menor")

}