package `22_POO_contructor`

class Persona constructor (var nombre: String, var edad: Int) {

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
    val persona1 = Persona("juam",12)
    persona1.imprimir()
    persona1.es_mayor_de_edad()

}