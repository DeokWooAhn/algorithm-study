import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val num = nextInt()
    val tmp = num / 4
    var answer = ""

    for (i in 1..tmp) {
        answer += "long "
    }

    print("${answer}int")
}
