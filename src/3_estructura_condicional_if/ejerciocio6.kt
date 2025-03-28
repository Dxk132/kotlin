package `3_estructura_condicional_if`

fun main(){
    print("ingrese un primer valor")
    val valor1: Int = readln().toInt()
    print("ingrese un segundo valor valor")
    val valor2: Int = readln().toInt()
    if (valor1>valor2) {
        print("el mayor valor es $valor1")

    }
        else{
            print("el mayor valor es $valor2")

        }
}


