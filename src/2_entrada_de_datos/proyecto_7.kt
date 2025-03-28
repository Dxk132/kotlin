package `2_entrada_de_datos`

fun main(){
    print("ingrese el precio del producto:")
    val precio: Double = readln().toDouble()
    print("ingrese la cantidad de productos que se llevara:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    println("el total a pagar es $total")
}
