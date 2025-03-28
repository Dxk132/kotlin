package `2_entrada_de_datos`

/*Escribir un programa en el cual se ingresan cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.*/
fun main(){
    print("escriba un primer valor:")
    val numero1: Int = readln().toInt()
    print("escriba un primer valor:")
    val numero2: Int = readln().toInt()
    print("escriba un primer valor:")
    val numero3: Int = readln().toInt()
    print("escriba un primer valor:")
    val numero4: Int = readln().toInt()
    val suma: Int = numero1 + numero2
   val promedio: Int = numero3 * numero4
    println("la suma de $numero1 y de $numero2 es: $suma")
    print("el producto de $numero3 y $numero4 es $promedio")
}