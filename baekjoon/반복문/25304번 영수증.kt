import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val total = nextInt()
    val kind = nextInt()

    var kindTotal = 0

    for (i in 0 until kind) {
        val cost = nextInt()
        val count = nextInt()

        kindTotal += (cost.toInt() * count.toInt())
    }

    if (total == kindTotal) {
        print("Yes")
    } else {
        print("No")
    }
}
