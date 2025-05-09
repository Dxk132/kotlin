package `10_estructura_repetitiva_when`

fun main(){

    do {
        println("ingrese un numero (0 para salir)")
        val num = readln().toInt()
        when{
            num > 0 -> println("el numero $num es positivo")
            num < 0 -> println("el numero $num es negativo")
            num == 0 -> println("saliendo...")
        }
    }while (num != 0)
}