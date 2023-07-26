import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val word = next()
    val tmp = nextInt()

    val char = word.toCharArray()
    val answer = char[tmp-1]

    print(answer)
}