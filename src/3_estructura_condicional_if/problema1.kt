package `3_estructura_condicional_if`

/*Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/
fun main(){
    println("digite un numero del 1 al 99")
    val numero: Int = readln().toInt()
    if (numero>99){
        print("el numero ingresado es incorrecto")
    }
    else{
        if (numero>=10){
            print("el numero $numero es de dos digitos")
        }
        else{
            print("el numero $numero es de un digito")
        }
    }


}