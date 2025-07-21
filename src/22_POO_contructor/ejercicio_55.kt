package `22_POO_contructor`

class persona constructor (nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad: Int = edad
    fun imprimir(){
        println("nombre: $nombre y tiene una edad de $edad")
    }
    fun es_mayor_de_edad(){
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre es menor de edad")


    }
    }

fun main (){
    val persona1 = persona("juam",12)
    persona1.imprimir()
    persona1.es_mayor_de_edad()

}