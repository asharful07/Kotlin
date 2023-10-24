

// Handle an error using try and catch

package exception
import java.lang.Exception
fun main() {
    println("Enter a number:")
    val input = try {
        readLine()?.toInt()
    }catch (e:Exception){
        println("Error = You didn't enter an integer value")
    }
}