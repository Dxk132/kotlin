package `5_estructuras_condicionales_aninandas`

fun main() {
    print("ingrese primer nota:")
    val nota1 = readln().toInt()
    print("ingrese la segunda nota:")
    val nota2 = readln().toInt()
    print("ingrese la tercera nota")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) /3


    val estado = if (promedio >=7) "promocionado"

    else if (promedio>=7) "regular" else "reprobado"
    print ("estado del alumno $estado")
}