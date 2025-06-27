package `20_funciones_tipo_arreglo`

fun cargar(): IntArray{
    print("cuantos sueldos quiere cargar")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices){
        println("ingrese elemento:")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}

fun imprimir2(sueldos:IntArray){
    println("listadsos de todos ")
    println(sueldos)
}

fun main(){
    val sueldos = cargar()
    imprimir2(sueldos)
}