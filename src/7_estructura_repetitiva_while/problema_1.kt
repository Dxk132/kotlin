package `7_estructura_repetitiva_while`

fun main(){
    var x = 1
    var aprobados = 0
    var no_aprobados = 0
    while (x <= 10){
        print("digite las notas de los alumnos:")
        val notas:Int = readln().toInt()
        if (notas >= 7)
            aprobados = aprobados + 1
        else
            no_aprobados = no_aprobados + 1
        x = x + 1
    }
       println("la cantidad de aprobados es: $aprobados")
    println("la antidad de no aprobados es: $no_aprobados")
}