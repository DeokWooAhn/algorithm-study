import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val m = nextInt()

    var array = IntArray(n){ it + 1 }

    repeat(m) {
        var i = nextInt()
        var j = nextInt()

        while (i < j) {
            val tmp = array[i-1]
            array[i-1] = array[j-1]
            array[j-1] = tmp
            i++
            j--
        }
    }

    print(array.joinToString(" "))
}