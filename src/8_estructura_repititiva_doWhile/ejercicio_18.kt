package `8_estructura_repititiva_doWhile`

fun main(){
    do{
        print("ingrese el valor comprendidio entro 0 y 999")
        val valor: Int = readln().toInt()
        if (valor < 10)
            println("el numero digitado es de un digito")
        else
            if (valor < 100)
                println("el numero digitado es de dos digitos")
        else
                println("el valor digitado es de tres digitos")
    }while (valor != 0 )
}