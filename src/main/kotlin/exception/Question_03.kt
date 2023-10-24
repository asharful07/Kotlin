

// create your own Error and handle it using try and catch

package exception
import java.lang.Exception
import exception.DivisionByZeroException as DivisionByZeroException
class DivisionByZeroException : Exception("Number can't Divide by Zero")
fun main() {
    println(divide(5,0))
}

fun divide(number:Int,divisor:Int):Int{
    if(divisor==0){
        try {
            throw DivisionByZeroException()
        }catch (e:DivisionByZeroException){
            println("Error: You can't divide an integer by Zero")
            return 0
        }
    }
    return number/divisor
}