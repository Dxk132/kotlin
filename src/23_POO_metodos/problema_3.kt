package `23_POO_metodos`
class numeros {
    var numero_1: Int = 0
    var numero_2: Int = 0
    var numero_3: Int = 0
    var numero_4: Int = 0
    var numero_5: Int = 0
    var numero_6: Int = 0

    fun leer_numeros() {
        println("******************************************************")
        print("digite el primer numero ")
        numero_1 = readln().toInt()
        print("digite el segundo numero ")
        numero_2 = readln().toInt()
        print("digite el tercer numero ")
        numero_3 = readln().toInt()
        print("digite el cuarto numero ")
        numero_4 = readln().toInt()
        print("digite el quinto numero ")
        numero_5 = readln().toInt()
        print("digite el sexto numero ")
        numero_6 = readln().toInt()
        numero_positivo()
        numero_negativo()
    }

    fun numero_positivo() {
        var num_positivo: Int = 0

        if (numero_1 > 0) {
            num_positivo++
        }
        if (numero_2 > 0) {
            num_positivo++
        }
        if (numero_3 > 0) {
            num_positivo++
        }
        if (numero_4 > 0) {
            num_positivo++
        }
        if (numero_5 > 0) {
            num_positivo++
        }
        if (numero_6 > 0) {
            num_positivo++
        }
        println("******************************************************")
        println("la cantidad de numero positivos es de  $num_positivo")
    }

    fun numero_negativo() {
        var num_negativo: Int = 0

        if (numero_1 < 0) {
            num_negativo++
        }
        if (numero_2 < 0) {
            num_negativo++
        }
        if (numero_3 < 0) {
            num_negativo++
        }
        if (numero_4 < 0) {
            num_negativo++
        }
        if (numero_5 < 0) {
            num_negativo++
        }
        if (numero_6 < 0) {
            num_negativo++
        }
        println("******************************************************")
        println("la cantidad de numero negativos es de  $num_negativo")
    }
}

fun main(){
    val Numeros = numeros()
    Numeros.leer_numeros()
}