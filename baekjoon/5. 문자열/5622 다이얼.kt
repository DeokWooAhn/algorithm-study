import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()

    val char = str.toCharArray()

    var ans = 0

    for (i in char.indices) {
        when (char[i]) {
            'A', 'B', 'C' -> ans += 3
            'D', 'E', 'F' -> ans += 4
            'G', 'H', 'I' -> ans += 5
            'J', 'K', 'L' -> ans += 6
            'M', 'N', 'O' -> ans += 7
            'P', 'Q', 'R', 'S' -> ans +=8
            'T', 'U', 'V' -> ans += 9
            'W', 'X', 'Y', 'Z' -> ans += 10
        }
    }
    print(ans)
}