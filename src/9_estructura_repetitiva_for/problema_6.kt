package `9_estructura_repetitiva_for`

fun main() {
    print("Ingrese cuántos puntos desea registrar: ")
    val puntos = readln().toInt()

    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0

    for (i in 1..puntos) {
        print("Coordenada x: ")
        val x = readln().toInt()
        print("Coordenada y: ")
        val y = readln().toInt()

        when {
            x > 0 && y > 0 -> q1++
            x < 0 && y > 0 -> q2++
            x < 0 && y < 0 -> q3++
            x > 0 && y < 0 -> q4++
        }
    }

    println("Puntos por cuadrante:")
    println("Cuadrante I: $q1")
    println("Cuadrante II: $q2")
    println("Cuadrante III: $q3")
    println("Cuadrante IV: $q4")
}