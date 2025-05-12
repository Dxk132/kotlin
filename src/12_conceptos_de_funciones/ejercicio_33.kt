package `12_conceptos_de_funciones`


fun cargarsuma (){
    println("ingrese el primer digito")
    val valor1 = readln().toInt()
    println("ingrese el segundo numero")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los valores es $suma")
}
fun separacion(){
    println("**************************************")
}
fun main(){
    for (i in 1..5){
        cargarsuma()
        separacion()
    }

}