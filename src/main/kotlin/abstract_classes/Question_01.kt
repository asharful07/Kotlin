

//Create an abstract class A with method display and Inherit a class B with override method sum

package abstract_classes
abstract class A{
    abstract fun sum()
    fun display(){
        println("Displaying...")
    }
}
 class B:A(){
    override fun sum(){
        println("Declaration...")
    }
}

fun main() {
 val obj=B()
    obj.display()
    obj.sum()
}