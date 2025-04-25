package `7_estructura_repetitiva_while`

fun main(){
    var x = 1
    var num = 0
    while (x <= 500) {
        num = num + 1
        var resultado = num * 8
        println(" el multiplo de 8 por $num es $resultado")

        x = x + 1
    }

}