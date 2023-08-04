import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val tmp = readLine().toInt()

    repeat(tmp) {
        val (cnt, str) = readLine().split(" ")
        var result = ""

        for (i in 0 until str.toCharArray().size) {
            repeat(cnt.toInt()) {
                result += str[i]
            }
        }
        println(result)
    }
}