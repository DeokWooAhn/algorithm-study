import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine().split(" ")
    var cnt = 0

    for (i in str) {
        if (i == "") {
            cnt++
        }
    }

    val ans = str.size - cnt

    print(ans)
}