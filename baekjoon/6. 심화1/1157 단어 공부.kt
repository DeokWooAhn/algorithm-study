import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val word = readLine().uppercase()

    val alphabetCount = IntArray(26) // 알파벳 카운트를 저장하는 배열 초기화

    for (char in word) {
        if (char in 'A'..'Z') {
            alphabetCount[char - 'A']++
        }
    }

    val maxCount = alphabetCount.maxOrNull()!! // 가장 많이 사용된 알파벳의 빈도수

    if (alphabetCount.count { it == maxCount } > 1) {
        println("?") // 가장 많이 사용된 알파벳이 여러 개인 경우
    } else {
        val maxIndex = alphabetCount.indexOf(maxCount)
        println(('A' + maxIndex)) // 가장 많이 사용된 알파벳 출력
    }
}