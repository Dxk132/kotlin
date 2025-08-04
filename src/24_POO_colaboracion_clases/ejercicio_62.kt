package `24_POO_colaboracion_clases`

import `20_funciones_tipo_arreglo`.imprimir
import kotlin.random.Random

class dado(var valor: Int){

    fun tirar(){
     this.valor = ((Random.nextInt(1,7))).toInt()
        imprimir()

    }
    fun imprimir(){
        println("valor del dado: $valor")
    }
}

class juegosDados{
    val dado1 = dado(1)
    val dado2 = dado(1)
    val dado3 = dado(1)

    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("gano")
        else
            print("perdio")
    }
}

fun main(){
    val jugar1 = juegosDados()
    jugar1.jugar()
}