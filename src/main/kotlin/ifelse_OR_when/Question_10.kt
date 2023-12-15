

//Use of When

package ifelse_OR_when
fun main(){
    print("Enter a number: ")
    val num = readln()?.toInt()
    val number = when(num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $number")
}