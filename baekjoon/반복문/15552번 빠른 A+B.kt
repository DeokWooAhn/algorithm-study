import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val a = nextToken().toInt()
            val b = nextToken().toInt()
            writer.write("${a + b}\n")
        }
    }
    writer.flush()
    writer.close()
    close()
}
