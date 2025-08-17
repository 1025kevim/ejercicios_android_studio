fun main() {
    print("Ingresa un número: ")
    val n = readLine()?.toIntOrNull() ?: return

    var fact = 1L
    for (i in 1..n) {
        fact *= i
    }
    println("El factorial de $n es $fact")
}
