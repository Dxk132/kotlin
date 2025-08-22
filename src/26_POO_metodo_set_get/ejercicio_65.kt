package `26_POO_metodo_set_get`

import java.util.*

class persona {
    var nombre: String = ""
        set(valor){
            field = valor.uppercase(Locale.getDefault())
        }
        get(){
            return "(" + field + ")"
        }

    var edad: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
        get(){
            return field
        }
}

fun main(){
    val persona1 = persona()
    persona1.nombre = "juan"
    persona1.edad= 23
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad= -50
    println(persona1.edad)
}