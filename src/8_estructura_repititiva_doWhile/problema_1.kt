package `8_estructura_repititiva_doWhile`

fun main(){
    var suma = 0
    var numero: Int
    do {
        print("ingrese un numero(9999 para terminar)")
        numero = readln().toInt()
        if(numero != 9999)
            suma += numero

    }while (numero !=9999)
    println("la suma total es $suma")
    if (suma>0)
        println("el valor es mayor a cero")
    else if (suma==0)
        println("el valor es cero")
    else if (suma<0)
        println("el valor es menor a cero")
}