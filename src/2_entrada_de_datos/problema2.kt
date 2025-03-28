package `2_entrada_de_datos`
/*Realizar un programa que lea por teclado cuatro valores numéricos enteros e informe su suma y promedio.*/
fun main(){
    println("escriba un primer valor")
    val numero1: Int =readln().toInt()
    println("escriba un primer valor")
    val numero2: Int =readln().toInt()
    println("escriba un primer valor")
    val numero3: Int =readln().toInt()
    println("escriba un primer valor")
    val numero4: Int =readln().toInt()
    val suma: Int = numero1+numero2+numero3+numero4
    val promedio: Int = suma /4
    print("el promedio de $numero1, $numero2, $numero3 y $numero4 es $promedio")
}