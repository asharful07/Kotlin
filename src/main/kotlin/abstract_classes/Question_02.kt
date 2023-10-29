

// Print HELLO and Hi by abstract class

package abstract_classes
abstract class message{
    abstract fun result()
    fun display(){
        println("HELLO")
    }
}
class recieve: message() {
    override fun result() {
        println("HI")
    }

}
fun main() {
    val obj = recieve()
    obj.display()
    obj.result()

}