package `4_estructura_condicional_como_expresion`

fun main() {
    print("digite un primer valor")
    val valor1:Int = readln().toInt()
    print("digite un segundo valor")
    val valor2:Int = readln().toInt()
    print("digite un tercer valor")
    val valor3:Int = readln().toInt()
    if (valor1 == valor2 && valor2 == valor3 ){ /*el "||" significa "o" para poder integrar diferentes  caminos para un mismo resultado*/
        print("el triangulo es equilatero")
    }else { if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
        print("el triangulo es isoceles")
    }   else{
        print("el triangulo es escaleno")
    }



    }




}