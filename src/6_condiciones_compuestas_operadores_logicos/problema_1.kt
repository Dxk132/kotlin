package `6_condiciones_compuestas_operadores_logicos`

fun main(){
    print("digite el dia:")
    val dia: Int = readln().toInt()
    print("digite el mes de fomra decimal:")
    val mes: Int = readln().toInt()
    if (dia==25 || dia==24 && mes==12)
        print("el dia elegido es navidad")
    else
        print("el dia elegido es un dia comun")
}