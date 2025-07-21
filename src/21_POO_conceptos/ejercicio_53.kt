package `21_POO_conceptos`

class persona {
    var nombre: String = ""
    var edad: Int = 0
    fun inicializar(nombre:String, edad:Int) {
        this.nombre = nombre
        this.edad = edad
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
    val persona1: persona
    persona1 = persona()
    persona1.inicializar("juan",27)
    persona1.imprimir()
    persona1.es_mayor_de_edad()
    val persona2: persona
    persona2 = persona()
    persona2.inicializar("sebastian", 34)
    persona2.imprimir()
    persona2.es_mayor_de_edad()
}