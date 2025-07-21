package `22_POO_contructor`

class triangulo constructor(var lado1: Int, var lado2: Int, var lado3: Int){

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
    val triangulo1 = triangulo(23,44,23)
    triangulo1.lado_Mayor()
    triangulo1.esequilatero()
}