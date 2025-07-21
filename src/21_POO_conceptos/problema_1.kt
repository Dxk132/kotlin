package `21_POO_conceptos`

class Alumno {
    var nombre:String = ""
    var nota:Int = 0

    fun inicializar(){
        print("ingrese el nombre del alumno:")
        nombre = readln().toString()
        print("ingrese la nota de $nombre:")
        nota = readln().toInt()

    }
    fun clasificacion_de_nota(){
        when{
            nota == 10 -> println("la nota de $nombre es exelente")
            nota in 8..9 -> println("la nota de $nombre es buena")
            nota > 7 -> println("la nota de $nombre es aprobo")
            else -> println("el alumno $nombre reprobo")
        }
    }
}

fun main(){
    val Alumno1: Alumno
    Alumno1 = Alumno()
    Alumno1.inicializar()
    Alumno1.clasificacion_de_nota()

    val Alumno2: Alumno
    Alumno2 = Alumno()
    Alumno2.inicializar()
    Alumno2.clasificacion_de_nota()
}