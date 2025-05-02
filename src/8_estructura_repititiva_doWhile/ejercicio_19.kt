package `8_estructura_repititiva_doWhile`

fun main(){
    var cant = 0
    var suma = 0
    do{
        print("ingrese un valor(0 para finalizar)")
        val valor = readln().toInt()
        if (valor != 0)
            suma += valor
        cant++
    }while (valor !=0)
    if (cant !=0){
        val promedio = suma / cant
        println("el promedio de los valores ingresados es $promedio")
    }else
        println("no hay valores ingresados")

}