fun main() {
    print("Ingresa un número n: ")
    val n = readLine()?.toIntOrNull() ?: return

    for (x in n..99 step n) {
        var suma = 0
        for (i in 1 until x step 2) {
            suma += i
        }
        println("$x --> $suma")
    }
}
