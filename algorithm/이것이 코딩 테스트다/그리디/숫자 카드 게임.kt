import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    var answer = 0

    repeat(n) {
        val min = readLine().split(" ").map { it.toInt() }.min()
        if(min > answer) answer = min
    }

    print(answer)
}