package proyecto_Kotlin

fun registrarnota(nombre: String): Int {//hacemos una funcion parapoder registrar las notas
    var nota: Int

    do {//creamos un do para poder repetir el procesos si alguna nota no esta dentro del rango

        println("ingrese una nota para $nombre del 0 al 100")
        nota = readln().toInt()
        when {
            nota in 90..100 -> println("la nota de $nombre es excelente")//cada que pongamos una nota paracerea si es exelente, buena, aprobada o reprobada junto con el numero de estudante de esa nota
            nota in 80..89 -> println("la nota de $nombre es buena")
            nota in 70..79 -> println("la nota de $nombre es aprobada")
            nota in 0..69 -> println("la nota de $nombre esta reprobada")

        }
        if (nota !in 0..100)//significa que si un numero no esta entre 0 y 100 mandara ese mensaje y se rpetira el estudiante con la nota incorrecta
            println("nota no valida digitela de nuevo")
    } while (nota !in 0..100)
    return nota//retornamos la nota
}
fun main(){
    val estudiantes = arrayOf("matias", "sebastian", "steven", "carlos", "david")//creamos una lista de nombres que se guarden en estudiantes
    val notas = IntArray(estudiantes.size )//la cantidad de notas va a hacer de la cantidad de estudiantes (en este caso 5)
    for ( i in 0 .. 4) {//creamos un for para que la funcion no se repita mas de la cantidad de estudiantes
        notas[i] = registrarnota(estudiantes[i])//utilizamos el [i] para que cada nota se guarde en cada numero de estudiante
    }
var promedio = 0
    var aprobados = 0
    var reprobados = 0
    var suma = 0
    var notMax = 0
    var notMIN = 100
    for (i in 0 .. 4){//creamos un for para que no se repita mas de 5 veces
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
    println("la cantidad de aprobados es: $aprobados")//todos los resultados apareceran en pantalla
    println("la cantidad de reprobados es: $reprobados")
    println("la nota maxima es de: $notMax")
    println("la nota minima es de: $notMIN")
    println("el promedio de todas las notas es de: $promedio")

}