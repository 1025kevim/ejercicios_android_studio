import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 101)
    var intentos = 0

    while (true) {
        print("Adivina el número (1-100): ")
        val guess = readLine()?.toIntOrNull() ?: continue
        intentos++

        when {
            guess == numeroSecreto -> {
                println("¡Correcto! Lo adivinaste en $intentos intentos.")
                break
            }
            guess < numeroSecreto -> println("El número es mayor")
            else -> println("El número es menor")
        }
    }
}
