import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val str = readLine()

    if (str == str.reversed()) {
        print(1)
    } else print(0)
}