package `20_funciones_tipo_arreglo`

fun cargar_1(arreglo: IntArray): IntArray {
    for (f in arreglo.indices) {
        println("Ingrese elemento:")
        arreglo[f] = readln().toInt()
    }
    return arreglo
}

fun encontrarMenor(arreglo: IntArray): Int {
    var menor = arreglo[0]
    for (f in 1 until arreglo.size) {
        if (arreglo[f] < menor) {
            menor = arreglo[f]
        }
    }
    return menor
}

fun contarRepeticiones(arreglo: IntArray, valor: Int): Int {
    var contador = 0
    for (elemento in arreglo) {
        if (elemento == valor) {
            contador++
        }
    }
    return contador
}

fun main() {
    val arreglo = IntArray(5)
    cargar_1(arreglo)
    val menor = encontrarMenor(arreglo)
    val repeticiones = contarRepeticiones(arreglo, menor)

    println("El elemento menor es: $menor")
    if (repeticiones > 1) {
        println("el elemento menor se repite  $repeticiones ")
    } else {
        println("el elemebnto menor no se repite.")
    }
}