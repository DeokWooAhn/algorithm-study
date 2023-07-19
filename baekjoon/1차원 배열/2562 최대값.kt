import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val array = Array(9) { 0 }
    for (i in 0 until 9) {
        array[i] = nextInt()
    }

    println(array.maxOrNull())
    println(array.indexOf(array.maxOrNull()) + 1)
}