package `13_funciones_parametros`

fun vereficarclaves(clave1: String, clave2: String){
    when {
        clave1 == clave2 -> println("las dos claves son correctas ")
        else -> println("las claves son incorrectas")
    }
}
fun main(){
    print("ingrese una clave")
    val clave1 = readln()
    print("ingrese otra vez para verificarla ")
val clave2 = readln()
    vereficarclaves(clave1, clave2)

}