fun main() {
    print("Ingresa un número (1-10): ")
    val n = readLine()?.toIntOrNull() ?: return

    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}
