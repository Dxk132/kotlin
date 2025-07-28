package `22_POO_contructor`

class producto constructor(var nombre:String, var  precio:Double,var stock:Int){
    init {
        if(precio < 0.00)
            precio = 0.00
        if (stock < 0)
            stock = 0

    }
    fun mostrar_info():Int{
        println("*****************************************************************")
        println("nombre: $nombre")
        println("cantidad: $stock")
        println("precio: $precio")
     return stock
    }
    fun hayStock(){
        val Stock:Int = stock
        if (stock <= 0) {
            println("no hay $nombre en stock")

        } else
            println("si hay $nombre en stock")
        println("*****************************************************************")
    }

}

fun main(){
    val producto1= producto("bolsas", 200.00, 3 )
    producto1.mostrar_info()
    producto1.hayStock()

    val producto2 = producto("frijoles", 3000.00, -1)
    producto2.mostrar_info()
    producto2.hayStock()

    val producto3 = producto("arroz", 2000.00, 5)
    producto3.mostrar_info()
    producto3.hayStock()
}
