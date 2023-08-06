import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine().split(" ")

    val num1 = str[0].reversed()
    val num2 = str[1].reversed()

    if (num1 > num2) {
        print(num1)
    } else print(num2)
}