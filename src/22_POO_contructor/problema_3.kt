package `22_POO_contructor`

class rectangulo (var altura: Int, var base: Int){
    init {
        if (base <= 0)
            base = 1
        if (altura <= 0)
            altura= 1
    }

    constructor(): this(0,0){
        print("ingrese la base: ")
        base = readln().toInt()
        print("ingrese la altura: ")
        altura = readln().toInt()
    }


    fun area(): Int{
       var area = base * altura
        println("su area es de $area")
        return area
    }
    fun es_cuadrado(){
      if (base == altura)
          println("es un cuadrado")
        else
            println("es un rectangulo normal")
    }
}

fun main(){
    val rectangulo1 = rectangulo()
    rectangulo1.area()
    rectangulo1.es_cuadrado()
    val rectangulo2 = rectangulo()
    rectangulo2.area()
    rectangulo2.es_cuadrado()

}