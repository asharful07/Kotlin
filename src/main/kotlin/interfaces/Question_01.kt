

//create an interface A with method sum & extend the Class B by override the method sum
package interfaces
interface A{
    fun add()
}
class B: A {
    override fun add() {
        println("I am a override function of class B")
    }
}
fun main() {
    val obj=B()
    obj.add()
}