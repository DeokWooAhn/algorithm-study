import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val size = nextInt()
    val array = Array(size) { 0 }
    var count = 0

    for (i in 0 until size) {
        array[i] = nextInt()
    }

    val tmp = nextInt()

    for (i in 0 until size) {
        if (array[i] == tmp) {
            count++
        }
    }

    print(count)
}
