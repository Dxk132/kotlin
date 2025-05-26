package `16_funciones_parametro_por_defecto`

fun nombressubrayados(titulo: String, caracter: String = "*"){
    println(titulo)
    for (i in 1..titulo.length)
        print(caracter)
    println()
}
fun main(){
    nombressubrayados("sistema de administracion")
    nombressubrayados("ventas", "-")
}