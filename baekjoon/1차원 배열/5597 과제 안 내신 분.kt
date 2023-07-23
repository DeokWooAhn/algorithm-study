import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val array = Array(30) { it + 1 }.toMutableList()

    for (i in 0 until 28) {
        val tmp = nextInt()
        if (tmp in array) {
            array.remove(tmp)
        }
    }
    println(array[0])
    println(array[1])
}