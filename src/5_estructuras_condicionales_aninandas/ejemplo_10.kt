package `5_estructuras_condicionales_aninandas`
fun main(){
    print("ingrese primer nota:")
    val nota1 = readln().toInt().toInt()
    print("ingrese segunda nota")
    val nota2 = readln().toInt().toInt()
    print("ingrese tercer nota")
    val nota3 = readln().toInt().toInt()

    val promedio =(nota1 + nota2 + nota3)/3
    if (promedio >= 7)
        print("promocionado")
    else
        if (promedio >=4)
            print("regular")
    else
        print("reprobado")

}

