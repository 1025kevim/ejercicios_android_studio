fun main() {
    while (true) {
        println("Menú Calculadora")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("0. Terminar")

        print("Elige una opción: ")
        val opcion = readLine()?.toIntOrNull() ?: -1

        if (opcion == 0) {
            println("Saliendo...")
            break
        }

        if (opcion !in 1..4) {
            println("Opción inválida\n")
            continue
        }

        print("Ingresa el primer número: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0

        print("Ingresa el segundo número: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0

        when (opcion) {
            1 -> println("Resultado: ${a + b}")
            2 -> println("Resultado: ${a - b}")
            3 -> println("Resultado: ${a * b}")
            4 -> {
                if (b == 0.0) println("Error: no se puede dividir entre cero")
                else println("Resultado: ${a / b}")
            }
        }
        println()
    }
}
