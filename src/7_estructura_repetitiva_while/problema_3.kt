package `7_estructura_repetitiva_while`

fun main(){
print("ingrese la cantidad de empleados")
    val empleados = readln().toInt()
    var x = 1
    var entre100y300 = 0
    var mas300 = 0
    var suma_sueldos = 0.0
    while (x <= empleados){
        print("ingrese el sueldo del empleado correspondiente:")
        val sueldo = readln().toDouble()
        if(sueldo >=100 && sueldo <=300)
            entre100y300 = entre100y300 + 1
        else if (sueldo > 300)
            mas300 = mas300 + 1
        suma_sueldos = suma_sueldos + sueldo
        x = x + 1
    }
     println("la cantidad de empleados con un sueldo de 100 y 300 es: $entre100y300")
    println("la cantidad de empleados con un sueldo de mas 300 es: $mas300")
    println("la empresa gasto un total de $suma_sueldos en sueldos")


}