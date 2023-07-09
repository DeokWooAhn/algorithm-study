import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val hour = nextInt()
    val min = nextInt()
    val time = nextInt()
    var realHour = hour + (min + time) / 60
    val realMin = (min + time) % 60

    if (realHour >= 24) {
        realHour %= 24
    }

    print("$realHour $realMin")
}
