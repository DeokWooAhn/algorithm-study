import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val m = nextInt()

    val array = Array(n) { 0 }

    repeat(m) {
        val i = nextInt()
        val j = nextInt()
        val k = nextInt()

        for (tmp in i - 1 until  j ) {
            array[tmp] = k
        }
    }

    println(array.joinToString(" "))
}