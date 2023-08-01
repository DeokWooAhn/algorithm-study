import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val str = next()
    val array = IntArray(26) { -1 }

    for (i in str.indices) {
        val tmp = str[i] - 'a'

        if (array[tmp] == -1) {
            array[tmp] = i
        }
    }

    print(array.joinToString ( " " ))
}