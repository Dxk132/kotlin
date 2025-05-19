package `13_funciones_parametros`

fun mostrar_mensajes(mensaje: String){
    println("***********************************************************************")
    println(mensaje)
    println("***********************************************************************")

}
fun cargarsumar(){
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma =  valor1 + valor2
    println("la suma de los valores es $suma")
}
fun main(){
    mostrar_mensajes(mensaje = "el programa calcula la suma de" + " dos valores ingresados por teclado")
    cargarsumar()
    mostrar_mensajes(mensaje = "gracias por usar este" + " programa")
}