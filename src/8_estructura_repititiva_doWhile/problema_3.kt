package `8_estructura_repititiva_doWhile`

fun main(){
    var num1: Int
    var num2: Int
    var operacion: Int
    do {
        println("eliga alguna de las opciones")
        println("1.sumar dos numeros")
        println("2.restar dos numeros")
        println("3.multiplicar dos numeros")
        println("4.dividir dos numeros")
        println("5.salir")
        val opcion = readln().toInt()
        if (opcion < 5){
            print("la opcion digitada es invalida")
        }else if (opcion == 1){
            print("digite el primer numero")
            num1 = readln().toInt()
            print("digite el segundo numero")
            num2 = readln().toInt()
            operacion = num1 + num2
            println("$num1 + $num2 = $operacion")

        }else if (opcion == 2) {
            print("digite el primer numero")
            num1 = readln().toInt()
            print("digite el segundo numero")
            num2 = readln().toInt()
            operacion = num1 - num2
            println("$num1 - $num2 = $operacion")
        }else if (opcion == 3) {
            print("digite el primer numero")
            num1 = readln().toInt()
            print("digite el segundo numero")
            num2 = readln().toInt()
            operacion = num1 * num2
            println("$num1 * $num2 = $operacion")
        }else if (opcion == 4) {
            print("digite el primer numero")
            num1 = readln().toInt()
            print("digite el segundo numero")
            num2 = readln().toInt()
            operacion = num1 / num2
            println("$num1 / $num2 = $operacion")
        }
    }while (opcion != 5)


}