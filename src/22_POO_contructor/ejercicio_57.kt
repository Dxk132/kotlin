package `22_POO_contructor`

class personaa constructor (var nombre: String, var edad: Int) {
init {
    if (edad < 0)
        edad = 0
}
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
    val persona1 = personaa("juam",12)
    persona1.imprimir()
    persona1.es_mayor_de_edad()

}