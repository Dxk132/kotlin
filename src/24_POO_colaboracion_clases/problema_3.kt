package `24_POO_colaboracion_clases`

class Motor {
    var encendido: Boolean = false
    fun encender() {
        encendido = true
        println("el motor esta encendido")
    }
    fun apagar() {
        encendido = false
        println("el motor esta apagado")
    }
    fun estado() {
        if (encendido) {
            println("el motor está encendido")
        } else {
            println("el motor está apagado")
        }
    }
}

