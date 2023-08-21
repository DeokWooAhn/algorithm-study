import java.io.InputStreamReader
import java.util.*

fun main() = with(Scanner(InputStreamReader(System.`in`))) {
    val n = nextInt()
    val m = nextInt()

    val a = Array(n) {
        IntArray(m) {
            nextInt()
        }
    }

    val b = Array(n) {
        IntArray(m) {
            nextInt()
        }
    }

    val answer = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        for (j in 0 until m) {
            answer[i][j] = a[i][j] + b[i][j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
           print("${answer[i][j]} ")
        }
        println()
    }
}