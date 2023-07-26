import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val m = nextInt()

    val array = Array(n) { it + 1 }

    repeat(m) {
        val i = nextInt()
        val j = nextInt()

        val tmp = array[i - 1]
        array[i - 1] = array[j - 1]
        array[j - 1] = tmp
    }

    println(array.joinToString(" "))
}