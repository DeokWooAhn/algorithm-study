import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val scoreMap = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0,
    )

    var total = 0.0
    var totalScore = 0.0

    for (i in 0 until 20) {
        val info = readLine().split(" ")
        val score = info[1].toDouble()
        val grade = info[2]

        if (grade == "P") continue
        else {
            total += scoreMap[grade]!! * score
            totalScore += score
        }
    }

    print(total / totalScore)
}