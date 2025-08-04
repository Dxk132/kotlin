package `24_POO_colaboracion_clases`

class cliente(var nombre: String, var monto: Float){
    fun depositar(monto: Float){
        this.monto += monto
    }
    fun extraer(monto:Float){
        this.monto -= monto
    }
    fun imprimir(){
        println("$nombre tienes de la suma de $monto")
    }
}

class banco{
    var cliente1: cliente = cliente("juan",0f)
    var cliente2: cliente = cliente("Ana", 0f)
    var cliente3: cliente = cliente("luis", 0f)

    fun operar(){
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.extraer(100f)
    }
    fun depositostotales(){
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("el total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }

}

fun main(){
    val banco1 = banco()

}