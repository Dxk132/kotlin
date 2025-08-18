package `25_POO_modificadores_private_&_publi`

class sensorTemperatura{
    private var temperatura:Double = 000.0
    fun configurar_temperatura(valor:Double){
        validar_Rango(valor)
    }
    private fun validar_Rango(valor:Double){
        if (valor in -50.0..150.0){
            temperatura += valor
        }else if (valor !in -50.0..150.0)
            println(" error con la temperatura")
    }

    fun aumentarDelta(delta:Double){
        if (delta in -50.0..150.0)
        temperatura += delta
    }

    fun disminuirDelta(delta: Double){
        if (delta in -50.0..150.0)
        temperatura -= delta
    }

    fun mostrar(){
        if (temperatura in -50.0..150.0){
            print("$temperatura")
        }else
            println(" error con la temperatura")

    }

}

fun  main(){
    var sensor1 = sensorTemperatura()
    sensor1.configurar_temperatura(100.0)
    sensor1.aumentarDelta(30.0)
    sensor1.disminuirDelta(14.0)
    sensor1.mostrar()
    
}