package `5_estructuras_condicionales_aninandas`

fun main(){
    print("digite un numero  positivo de 3 cifras:")
    val numero = readln().toInt()
    if (numero < 0){

        print("error el numero debe ser positivo ")
    }else if (numero < 10){
        print("el numero tiene una cifra")
    } else if (numero < 100){
    print("el numero tiene dos cifra")
} else if (numero < 1000){
    print("el numero tiene tres cifra")
}else{
    print("el numero tiene mas de 3 cifras")
    }
}