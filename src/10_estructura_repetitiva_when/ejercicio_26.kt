package `10_estructura_repetitiva_when`

fun main(){
    print("ingrese coordenada x del puento:")
    val x = readln().toInt()
    print("ingese coordenada y del punto:")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("segundo cuadrante")
        x < 0 && y < 0 -> println("tercer cuadrante")
        x > 0 && y < 0 -> println("cuarto cuadrante")
        else -> println("el punto se encuentra en un eje")
    }
}