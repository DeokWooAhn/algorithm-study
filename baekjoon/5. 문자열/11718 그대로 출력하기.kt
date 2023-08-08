import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        readLine()?.let { value ->
            if (value.isNotBlank()) {
                println(value)
            }
        } ?: break
    }
}