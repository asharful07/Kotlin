

// Print the Fibonacci Series

package loops
fun main() {
    print("Enter a term: ")
    val term = readLine()?.toInt()
    var n = 0
    var n1 = 0
    var n2 = 1
    val list = mutableListOf<Int>()
    if (term != null) {
        for (i in 1..term) {
            if (i == 1) {
                list.add(n1)
            } else if (i == 2) {
                list.add(n2)
            } else {
                list.add(n1 + n2)
                n = n1
                n1 = n2
                n2 = n1 + n
            }

        }
        println(list)
    }
}