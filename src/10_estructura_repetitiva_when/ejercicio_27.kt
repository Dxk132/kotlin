package `10_estructura_repetitiva_when`

fun main(){
    print("ingrese primer nota")
    val nota1 = readln().toInt()
    print("ingrese segundo nota")
    val nota2 = readln().toInt()
    print("ingrese tercer nota")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3)/3
    when{
        promedio >= 7 -> print("promocionado")
        promedio >= 4 -> print("regular")
        else -> print("reprobado")
    }

}