package `14_funciones_con_retorno`


fun largo (nombre: String): Int{
    return nombre.length
}
fun main() {
    println("ingrese un nombre")
    val nombre1 = readln() // jorge
    print("ingrese otro nombre")
    val nombre2 = readln() // luis
    if (largo(nombre1) == largo(nombre2))
        println("el nombre $nombre1 es igual de largo que $nombre2")
    else if (largo(nombre1) > largo(nombre2))
        print("$nombre1 es mas largo que $nombre2")
    else
        print("$nombre2 es mas largo ")
}