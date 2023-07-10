import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val aDice = nextInt()
    val bDice = nextInt()
    val cDice = nextInt()

    if (aDice == bDice && bDice == cDice) {
        print(10000 + aDice * 1000)
    } else if (aDice == bDice || aDice == cDice) {
        print(1000 + aDice * 100)
    } else if (bDice == cDice) {
        print(1000 + bDice * 100)
    } else {
        print(listOf(aDice, bDice, cDice).maxOrNull()!! * 100)
    }
}
