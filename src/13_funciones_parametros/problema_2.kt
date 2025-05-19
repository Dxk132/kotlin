package `13_funciones_parametros`

fun mostrar_de_mayor_a_menor(num1: Int, num2: Int, num3: Int){
    when{
        num1 > num2 && num2 > num3 -> print("el primer numero es el numero uno con:$num1, el segundo el dos con:$num2 y el tercero el tres con:$num3" )
        num2 > num1 && num1 > num3 -> print("el primer numero es el numero dos con:$num2, el segundo el uno con$num1 y el tercero el tres con: $num3" )
        num3 > num2 && num2 > num1 -> print("el primer numero es el numero tres con:$num3, luego el dos con:$num2 y el uno con:$num1" )
        num1 > num3 && num3 > num2 -> print("el primer numero es el numero uno con:$num1, luego el tres con:$num3 y el dos con:$num2" )
        num2 > num3 && num3 > num1 -> print("el primer numero es el numero dos con:$num2, luego el tres con:$num3 y el 1 con:$num1" )
        num3 > num1 && num1 > num2 -> print("el primer numero es el numero tres con:$num3, luego el uno con:$num1 y el dos con:$num2" )
        num3 ==  num2 && num2 == num1 -> print("todos los numeros son iguales")

    }
}
fun main(){
    print("ingrese el primer numero:")
    val num1 = readln().toInt()
    print("ingrese el segundo numero:")
    val num2 = readln().toInt()
    print("ingrese el tercer numero:")
    val num3 = readln().toInt()
    mostrar_de_mayor_a_menor(num1, num2, num3)
}