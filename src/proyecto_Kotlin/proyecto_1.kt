package proyecto_Kotlin

fun registrarnota(nombre: String): Int{
    var nota: Int
   
    do {
        println("ingrese una nota para $nombre del 0 al 100")
        nota = readln().toInt()
        when{
           nota  in 90..100  -> println("la nota de $nombre es excelente")
            nota in 80..89 -> println("la nota de $nombre es buena")
            nota in 70..79 -> println("la nota de $nombre es aprobada")
            nota in 0..69 -> println("la nota de $nombre esta reprobada")
        }
            if (nota !in 0..100)
            println("nota no valida digitela de nuevo")
    }while (nota !in 0..100)
    return nota
}


fun main(){
    val estudiantes = arrayOf("matias","sebastian","steven","carlos","david")
   val notas = mutableListOf(Int)
        for (nombre in estudiantes){
            val nota = registrarnota(nombre)
        }

}





