package `2_entrada_de_datos`

fun main() {
    print("Ingrese la medida del lado cuadrado:")
    val lado = readln().toInt()
    val perimetro: Int = lado * 4
    println("el perimetro del cuadrado es $perimetro")
}