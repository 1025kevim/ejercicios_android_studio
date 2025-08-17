fun main() {
    val filas = 5
    for (i in 1..filas) {
        for (j in 1..i) print("$j ")
        for (j in i - 1 downTo 1) print("$j ")
        println()
    }
}
