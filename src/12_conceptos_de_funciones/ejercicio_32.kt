package `12_conceptos_de_funciones`

fun presentacion(){
    println("programa que permite  cargar dso valores por teclado")
    println("efectura la suma de los valores")
    println("muestra el resultado de la suma")
    println("*******************************************************")
}
fun cargarsumar(){
    println("ingrese el primer digito")
    val valor1 = readln().toInt()
    println("ingrese el segundo numero")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los valores es $suma")
}
fun finalizacion(){
    println("**************************************")
    println("gracias por utilizar este programa")
}
fun main(){
    presentacion()
    cargarsumar()
    finalizacion()
}