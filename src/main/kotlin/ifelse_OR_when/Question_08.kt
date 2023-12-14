
// check user number is divisible by 2 or not

package ifelse_OR_when
fun main() {
    print("Enter a number: ")
    val num = readln()?.toInt()
    if (num != null) {
        if (num % 2 == 0) {
            println("$num is Divisible by 2 ")
        } else {
            println("$num is not Divisible by 2")
        }
    }
}