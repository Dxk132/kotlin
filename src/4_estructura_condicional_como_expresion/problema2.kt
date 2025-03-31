package `4_estructura_condicional_como_expresion`

fun main (){
    print("ingrese su edad")
    val edad:Int = readln().toInt()
   val resultado = if (edad<13){
        println("si tienes $edad eres un niño")
    }
    else{
       if (edad<=17){
           println("si tienes $edad eres un adolecente")
       }
       else{
           if (18<=edad){
               println("si tienes $edad eres un adulto")
           } else {

           }
       }
    }
}