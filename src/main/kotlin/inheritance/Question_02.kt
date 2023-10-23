

// Create a base class cycle with method break & inherit a smart_cycle class with method speed
package inheritance
open class cycle{
    fun Break() {
        print("Breaking......")
    }
}
class smartCycle:cycle(){
 fun speed(){
     println("Racing.....")
 }
}
fun main() {
    val obj=smartCycle()
    obj.speed()
    obj.Break()
}
