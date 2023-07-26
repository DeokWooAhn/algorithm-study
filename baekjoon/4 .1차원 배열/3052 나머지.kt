import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`)) {

    val array = ArrayList<Int>()

    repeat(10) {
        val tmp = nextInt()
        if (tmp % 42 !in array) {
            array.add(tmp % 42)
        }
    }
    print(array.count())
}