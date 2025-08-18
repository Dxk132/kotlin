package `25_POO_modificadores_private_&_publi`

import kotlin.random.Random

class dado{
private var valor: Int = 1

    fun tirar(){
        this.valor = ((Math.random()*6)+1).toInt()
    }
    fun imprimir(){
        separador()
        println("valor del dado: $valor")
        separador()
    }
    private fun separador() = println("********************************")
}


fun main(){
    val jugar1 = dado()
    jugar1.tirar()
    jugar1.imprimir()
}