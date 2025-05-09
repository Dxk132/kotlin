package `10_estructura_repetitiva_when`

fun main(){
    var total = 0
    for (i in 1..10){
        print("digite un sueldo")
        val sueldo = readln().toInt()
        total += when{
            sueldo > 5000 -> {
                println("sueldo alto")
                sueldo
            }
            sueldo > 2000 ->{
                println("sueldo medio")
                0
            }
            else ->{
                println("sueldo bajo")
                0
            }

        }
    }

}