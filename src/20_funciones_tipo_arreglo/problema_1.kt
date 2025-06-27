package `20_funciones_tipo_arreglo`

fun cargar_arreglo(n: Int): IntArray {
    val arreglo = IntArray(n)
    for (i in 0 until n) {
        print("Ingrese el valor para la posición $i: ")
        val valor = readln().toInt()
        arreglo[i] = valor
    }
    return arreglo
}


fun suma_de_elementos(arreglo: IntArray): Int {
    var suma = 0
    for (elemento in arreglo) {
        suma += elemento
    }
    return suma
}

fun main() {
    print("Ingrese la cantidad de elementos del arreglo: ")
    val n = readln().toInt()

    val arreglo = cargar_arreglo(n)
    val sumaTotal = suma_de_elementos(arreglo)

    println("La suma de todos los elementos es: $sumaTotal")
}