package `23_POO_metodos`

class temperaturas{
    var temperatura_1: Int = 0
    var temperatura_2: Int = 0
    var temperatura_3: Int = 0
    var temperatura_4: Int = 0
    var temperatura_5: Int = 0
    var temperatura_6: Int = 0
    var temperatura_7: Int = 0

    fun cargar_Datos(){
        println("******************************************************")
        print("digite la temperatura del dia 1 ")
        temperatura_1 = readln().toInt()
        print("digite la temperatura del dia 2 ")
        temperatura_2 = readln().toInt()
        print("digite la temperatura del dia 3 ")
        temperatura_3 = readln().toInt()
        print("digite la temperatura del dia 4 ")
        temperatura_4 = readln().toInt()
        print("digite la temperatura del dia 5 ")
        temperatura_5 = readln().toInt()
        print("digite la temperatura del dia 6 ")
        temperatura_6 = readln().toInt()
        print("digite la temperatura del dia 7 ")
        temperatura_7 = readln().toInt()

        temperatura_MAX()
        temperatura_MIN()
    }
    fun temperatura_MAX(){
        var temp_MAX: Int = 0

        if (temperatura_1 > temp_MAX){
            temp_MAX = temperatura_1
        }
        if (temperatura_2 > temp_MAX){
            temp_MAX = temperatura_2
        }
        if (temperatura_3 > temp_MAX){
            temp_MAX = temperatura_3
        }
        if (temperatura_4 > temp_MAX){
            temp_MAX = temperatura_4
        }
        if (temperatura_5 > temp_MAX){
            temp_MAX = temperatura_5
        }
        if (temperatura_6 > temp_MAX){
            temp_MAX = temperatura_6
        }
        if (temperatura_7 > temp_MAX){
            temp_MAX = temperatura_7
        }
        println("******************************************************")
        println("la temperatura mas alta es $temp_MAX")
    }
    fun temperatura_MIN(){
        var temp_MIN: Int = 10000
        if (temperatura_1 < temp_MIN){
            temp_MIN = temperatura_1
        }
        if (temperatura_2 < temp_MIN){
            temp_MIN = temperatura_2
        }
        if (temperatura_3 < temp_MIN){
            temp_MIN = temperatura_3
        }
        if (temperatura_4 < temp_MIN){
            temp_MIN = temperatura_4
        }
        if (temperatura_5 < temp_MIN){
            temp_MIN = temperatura_5
        }
        if (temperatura_6 < temp_MIN){
            temp_MIN = temperatura_6
        }
        if (temperatura_7 < temp_MIN){
            temp_MIN = temperatura_7
        }
        println("******************************************************")
        println("la temperatura minima es $temp_MIN")
        println("******************************************************")
    }
}

fun main(){
    val semana1 = temperaturas()
    semana1.cargar_Datos()

}