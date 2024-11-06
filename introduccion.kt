// Función principal donde comienza la ejecución
fun main() {
    // Declaración de una variable inmutable (no se puede cambiar su valor)
    val nombre = "Juan"
    // Declaración de una variable mutable (su valor puede cambiar)
    var edad = 25

    // Imprimir el valor de las variables en consola
    println("Nombre: $nombre, Edad: $edad")

    // Llamada a una función para saludar
    saludar(nombre)

    // Condicional para verificar si la edad es mayor que 18
    if (edad > 18) {
        println("$nombre es mayor de edad.")
    } else {
        println("$nombre es menor de edad.")
    }

    // Bucle para imprimir los números del 1 al 5
    for (i in 1..5) {
        println("Número: $i")
    }

    // Creación de un objeto de la clase Persona
    val persona = Persona("Carlos", 30)
    // Llamada al método saludar del objeto persona
    persona.saludar()
}

// Definición de una función que toma un parámetro String
fun saludar(nombre: String) {
    println("Hola, $nombre!")
}

// Definición de una clase Persona
class Persona(val nombre: String, var edad: Int) {

    // Método dentro de la clase que imprime un saludo
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}
// Función que devuelve un valor
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Llamada a la función que suma dos números
    val resultado = sumar(5, 3)
    println("La suma es: $resultado")

    // Operador de rango para recorrer los números del 1 al 10
    for (i in 1..10) {
        println("Número: $i")
    }

    // Uso del rango exclusivo (sin el 10)
    for (i in 1 until 10) {
        println("Número (sin el 10): $i")
    }

    // Comprobando si un número está en un rango
    val numero = 7
    if (numero in 1..10) {
        println("$numero está en el rango de 1 a 10")
    }

    // Uso de "when", una alternativa a switch-case
    val dia = 3
    when (dia) {
        1 -> println("Es lunes")
        2 -> println("Es martes")
        3 -> println("Es miércoles")
        else -> println("Es otro día")
    }

    // Null safety: Kotlin previene errores de null
    var nombre: String? = null // Variable que puede ser null
    println(nombre?.length ?: "La variable es null") // Uso de safe call y el operador Elvis (?:)

    // Definición de una función lambda
    val multiplicar: (Int, Int) -> Int = { x, y -> x * y }
    println("Multiplicación: ${multiplicar(4, 5)}")

    // Uso de listas inmutables y mutables
    val listaInmutable = listOf(1, 2, 3, 4)
    // listaInmutable[0] = 10 // Esto da error porque es inmutable

    val listaMutable = mutableListOf(1, 2, 3)
    listaMutable.add(4) // Podemos modificar la lista mutable
    println("Lista mutable: $listaMutable")

    // Uso de Map (pares clave-valor)
    val mapa = mapOf("clave1" to "valor1", "clave2" to "valor2")
    println("Valor de clave1: ${mapa["clave1"]}")

    // Datos de una clase con un "data class"
    val persona = Persona("Maria", 28)
    val persona2 = persona.copy(nombre = "Ana") // Copiar el objeto y cambiar propiedades
    println(persona2)
}

// Data class para representar datos de una persona
data class Persona(val nombre: String, val edad: Int)
