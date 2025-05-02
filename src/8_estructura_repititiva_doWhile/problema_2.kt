package `8_estructura_repititiva_doWhile`

fun main(){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0

    do{
        println("digite el numero de cuenta(digie algun numero negativo para finalizar):")
       val cuentas = readln().toInt()
        println("digite la cantidad de saldo que tiene")
        val saldo = readln().toInt()

        if (saldo > 0) {
            cant1++
            println("la cuenta $cuentas tiene un saldo de $saldo es un acredor")
        }else
            if (saldo == 0) {
                cant2++
                println("la cuenta $cuentas tiene un saldo de $saldo es nulo")
            }else
             if (saldo < 0){
            cant3 ++
        println("la cuenta $cuentas tiene un saldo de $saldo es un deudor")}
    }while (cuentas >= 0)
println("la cantidad de acredores es $cant1, de deudores es $cant3 y nulos es $cant2")
}