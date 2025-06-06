package proyecto_Kotlin

fun registrarnota(nombre: String): Int {
    var nota: Int

    do {

        println("ingrese una nota para $nombre del 0 al 100")
        nota = readln().toInt()
        when {
            nota in 90..100 -> println("la nota de $nombre es excelente")
            nota in 80..89 -> println("la nota de $nombre es buena")
            nota in 70..79 -> println("la nota de $nombre es aprobada")
            nota in 0..69 -> println("la nota de $nombre esta reprobada")

        }
        if (nota !in 0..100)
            println("nota no valida digitela de nuevo")
    } while (nota !in 0..100)
    return nota
}
fun main(){
    val estudiantes = arrayOf("matias", "sebastian", "steven", "carlos", "david")
    val notas = IntArray(estudiantes.size )
    for ( i in 0 .. 4) {
        notas[i] = registrarnota(estudiantes[i])
    }
var promedio = 0
    var aprobados = 0
    var reprobados = 0
    var suma = 0
    var notMax = 0
    var notMIN = 100
    for (i in 0 .. 4){
        suma += notas[i]
        if (notas[i] > 70){
            aprobados ++
        }else reprobados++
           if (notas[i] > notMax){
               notMax = notas[i]
           }
            if (notas[i] < notMIN){
                notMIN = notas[i]
            }
        promedio= suma/5
    }
    println("la cantidad de aprobados es: $aprobados")
    println("la cantidad de reprobados es: $reprobados")
    println("la nota maxima es de: $notMax")
    println("la nota minima es de: $notMIN")
    println("el promedio de todas las notas es de: $promedio")

}