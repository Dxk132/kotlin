package `22_POO_contructor`

class triangulo1 (var lado1: Int, var lado2: Int, var lado3: Int){

    constructor(): this(0,0,0){
        print("ingrese lado 1:")
        lado1 = readln().toInt()
        print("ingrese lado 2:")
        lado2 = readln().toInt()
        print("ingrese lado 3:")
        lado3 = readln().toInt()
    }


    fun lado_Mayor(){
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun esequilatero(){
        if (lado2 == lado2 && lado1 == lado3)
            print("es un triangulo equilatero")
        else
            print("no es un trinagulo equilatero")
    }
}

fun main(){
    val triangulo1 = triangulo1()
    triangulo1.lado_Mayor()
    triangulo1.esequilatero()
    val triangulo2 = triangulo1(6,6,6)
    triangulo1.lado_Mayor()
    triangulo1.esequilatero()

}