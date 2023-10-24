

// create your own Error

package exception
import java.lang.Exception
import exception.DivisionByZero as DivisionByZero

class DivisionByZero : Exception("Number can't Divide by Zero")
fun main() {
    println(divideNumber(5,0))
}
fun divideNumber(number:Int,divisor:Int):Int{
    if(divisor==0){
        throw DivisionByZero()
    }
    return number/divisor
}