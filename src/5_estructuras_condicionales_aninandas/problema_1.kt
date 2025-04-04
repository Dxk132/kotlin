package `5_estructuras_condicionales_aninandas`

fun main(){
    print("ingrese un numero entero:")
    val numero1 = readln().toInt()
    if  (numero1 > 0){
        print("el numero es positivo")
    }else if (numero1 == 0){
        print("el numero es nulo (cero)")

    }else{
        print("el numero es negativo")
    }

}
