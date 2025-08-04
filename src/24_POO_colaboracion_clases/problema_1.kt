package `24_POO_colaboracion_clases`

class libro(var titulo: String, var prestado:Boolean,var disponible:Boolean){


    fun prestar(){
       if (prestado == true && disponible == false){
           print("no se puede prestar ")
       }else
           prestado == true
        disponible == false
    }
    fun devolver(){
        if (prestado == true && disponible==false){
             disponible == true
            prestado == false
        }else if(prestado == false)
            println("no hace falta devolverlo")

    }
    fun estado(){
        if (prestado == true) {
            println("el libro $titulo esta en estado disponible ")
        }else if (prestado == false )
            println("el libro $titulo esta en estado prestado")
    }
}

class biblioteca{
    var libro1: libro = libro("zelda",false,  true)
    var libro2: libro = libro("zancho pansa", true,false)
    var libro3: libro = libro("JoJo's", true,false)

    fun Operar(){
        libro1.prestar()
        libro2.devolver()
        libro3.prestar()

    }
    fun revisar_estado(){
        libro1.estado()
        libro2.estado()
        libro3.estado()
    }

}

fun main(){
    val biblioteca1 = biblioteca()
    biblioteca1.Operar()
    biblioteca1.revisar_estado()

}