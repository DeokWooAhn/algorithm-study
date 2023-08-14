import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val tmp = readLine()
    var cnt = 0

    for (i in 1..tmp.toInt()) {
        val str = readLine()
        if (isGroupWord(str)) {
            cnt++
        }
    }
    println(cnt)
}

fun isGroupWord(word: String): Boolean {
    val visited = mutableSetOf<Char>()

    for (i in word.indices) {
        if (visited.contains(word[i])) {
            if (i > 0 && word[i] != word[i - 1]) {
                return false
            }
        } 
        else {
            visited.add(word[i])
        }
    }

    return true
}