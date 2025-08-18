package `25_POO_modificadores_private_&_publi`

class cuenta_Bancaria{
    private var saldo:Int = 0

    fun depositar_monto(monto: Int){
            if (monto_valido(monto)){
             saldo += monto
            }else
                println("el monto es invalido ")
    }

    fun retirar_monto(monto: Int){
           if (monto_valido(monto)){
               println("el retiro es incorrecto")
           }else if (puede_retirar(monto)){
               println("el retiro es invalido")
           }else
               saldo -= monto


    }


    fun consultar_saldo(){
        println("$saldo")
    }

    private fun monto_valido(monto: Int):Boolean = monto > 0

    private fun puede_retirar(monto: Int):Boolean = saldo >= 0

}

fun main(){
    val cuenta1 = cuenta_Bancaria()
    cuenta1.depositar_monto(2000)
    cuenta1.retirar_monto(1000)
    cuenta1.consultar_saldo()

    val cuenta2 = cuenta_Bancaria()
    cuenta2.depositar_monto(2000)
    cuenta2.retirar_monto(3000)
    cuenta2.consultar_saldo()
}