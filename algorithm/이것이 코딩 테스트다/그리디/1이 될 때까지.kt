import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, k) = readLine().split(" ").map { it.toInt() }
    var answer = 0

    while(n != 1) {
        if(n % k == 0) n /= k else n -= 1
        answer++
    }

    print(answer)
}