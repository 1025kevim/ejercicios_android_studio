fun main() {
    print("¿Cuántos términos de Fibonacci deseas?: ")
    val n = readLine()?.toIntOrNull() ?: return

    var a = 0
    var b = 1

    for (i in 1..n) {
        print("$a ")
        val suma = a + b
        a = b
        b = suma
    }
    println()
}
