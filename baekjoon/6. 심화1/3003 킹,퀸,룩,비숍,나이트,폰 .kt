import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var king = 1
    var queen = 1
    var look = 2
    var beshop = 2
    var knight = 2
    var phon = 8

    val tmp = readLine().split(" ")

    king -= tmp[0].toInt()
    queen -= tmp[1].toInt()
    look -= tmp[2].toInt()
    beshop -= tmp[3].toInt()
    knight -= tmp[4].toInt()
    phon -= tmp[5].toInt()

    println("$king $queen $look $beshop $knight $phon")
}