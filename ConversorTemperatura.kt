fun main() {
    while (true) {
        println("Conversor de temperatura")
        println("1. Celsius a Fahrenheit")
        println("2. Fahrenheit a Celsius")
        println("0. Salir")

        print("Elige una opción: ")
        when (readLine()?.toIntOrNull()) {
            0 -> {
                println("Saliendo...")
                break
            }
            1 -> {
                print("Ingresa °C: ")
                val c = readLine()?.toDoubleOrNull() ?: 0.0
                println("$c °C = ${c * 9/5 + 32} °F")
            }
            2 -> {
                print("Ingresa °F: ")
                val f = readLine()?.toDoubleOrNull() ?: 0.0
                println("$f °F = ${(f - 32) * 5/9} °C")
            }
            else -> println("Opción inválida\n")
        }
    }
}
