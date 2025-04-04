package `5_estructuras_condicionales_aninandas`

fun main(){
  print("digite la cantidad total de preguntas")
  val totalpreguntas= readln().toInt()
  print("digite la cantidad de preguntas correctas")
    val correctas = readln().toInt()
    val porcentaje = 15
    (correctas.toDouble()/ totalpreguntas.toDouble())*100
    println("el porcentaje de respuesta correcta es: $porcentaje")

    if (porcentaje >= 90){
        print("nivel excelente")
    }else if (porcentaje >= 85){
        print("nivel bueno")
    }else if (porcentaje >=75){
        print("el es regular")
    }else{
        print("el nivel es insuficiente")
    }
}