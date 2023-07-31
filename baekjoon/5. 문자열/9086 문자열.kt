import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val tmp = nextInt()
    val array = Array(tmp) { "" }

    for (i in 0 until tmp) {
        val str = next()
        array[i] = str.first() + str.last().toString()
    }

    for (i in 0 until tmp) {
        println(array[i])
    }
}