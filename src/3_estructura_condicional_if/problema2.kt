package `3_estructura_condicional_if`

/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado"*/
fun main(){
    println("digite la nota del primer estudiante")
    val estudiante1: Int = readln().toInt()
    if (estudiante1>=7){
        print("el estudiante esta aprobado")
    }
    else{
        println("el estudiante es aplazado")
    }
    println("digite la nota del segundo estudiante")
    val estudiante2: Int = readln().toInt()
    if (estudiante2>=7){
        print("el estudiante esta aprobado")
    }
    else{
        println("el estudiante es aplazado")
    }
    println("digite la nota del tercer estudiante")
    val estudiante3: Int = readln().toInt()
    if (estudiante3>=7){
        print("el estudiante esta aprobado")
    }
    else{
        println("el estudiante es aplazado")
    }

}