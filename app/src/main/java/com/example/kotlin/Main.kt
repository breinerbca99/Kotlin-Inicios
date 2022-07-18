package com.example.kotlin

fun main(){
    println("Hola Mundo")

    var a : Int = 2
    var b : Int = 3
    var c : Int = a + b
    println(c)

    // Clases
    val p1 : Persona = Persona("Breiner", "Correa")
    val p2 : Persona = Persona()
    p1.darBienvenida()
    p2.darBienvenida()

    p2.nombre = "Yeslit"
    p2.apellido = "Correa"
    p2.darBienvenida()

    // data Class
    val u1 = User("Breiner", 23)
    val u2 = u1.copy(edad = 22)
    println(u1)
    println(u2)
    println("Son iguales ? : ${u1 == u2}")

    // Constantes
    println(direccion)
    println(Constantes.direccion)

    // Enum
    println(DIAS.LUNES.numero)

    // Lista y Bucles
    var listaMutable = mutableListOf("Breiner","Roiser","Correa")
    var listaInmutable = listOf("Yeslit","Rosie","Correa")
    // println(listaInmutable.get(0))

    for ((index,value) in listaMutable.withIndex()){
        println("$index : $value")
    }

    listaInmutable.forEach{e -> println(e)}

    // When
    val x = 2
    when(x){
        1 -> {println("X es 1")}
        2 -> {println("X es 2")}
        2 -> {println("X es 3")}
        else -> {println("X no pertenece")}
    }

    // Nullabilidad
    val nombre: String? = null
    val e = nombre?.length ?: "Leonor".length
    println(e)

    // Genericos
    Elemento("hola mundo")

}

class Persona(var nombre:String = "", var apellido:String = ""){
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }
}

data class User(val nombre: String, val edad: Int)

const val direccion = "614 Jr Arequipa"

class Constantes{
    companion object {
        const val direccion = "25 de Febrero"
    }
}

enum class DIAS(val numero : Int) {
    LUNES(0),
    MARTES(1),
    MIERCOLES(2),
    JUEVES(3),
    VIERNES(4),
    SABADO(5),
    DOMINGO(6)
}

// Generico
class Elemento<T>(value: T){
    init{
        println("El valor es $value")
    }
}