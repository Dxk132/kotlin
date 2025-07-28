package `22_POO_contructor`

import `16_funciones_parametro_por_defecto`.nombressubrayados

class Libro(var nombre: String, var autor: String, var paginas: Int) {
    constructor() : this("", "", 0) {
        print("digite el nombre del libro: ")
        nombre = readln().toString()
        print("digite el nombre del autor de $nombre: ")
         autor = readln().toString()
        print("digite el numero de paginas de $nombre: ")
         paginas = readln().toInt()

    }
        fun leer(Paginas_leidas: Int): Int {
            print("digite la cantidad de paginas leidas de $nombre")
            val paginas_leidas = readln().toInt()
            val paginasfaltantes = paginas - paginas_leidas
            println("print la cantidad de paginas faltantes es de $paginasfaltantes  en el libro $nombre")
            return paginas_leidas
        }

        fun infolibro() {
            println("nombre del libro: $nombre")
            println("autor: $autor")
            println("paginas del libro: $paginas")
        }

}


fun main(){
    val libro1 = Libro()
    libro1.leer(0)
    libro1.infolibro()

    val libro2 = Libro()
    libro2.leer(0)
    libro2.infolibro()
}
