package `19_arreglos`

fun main() {
    val numeros = IntArray(8)
    for (i in 0 until numeros.size) {
        print("Ingrese el número : ")
        numeros[i] = readln().toInt()
    }
    var suma = 0
    var Mayores36 = 0
    var Mayores50 = 0
    for (i in 0 until numeros.size) {
        suma += numeros[i]
        if (numeros[i] > 36) {
            Mayores36 += numeros[i]
        }
        if (numeros[i] > 50) {
            Mayores50++
        }
    }

    println("la Suma total de los elementos son: $suma")
    println("la Suma de los elementos mayores a 36 son: $Mayores36")
    println("la Cantidad de valores mayores a 50 son: $Mayores50")
}