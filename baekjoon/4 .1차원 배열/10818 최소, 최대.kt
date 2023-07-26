import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val tmp = nextInt()
    val array = Array(tmp) { 0 }

    for (i in 0 until tmp) {
        array[i] = nextInt()
    }

    print("${array.minOrNull()}" + " " + "${array.maxOrNull()}" )
}
