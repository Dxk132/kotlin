package `25_POO_modificadores_private_&_publi`

class operaciones{
    private var valor1: Int = 0
    private  var valor2: Int = 0

    fun cargar(){
        println("ingrese un primero valor")
        valor1 = readln().toInt()
        println("digite el segundo valor")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    private fun sumar(){
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $suma")
    }
    private fun restar(){
        val resta = valor1 + valor2
        println("la resta de $valor1 y $valor2 es $resta")
    }
}

fun main(){
    val operaciones1 = operaciones()
    operaciones1.cargar()
}