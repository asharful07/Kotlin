
// Check the Given string is palindrome or not

package basics
fun main(){
    val string = "madam"
    if(string.equals(string.reversed()))
        println("$string:is a palindrome string")
    else
        println("$string:is not a palindrome string")
}