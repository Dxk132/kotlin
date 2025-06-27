package proyecto_Kotlin

fun registrarNota(estudiante:String): Int{
    var nota: Int
    println("ingrese la nota de 0 a 100 para $estudiante")
    nota = readln().toInt()
    do {
        when{
            nota < 100 && nota > 90 -> println("la nota de $estudiante es exelente")
            nota < 89 && nota > 80 -> println("la nota de $estudiante es buena")
            nota < 79 && nota > 70 -> println("la nota de $estudiante es aprobada")
            nota < 69 && nota > 0 -> println("la nota de $estudiante es reprobada")
        }
        if (nota !in 0..100 ){
            println("la nota no es valida ")
        }
    }while (nota !in 0..100)
    return nota
}
fun main(){
    val nombres = arrayOf("matias", "sebastian", "steven", "fiorella", "ernesto")
    var Notas = IntArray(nombres.size)
    for (i in 0..4){
        Notas[i] = registrarNota(nombres[i])
    }
    var promedio = 0
    var aprobados = 0
    var reprobados = 0
    var suma = 0
    var notMax = 0
    var notMIN = 100
    for (i in 0..8){
        suma += Notas[i]
        if (Notas[i] > 70){
            aprobados ++
        }else reprobados++
        if (Notas[i] > notMax){
            notMax = Notas[i]
        }
        if (Notas[i] < notMIN){
            notMIN = Notas[i]
        }
        promedio= suma/5
    }
    println("la cantidad de aprobados es: $aprobados")//todos los resultados apareceran en pantalla
    println("la cantidad de reprobados es: $reprobados")
    println("la nota maxima es de: $notMax")
    println("la nota minima es de: $notMIN")
    println("el promedio de todas las notas es de: $promedio")
}