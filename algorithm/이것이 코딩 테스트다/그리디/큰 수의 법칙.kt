import java.io.InputStreamReader
import java.io.BufferedReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val nArr = readLine().split(" ").map { it.toInt() }.sorted()

    val max = nArr[n-1]
    val maxMinusOne = nArr[n-2]

    var answer = 0

    repeat(m) {
        answer += if((it+1) % k == 0) maxMinusOne else max
    }

    print(answer)
}