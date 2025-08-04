package `24_POO_colaboracion_clases`

class estudiante(var nombre:String, var asistencia:Int){
    fun registrar_asistencia(){
       asistencia+= 1
    }
    fun Imprimir(){
        println("el estudiante $nombre tiene una asistencia de $asistencia")
    }
}
class clase(){
    var estudiante1 = estudiante("joseMaria", 0)
    var estudiante2 = estudiante("Antonio", 2)
    var estudiante3 = estudiante("sebastian",1)
    fun marcar_Asistencia(){
        estudiante1.registrar_asistencia()
        estudiante2.registrar_asistencia()
        estudiante3.registrar_asistencia()
    }
    fun reporte(){
        estudiante1.Imprimir()
        estudiante2.Imprimir()
        estudiante3.Imprimir()
    }
}
fun main(){
    val clase1 = clase()
    clase1.marcar_Asistencia()
    clase1.reporte()
}