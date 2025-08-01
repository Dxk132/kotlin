package `23_POO_metodos`

class notas{
    var notas_est1: Int = 0
    var notas_est2: Int = 0
    var notas_est3: Int = 0
    var notas_est4: Int = 0

    fun cargar_notas(){
        println("******************************************************")
        print("digite la nota del estudiante 1: ")
        notas_est1 = readln().toInt()
        print("digite la nota del estudiante 2: ")
        notas_est2 = readln().toInt()
        print("digite la nota del estudiante 3: ")
        notas_est3 = readln().toInt()
        print("digite la nota del estudiante4: ")
        notas_est4= readln().toInt()
        Promedio()
        Aprobados()
    }
    fun Promedio(){
        var suma: Int = 0
        var promedio: Int = 0
        suma = notas_est1+notas_est2+notas_est3+notas_est4
        promedio = suma/4
        println("******************************************************")
        println("el promedio de notas es $promedio")
    }
    fun Aprobados(){
        var aprobados = 0
        if (notas_est1 >= 70){
            aprobados++
        }
        if (notas_est2 >= 70){
            aprobados++
        }
        if (notas_est3 >= 70){
            aprobados++
        }
        if (notas_est4 >= 70){
            aprobados++
        }


        println("******************************************************")
        println("la cantidad de aprobados es de $aprobados")
        println("******************************************************")
    }
}

fun main(){
 val clase1 = notas()
    clase1.cargar_notas()

}