package `26_POO_metodo_set_get`

import `25_POO_modificadores_private_&_publi`.sensorTemperatura

class jardin constructor (largo:Int, ancho:Int, opcion:Int){
    var largo: Int = largo
        set(valor) {
            field = if (valor > 0) valor else 1
        }
        get() = field

    var ancho: Int = largo
        set(valor) {
            field = if (valor > 0) valor else 1
        }
        get() = field

    var opcion:Int = 1
        set(valor){
            if (valor !in 1..3)
                field = 1
        }
        get(){
            return when (field) {
                1 -> {
                    println("(CRIOLLO)"); field
                }

                2 -> {
                    println("(AMERICANO)"); field
                }

                3 -> {
                    println("(SINTÉTICO)"); field
                }

                else -> field
            }
        }
    val area: Int
        get() = largo * ancho

    private fun Mano_de_Obra(): Int = area * 500

    private fun costo_zacate(): Int = when (opcion) {
        1 -> area * 1000
        2 -> area * 1500
        3 -> area * 2000
        else -> 0
    }
    private fun subtotal(): Int = Mano_de_Obra() + costo_zacate()

    private fun impuesto(): Double = subtotal() * 0.13

    private fun total(): Double = subtotal() + impuesto()

    fun detalles_del_jardin(){
        println("largo del jardin: $largo m ")
        println("ancho del jardin: $ancho m ")
        println("area de su jardin: $area " )
        when{
            opcion == 1 -> println("su zacate es criollo")
            opcion == 2 -> println("su zacate es americano")
            opcion == 3 -> println("su zacate es sintetico")
        }
        println("Costo mano de obra: ${Mano_de_Obra()}")
        println("Costo del zacate: ${costo_zacate()}")
        println("Subtotal: ${subtotal()}")
        println("Impuesto 13%")
        println("total del monto: ${total()}")
    }
}

fun main() {
    val jardin1 = jardin(5, 5, 3)
    jardin1.detalles_del_jardin()

}
