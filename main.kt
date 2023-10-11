import kotlin.math.PI
import kotlin.math.pow

// Função para calcular a área de um retângulo
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

// Função para calcular a área de um círculo
fun calcularAreaCirculo(raio: Double): Double {
    return PI * raio.pow(2)
}

fun main() {
    // Criar uma forma de retângulo
    val baseRetangulo = 5.0
    val alturaRetangulo = 4.0

    // Criar uma forma de círculo
    val raioCirculo = 3.0

    // Calcular e imprimir a área do retângulo
    val areaRetangulo = calcularAreaRetangulo(baseRetangulo, alturaRetangulo)
    println("Área do Retângulo: $areaRetangulo")

    // Calcular e imprimir a área do círculo
    val areaCirculo = calcularAreaCirculo(raioCirculo)
    println("Área do Círculo: $areaCirculo")
}
