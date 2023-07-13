import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    var count = 0
    var answer = 0

    for(i in list) {
        count += 1
        if(count >= i) {
            count = 0
            answer++
        }
    }

    print(answer)
}