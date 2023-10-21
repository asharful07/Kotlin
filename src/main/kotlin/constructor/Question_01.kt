
// Multiply and add the two numbers using construtor
package constructor
class Calculator(a: Int, b: Int) {
    var num1 = a
    var num2 = b

    fun add():Int{
        return num1+num2
    }

    fun multiply():Int{
        return num1*num2
    }
}
fun main() {
    val obj = Calculator(5,10)
    println(obj.num1)
    println(obj.num2)
    println(obj.add())
    println(obj.multiply())
}
